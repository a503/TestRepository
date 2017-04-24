package ch18.exam29.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClientController implements Initializable {

	@FXML
	private Button btnConn;
	@FXML
	private TextField txtInput;
	@FXML
	private Button btnSend;
	@FXML
	private TextArea txtDisplay;

	private Socket socket;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnConn.setOnAction(e -> handleBtnConn(e));
		btnSend.setOnAction(e -> handleBtnSend(e));
	}

	private void handleBtnConn(ActionEvent e) {
                // 하나의 버튼에 상황마다(start/stop) 다른 텍스트 사용
		if (btnConn.getText().equals("Connect")) {
			startClient();
		} else if (btnConn.getText().equals("Disconnect")) {
			stopClient();
		}
	}

	private void handleBtnSend(ActionEvent e) {
		send(txtInput.getText());
	}

	private void startClient() {
		// 서버에 연결하기
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					// 소켓 생성(클라이언트)
					socket = new Socket();
					// 서버와 연결하기
					socket.connect(new InetSocketAddress("192.168.3.30", 50001));
					// 연결 성고 출력하기
					Platform.runLater(() -> {
						display("[연결 성공]");
						btnConn.setText("Disconnect");
					});
					// 데이터 받기
					receive();
				} catch (Exception ex) {
					Platform.runLater(() -> {
						display("[연결 실패했다규]");
						stopClient(); // stopClient()를 실행하는 스레드를 통일하기 위해 runLater()에 넣어준다
					});
					return;
				}
			}
		};
		thread.start();
	}

	private void stopClient() {
		try {
			socket.close();
		} catch (IOException ex) {

		}
		btnConn.setText("Connect");
		display("연결 끊김 c-1");
	}

	private void display(String text) {
		txtDisplay.appendText(text + "\n");
	}

	private void receive() {
		try {
			while (true) {
                                // 서버로부터 넘어온 데이터를 받는곳
				InputStream inputStream = socket.getInputStream();
				byte[] byteArr = new byte[100];
				int readbytes = inputStream.read(byteArr);
				if (readbytes == -1) {
					throw new Exception();
				}
				String message = new String(byteArr, 0, readbytes);
				Platform.runLater(() -> {
					display(message);
				});
				//inputStream.close();
			}
		} catch (Exception e) {
			Platform.runLater(() -> {
				//display("연결 끊김 c-2");
				stopClient();
			});
		}
	}

	private void send(String message) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
                                        // 서버로 메세지를 전달하는곳
					OutputStream outputStream = socket.getOutputStream();
					byte[] byteArr = message.getBytes();
					outputStream.write(byteArr);
					outputStream.flush();
					//outputStream.close();
				} catch (IOException ex) {
					try {
						socket.close();
					} catch (IOException ex1) {
					}
				}
			}
		};
		thread.start();
	}
}
