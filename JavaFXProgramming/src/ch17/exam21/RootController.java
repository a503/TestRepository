package ch17.exam21;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.util.Callback;

public class RootController implements Initializable {
    @FXML
    private ListView<Food> listView;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listView.setCellFactory(new Callback<ListView<Food>, ListCell<Food>>() {
            @Override
            public ListCell<Food> call(ListView<Food> param) {
                ListCell<Food> listCell = new ListCell<Food>(){
                    @Override
                    protected void updateItem(Food item, boolean empty) {
                        if(empty) return;
                        super.updateItem(item, empty); //To change body of generated methods, choose Tools | Templates.
                        try {
                            HBox hbox =(HBox) FXMLLoader.load(getClass().getResource("item.fxml"));
                            ImageView foodImage = (ImageView)hbox.lookup("#imageFood");
                            Label foodName = (Label) hbox.lookup("#name");
                            ImageView starImage = (ImageView)hbox.lookup("#imageStar");
                            Label foodContent = (Label) hbox.lookup("#content");
                            
                            foodImage.setImage(new Image(getClass().getResource("images/" + item.getImage()).toString()));
                            foodName.setText(item.getName());
                            starImage.setImage(new Image(getClass().getResource("images/star" + item.getScore() + ".png").toString()));
                            foodContent.setText(item.getDescription());
                            
                            setGraphic(hbox);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        
                    }
                    
                };
                return listCell;
            }
        });
        listView.setOnMouseClicked(e->{
            Food food = listView.getSelectionModel().getSelectedItem();
            //if(listView.hasProperties()){ // 여기 수정 해라ㅑ
                System.out.println(food.getName() + " : " + food.getDescription());
                System.out.println("별점> " + food.getScore());
            //}
        });
        
        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Food>(){
            @Override
            public void changed(ObservableValue<? extends Food> observable, Food oldValue, Food newValue) {
                System.out.println(newValue.getName() + " : " + newValue.getDescription());
                System.out.println("별점> " + newValue.getScore());
            }
        });
        ObservableList<Food> value = FXCollections.observableArrayList();
        value.add(new Food("food01.png", "삽결살", 5, "마시쩡"));
        value.add(new Food("food03.png", "장어", 7, "매우 마시쩡"));
        value.add(new Food("food05.png", "볶음밥", 9, "매우 매우 마시쩡"));
        listView.setItems(value);
    }    
    
}
