package ch17.exam42;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class LoginController implements Initializable {

	@FXML
	private BorderPane login;
	@FXML
	private Button btnMain;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnMain.setOnAction(e -> {
			handleBtnMain(e);
		});
	}

	private void handleBtnMain(ActionEvent e) {
		StackPane rootPane = (StackPane) btnMain.getScene().getRoot();

		login.setOpacity(1); // 초기값
		
		KeyValue keyValue = new KeyValue(login.opacityProperty(), 0);
		KeyFrame keyFrame = new KeyFrame(Duration.seconds(1),
				event -> {
					rootPane.getChildren().remove(login);
				}, keyValue);
		Timeline timeline = new Timeline();
		timeline.getKeyFrames().add(keyFrame); // Animation을 동시에 여러개 진행시킬 수 있다
		timeline.play();
	}

}
