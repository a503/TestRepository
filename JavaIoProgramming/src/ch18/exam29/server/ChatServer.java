package ch18.exam29.server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class ChatServer extends Application{

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("server.fxml"));
        //parent.getStylesheets().add(getClass().getResource("root.css").toString()); // 외부CSS파일을 가져와 parent에 적용
        
        Scene scene = new Scene(parent);
        
        
        primaryStage.setOnCloseRequest((e) -> {
			ServerController.instance.stopServer();
            System.out.println("Server Quit.");
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Chatting Server");
        primaryStage.show();
    }
	
    
}
