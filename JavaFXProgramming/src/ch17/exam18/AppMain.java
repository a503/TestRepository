package ch17.exam18;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));

        Scene scene = new Scene(parent);

        primaryStage.setOnCloseRequest((e) -> {
            System.out.println("프로그램이 종료됩니다.");
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Test"); // 창 제목 바꾸기.
        primaryStage.show();
    }
}
