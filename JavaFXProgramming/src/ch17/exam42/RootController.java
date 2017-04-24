package ch17.exam42;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class RootController implements Initializable {

	@FXML
	private Button btnLogin;
	@FXML
	private StackPane stackPane;
	
	public static StackPane rootPane;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		rootPane = stackPane;
		btnLogin.setOnAction(e->{
			handleBtnLogin(e);
		});
	}	

	private void handleBtnLogin(ActionEvent e) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("login.fxml"));
			stackPane.getChildren().add(parent);
			
			parent.setTranslateX(350); // 초기값
			KeyValue keyValue = new KeyValue(parent.translateXProperty(), 0); // 무엇을? : translateXProperty, 0(종료값)
			KeyFrame keyFrame = new KeyFrame(Duration.seconds(1), keyValue);
			Timeline timeline = new Timeline();
			timeline.getKeyFrames().add(keyFrame); // Animation을 동시에 여러개 진행시킬 수 있다
			
			timeline.play();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
	
}
