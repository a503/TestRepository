package homework01;

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
    private ListView<Nation> listView;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listView.setCellFactory(new Callback<ListView<Nation>, ListCell<Nation>>() {
            @Override
            public ListCell<Nation> call(ListView<Nation> param) {
                ListCell<Nation> listCell = new ListCell<Nation>(){
                    @Override
                    protected void updateItem(Nation item, boolean empty) {
                        if(empty) return;
                        super.updateItem(item, empty);
                        try {
                            HBox hbox = FXMLLoader.load(getClass().getResource("item.fxml"));
                            ImageView flagImage = (ImageView) hbox.lookup("#image");
                            Label nationName = (Label) hbox.lookup("#name");
                            Label flagName = (Label) hbox.lookup("#flag");
                            
                            flagImage.setImage(new Image(getClass().getResource("images/" + item.getFlagImage()).toString()));
                            nationName.setText(item.getNationName());
                            flagName.setText(item.getFlagName());
                            
                            setGraphic(hbox);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    
                };
                return listCell;
            }

        });
        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Nation>() {
            @Override
            public void changed(ObservableValue<? extends Nation> observable, Nation oldValue, Nation newValue) {
                System.out.println(newValue.getNationName()+":"+newValue.getFlagName());
            }
        });
        
        
        ObservableList<Nation> value = FXCollections.observableArrayList();
        value.add(new Nation("america.jpg", "성조기", "미국"));
        value.add(new Nation("korea.jpg", "태극기", "대한민국"));
        value.add(new Nation("canada.jpg", "메이플리프(단풍잎기)", "캐나다"));
        value.add(new Nation("india.jpg", "차르카(윤회)", "인도"));
        value.add(new Nation("mexico.jpg", "테노치티틀란", "멕시코"));
        value.add(new Nation("turkey.jpg", "아이율드즈(월성기)", "터키"));
        listView.setItems(value);
    }    
    
}
