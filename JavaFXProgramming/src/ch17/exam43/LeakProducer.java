/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.exam43;

/**
 *
 * @author kang
 */
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.ScrollBar; 
import javafx.scene.layout.StackPane; 
import javafx.scene.layout.VBox; 
import javafx.stage.Stage; 

public class LeakProducer extends Application 
{ 
   @Override 
   public void start(Stage primaryStage) throws Exception 
   { 
      final StackPane root = new StackPane(); 
      final VBox myBox = new VBox(); 

      Button scrollBarBtn = new Button(); 
      scrollBarBtn.setText("Scrollbar"); 
      scrollBarBtn.setOnAction(x -> { 
               if (myBox.getChildren().size() > 1) { 
                  myBox.getChildren().remove(1); 
                  System.gc(); 
                  System.runFinalization(); 
                  System.gc(); 
                  System.runFinalization(); 
               } else { 
                  myBox.getChildren().add(new ScrollBar()); 
               } 
            }); 

      Scene scene = new Scene(root, 300, 250); 

      myBox.getChildren().add(scrollBarBtn); 

      root.getChildren().add(myBox); 
      primaryStage.setScene(scene); 
      primaryStage.show(); 
   } 

   public static void main(String args[]) { 
      launch(args); 
   } 
} 
