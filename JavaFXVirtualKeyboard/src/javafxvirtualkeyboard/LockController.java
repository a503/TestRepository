/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxvirtualkeyboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author kang
 */
public class LockController implements Initializable {
	@FXML
	private Button btnUnlock;
	@FXML
	private StackPane stackPaneLock;
	@FXML
	private TextField test;
	

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		test.getProperties().put("vkType", "numeric");
	}	

}
