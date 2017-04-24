package ch17.exam41;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class LoginController implements Initializable {

	@FXML
	private BorderPane login;
	@FXML
	private Button btnMain;


	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnMain.setOnAction(e->{
			handleBtnMain(e);
		});
	}	

	private void handleBtnMain(ActionEvent e) {
		// how1
		//RootController.rootPane.getChildren().remove(login);
//		Scene scene = btnMain.getScene();
//		StackPane stackPane = (StackPane) scene.getRoot();
		// 한줄로 표현
		StackPane rootPane = (StackPane) btnMain.getScene().getRoot();
		rootPane.getChildren().remove(login); // index Num으로 지우면 나중에 헷갈릴수 있으므로 객체를 찾아 삭제한다. 
		
	}
	
}
