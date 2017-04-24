package ch18.exam29.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ServerController implements Initializable {

	public static ServerController instance; 
        // 외부에서 이 객체에 접근하기 위해 사용 // 중요하다
        // static을 사용해 다른 클래스 파일에서도 접근 가능
	@FXML
	private Button btnStartStop;
	@FXML
	private TextArea txtDisplay;
        // UI fx:id
        
	private ExecutorService executorService;
        // Thread pool
        
	private ServerSocket serverSocket;
        // 클라이언트에서 넘어올 연결을 확인하고 내부 socket과 연결해줄 serverSocket
        
	private List<Client> connection = new Vector<Client>();
        // 싱크로나이즈를 맞추기 위해 Vector를 사용해 여러 클라이언트의 연결 관리
        
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		ServerController.instance = this; 
                // 자기자신의 참조를 static을 이용해 다른 클래스에서 참조를 얻을 수 있다.
                // this는 자기자신을 나타낸다. (**싱클톤의 getInstnace**)
                
		btnStartStop.setOnAction(e -> handleBtnStartStop(e));
	}

	private void handleBtnStartStop(ActionEvent e) {
                // 하나의 버튼에 상황마다(start/stop) 다른 텍스트 사용
		if (btnStartStop.getText().equals("start")) {
			startServer();
		} else if (btnStartStop.getText().equals("stop")) {
			stopServer();
		}
	}
        // 서버를 시작하는 메소드
	private void startServer() {
		executorService = Executors.newFixedThreadPool(100);
                // 100개의 스레드가 돌아가는 스레드풀 생성
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.3.22", 50001));
                        // 서버자신의 IP와 50001번 포트로 bind
		} catch (IOException ex) {
			stopServer();
			return;
                        // 예외가 발생하면 서버를 정지하고 메소드 종료
		}

		// 연결 수락 작업 하나의 thread로 사용
		Runnable acceptTask = () -> {
			Platform.runLater(() -> {
				btnStartStop.setText("stop");
				display("Server start~~~");
                                // UI 변경작업을 JavaFX Application Thread가 처리하도록 실행
			});
			while (true) {
				try {
					Socket socket = serverSocket.accept();
                                        // server socket으로 받아들인 연결을 socket에 저장
					String clientInfo = "[연결 수락 : " + socket.getRemoteSocketAddress() + "]";
                                        // getRemoteSocketAddress로 소켓으로 들어온 정보 출력
					Platform.runLater(() -> {
						display(clientInfo);
                                                // UI 변경작업을 JavaFX Application Thread가 처리하도록 실행
					});
					// 통신용 client 객체 생성
					Client client = new Client(socket);
					//Vector에 Client 저장
					connection.add(client);
					//총 Client수 출력
					Platform.runLater(() -> {
						display("[연결 개수 : " + connection.size() + "]");
                                                // UI 변경작업을 JavaFX Application Thread가 처리하도록 실행
					});
				} catch (IOException ex) {
					stopServer();
					break;
				}
			}
		};
		// 스레드풀 작업큐에 연결수락작업 넣기
		executorService.submit(acceptTask);
	}

	public void stopServer() {
		try {
			// how1
//			for(Client client : connection){
//				client.socket.close();
//			}
//			connection.clear();
			// how2
			Iterator<Client> iterator = connection.iterator();
			while (iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove(); // 이 클라이언트를 벡터에서 제거하는 코드
			}
                        // 연결이 끊어진(통신 불가) 클라이언트 객체들을 벡터에서 찾아내고 제거한다.
                        // 제거하지 않으면 read단계에서 멈춰져 있어 스레드풀을 정지하지 못한다 
			executorService.shutdownNow();
                        // 스레드풀을 종료
			serverSocket.close();
		} catch (IOException ex) {
			System.out.println("찾을수 없는 예외 발생.");
		}
		Platform.runLater(() -> {
			//System.out.println("Server-stopServer()");
			btnStartStop.setText("start");
			display("Server stop~~~");
                        // UI 변경작업을 JavaFX Application Thread가 처리하도록 실행
		});
	}

	private void display(String text) {
		txtDisplay.appendText(text + "\n");
                // 채팅상황에 맞게 텍스트들을 추가하는식으로 디스플레이에 나타낸다
	}

	class Client {

		Socket socket;

		public Client(Socket socket) {
			this.socket = socket;
			receive();
		}

		void receive() {
			// 받기 작업 정의 // 작업스레드 시작
			Runnable receiveTask = () -> {
				try {
					while (true) {
						InputStream inputStream = socket.getInputStream();
						byte[] byteArr = new byte[100];
						int readbytes = inputStream.read(byteArr);
                                                // 예외가 발생하기 전까지 여기서 대기하고 있어 스레드풀을 종료할 수 없다.
						if (readbytes == -1) {
							throw new Exception();
						}
						String strData = new String(byteArr, 0, readbytes);
						for (Client client : connection) {
							client.send(strData);
                                                        // vector에서 클라이언트들에게 하나씩 데이터들을 전송
						}
						//inputStream.close();
					}
				} catch (Exception e) {
					try {
						String clientInfo = "[연결 끊김 : " + socket.getRemoteSocketAddress() + "]";
						Platform.runLater(() -> {
							display(clientInfo);
                                                        // UI 변경작업을 JavaFX Application Thread가 처리하도록 실행
						});
						this.socket.close();
						connection.remove(Client.this);
						Platform.runLater(() -> {
							display("[연결 개수 : " + connection.size() + "]");
                                                        // UI 변경작업을 JavaFX Application Thread가 처리하도록 실행
						});
					} catch (IOException ex) {
					}
				}
			};
			executorService.submit(receiveTask);
		}

		void send(String message) {
			try {
				OutputStream outputStream = socket.getOutputStream();
				byte[] byteArr = message.getBytes();
				outputStream.write(byteArr);
				outputStream.flush();
				//outputStream.close();
			} catch (IOException ex) {
				connection.remove(Client.this);
				try {
					socket.close();
				} catch (IOException ex1) {
				}
			}
		}
	}
}
