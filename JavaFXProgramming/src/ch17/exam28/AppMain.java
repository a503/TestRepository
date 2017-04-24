package ch17.exam28;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{
    public static Stage primaryStage;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        AppMain.primaryStage = primaryStage;
        //Parent parent = FXMLLoader.load(getClass().getResource("root.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("root.fxml")); // 이 방식으로 loader를 별도로 얻을 수 있다. 기존의 방식과 결과는 같지만 기존의 방식은 loader를 따로 얻을 수 없다.
        Parent parent = loader.load();
        RootController controller = loader.getController(); // 컨트롤러의 객체를 리턴한다.
        controller.setPrimaryStage(primaryStage);
        
        Scene scene = new Scene(parent);
        
        primaryStage.setOnCloseRequest((e) -> {
            System.out.println("프로그램이 종료됩니다.");
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Test");
        primaryStage.show();
    }
    
}
