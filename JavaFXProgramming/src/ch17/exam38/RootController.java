package ch17.exam38;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class RootController implements Initializable {
	
	@FXML
	private ProgressBar progressBar;
	@FXML
	private Label label;
	@FXML
	private Label lblWorkDone;
	@FXML
	private Label lblResult;
	@FXML
	private Button btnStart;
	@FXML
	private Button btnStop;
	
	private Task<Integer> task;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnStart.setOnAction(e -> handleBtnStart(e));
		btnStop.setOnAction(e -> handleBtnStop(e));
	}
	
	private void handleBtnStart(ActionEvent e) {
		task = new Task<Integer>() {
			@Override
			protected Integer call() throws Exception {
				int result = 0;
				for(int i=0 ; i <= 100 ; i++){
					result += i;
//					updateProgress(i, 100); // task안에 있는 progress속성의 값을 수정하는 역할. updateProgress(수정할 값, Max 값)
//					updateMessage(String.valueOf(i)); // task가 가지고 있는 method
					double value = i;
					int result2 = result;
					//Thread.sleep(100);
					Platform.runLater(()->{
						progressBar.setProgress(value/100);
						lblWorkDone.setText(String.valueOf(value));
						lblResult.setText(String.valueOf(result2));
					});
					if(isCancelled()) break;
					try{
						Thread.sleep(100);
					}catch(Exception e){
						break;
					}
				}
				return result;
			}

			@Override
			protected void succeeded() {
				lblResult.setText(String.valueOf(getValue()));
			}

			@Override
			protected void cancelled() {
				lblResult.setText("작업 취소됨");
			}

			@Override
			protected void failed() {
				System.out.println("failed " + Thread.currentThread().getName());
			}
			
			
		};
		// Platform.runLater를 사용하면 바인딩 필요없음
//		progressBar.progressProperty().bind(task.progressProperty()); // 테스크의 progressProperty를 감시해서 자신의 progress와 바인딩
//		lblWorkDone.textProperty().bind(task.messageProperty()); // 테스크의 messageproperty와 label에 textproperty와 바인딩
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
	}
	
	private void handleBtnStop(ActionEvent e) {
		task.cancel();
	}
	
}
