package ch17.exam28;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {
    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void handleOpenFileChooser(ActionEvent event) {
        FileChooser fc = new FileChooser();      
        File file = fc.showOpenDialog(AppMain.primaryStage); // primary stage의 참조가 들어와야 한다. main의 primary stage를 가져와야 한다.
        // how1 main에서 primarystage를 스택틱 필드의 값으로 저장해스태이지를 가져온다.
        if(file == null) return;
        System.out.println(file.getPath());
    }

    @FXML
    private void handleSaveFileChooser(ActionEvent event) {
        FileChooser fc = new FileChooser(); 
        File file = fc.showSaveDialog(primaryStage);
        // how2 controller에서 primaryStage를 받아오는 setter를 생성해 stage를 가져온다. (정석 방법)
    }

    @FXML
    private void handleDirectoryChooser(ActionEvent event) {
        DirectoryChooser dc = new DirectoryChooser();
//        Button button = (Button) event.getSource(); // how3
//        Scene scene = button.getScene(); // how3
//        Stage stage = (Stage) scene.getWindow(); // how3
        File file = dc.showDialog(((Button) event.getSource()).getScene().getWindow()); // how3 간략화
        // how3 컨트롤이 속해있는 scene을 얻고 그 scene이 속해있는 stage정보 가져오기
    }

    @FXML
    private void handlePopup(ActionEvent event) throws IOException {
        //showNotification("알림","메시지가 도착했습니다.");
        showNotification("경고","경고 발생");
    }
    private void showNotification(String type, String message) throws IOException{
        Popup popup = new Popup();
        HBox hbox = (HBox) FXMLLoader.load(getClass().getResource("popup.fxml"));
        ImageView imgMessage = (ImageView)hbox.lookup("#imgMessage");
        Label lblMessage = (Label)hbox.lookup("#lblMessage");
        
        if(type.equals("알림")){
            imgMessage.setImage(new Image(getClass().getResource("images/dialog-info.png").toString()));
        }else if(type.equals("경고")){
            imgMessage.setImage(new Image(getClass().getResource("images/dialog-warning.png").toString()));
        }
        lblMessage.setText(message);
        
        popup.getContent().add(hbox);
        popup.setAutoHide(true);
        popup.show(AppMain.primaryStage);
    }

    @FXML
    private void handleCustom(ActionEvent event) throws IOException {
        //showCustomDialog("info", "확인하셨슴꽈?"); // info, warning, help, error
        showCustomDialog("error", "에러 발생");
        //showCustomDialog("warning", "경고 발생");
        //showCustomDialog("help", "도움말");
    }
    private void showCustomDialog(String type, String message) throws IOException{
        Stage dialog = new Stage(StageStyle.UNIFIED); // stageStyle에 따라 다양한 다이얼로그 생성 가능
        Parent parent = FXMLLoader.load(getClass().getResource("custom-dialog.fxml"));
        
        ImageView icon = (ImageView) parent.lookup("#icon");
        Label lblMessage = (Label) parent.lookup("#message");
        Button btnOk = (Button) parent.lookup("#btnOk");
        
        if(type.equals("info")){
            icon.setImage(new Image(getClass().getResource("images/dialog-info.png").toString()));
        }else if(type.equals("warning")){
            icon.setImage(new Image(getClass().getResource("images/dialog-warning.png").toString()));
        }else if(type.equals("error")){
            icon.setImage(new Image(getClass().getResource("images/dialog-error.png").toString()));
        }else if(type.equals("help")){
            icon.setImage(new Image(getClass().getResource("images/dialog-help.png").toString()));
        }
        lblMessage.setText(message);
        
        btnOk.setOnAction(e->{
            dialog.hide();
        });
        
        Scene scene = new Scene(parent); // scene 생성
        scene.setFill(Color.TRANSPARENT);
        dialog.setScene(scene); // stage에 scene등록
        dialog.initModality(Modality.WINDOW_MODAL); // modal 설정
        dialog.initOwner(AppMain.primaryStage); // 소유자 윈도우 등록
        
        dialog.show();
    }
    
}
