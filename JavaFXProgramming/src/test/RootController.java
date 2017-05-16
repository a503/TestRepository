/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author kang
 */
public class RootController implements Initializable {

	@FXML
	private Button button;
	@FXML
	private Label label;
	@FXML
	private ToggleSwitch toggleSwitch;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	

	@FXML
	private void handleButtonAction(ActionEvent event) {
		toggleSwitch.switchedOnProperty().set(true);
	}
	
}
