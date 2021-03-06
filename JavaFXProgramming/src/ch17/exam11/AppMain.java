package ch17.exam11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
        
        Scene scene = new Scene(parent);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("로그인"); // 창 제목 바꾸기.
        primaryStage.show();
    }
}
