package ch17.exam25;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController implements Initializable {

    @FXML
    private MediaView mediaView;
    @FXML
    private Button btnPlay;
    @FXML
    private Button btnPause;
    @FXML
    private Button btnStop;
    @FXML
    private Slider sliderVolume;
    @FXML
    private Slider sliderTime;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private ProgressIndicator progressIndicator;
    @FXML
    private Label labelTime;

    private boolean endOfMedia;
    private int totalTime;
    private int minute;
    private int seconds;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Media media = new Media(getClass().getResource("media/video.m4v").toString());
        
//        File file = new File("C:/Temp/bi.mp4");
//        URI uriPath = file.toURI();
//      //  System.out.println(uriPath);
//        Media mediaTest = new Media(uriPath.toString());
        
        //Media media = new Media(getClass().getResource("media/audio.wav").toString());
        //System.out.println(file.getPath());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        //MediaPlayer mediaPlayer = new MediaPlayer(mediaTest);
        mediaView.setMediaPlayer(mediaPlayer);

        mediaPlayer.setOnReady(() -> {
            btnPlay.setDisable(false);
            btnPause.setDisable(true);
            btnStop.setDisable(true);
            labelTime.setText(0 + "/" + minute + "분" + seconds + "초");
        });
        mediaPlayer.setOnPlaying(() -> {
            btnPlay.setDisable(true);
            btnPause.setDisable(false);
            btnStop.setDisable(false);
        });
        mediaPlayer.setOnPaused(() -> {
            btnPlay.setDisable(false);
            btnPause.setDisable(true);
            btnStop.setDisable(false);
        });
        mediaPlayer.setOnStopped(() -> {
            btnPlay.setDisable(false);
            btnPause.setDisable(true);
            btnStop.setDisable(true);
        });
        mediaPlayer.setOnEndOfMedia(() -> {
            btnPlay.setDisable(false);
            btnPause.setDisable(true);
            btnStop.setDisable(true);

            endOfMedia = true;

            progressBar.setProgress(1.0);
            progressIndicator.setProgress(1.0);
        });

        btnPlay.setOnAction(e -> {
            if (endOfMedia) {
                mediaPlayer.stop();
                mediaPlayer.seek(mediaPlayer.getStartTime());
            }
            mediaPlayer.play();
            endOfMedia = false;
        });
        btnPause.setOnAction(e -> mediaPlayer.pause());
        btnStop.setOnAction(e -> mediaPlayer.stop());

        sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                mediaPlayer.setVolume(newValue.doubleValue() / 100.0);
            }
        });
        sliderVolume.setValue(50.0);

        // sliderTime(동영상에 재생시간을 조정하기 위한 슬라이더), Slider의 값이 변할때 속성감시를 통해 
        sliderTime.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if (sliderTime.isPressed()) { // isPressed메소드를 이용해 Thumbs가 마우스에 의해 클릭(DOWN)되면 아래의 코드가 실행되게 했다 | 조건문으로 아래의 코드가 특정상황에서 실행되지 않으면 두개의 리스너가 번갈아서 실행되면서 동영상에 렉이 걸린다.
                    // isValueChanging() -> 마우스로 값을 실제로 바꿀려고 하고있느냐? 뭍는거
                    double value = (newValue.doubleValue() / 100.0) * (mediaPlayer.getTotalDuration().toSeconds());
                    // 슬라이더의 값의 범위가 0~100이므로 미디어의 총시간과 100으로 나눈 슬라이더의 값을 곱해서 슬라이더의 값에 따른 미디어의 재생시간을 설정했다. 
                    mediaPlayer.seek(Duration.seconds(value));
                    // mediaPlayer의 seek메소드를 이용해 위에서 구해둔 값으로 미디어의 재생시간을 설정
                    System.out.println("Test Value : " + (newValue.doubleValue()-oldValue.doubleValue()));
                }
            }
        });
        // 미디어플레이어의 재생시간의 속성을 감시
        mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
            @Override
            public void changed(ObservableValue<? extends Duration> observable, Duration oldValue, Duration newValue) {
                double progress = newValue.toSeconds() / mediaPlayer.getTotalDuration().toSeconds();
                // sliderTime의 값을 미디어가 재생됨에 따라 변화하게 하는 코드  
                //------------------------------------------------------------------------------------------
                double value = (100 / mediaPlayer.getTotalDuration().toSeconds()) * newValue.toSeconds(); // 미디어플레이어에서 시간이 변화하는것에 따라 슬라이더의 값이 자동으로 변하도록 설정하는 코드 
                sliderTime.setValue(value);
                // -----------------------------------------------------------------------------------------

                // 밑으로는 과제와 상관없는 코드, 수업시간에 동영상 진행상황 보여주는 코드
                progressBar.setProgress(progress);
                progressIndicator.setProgress(progress);
                totalTime = (int) mediaPlayer.getTotalDuration().toSeconds();
                minute = (int) totalTime / 60;
                seconds = (int) totalTime % 60;
                labelTime.setText((int) newValue.toSeconds() + "초" + "/" + minute + "분" + seconds + "초");
            }
        });
    }

}
