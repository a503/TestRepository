package ch17.exam26;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class RootController implements Initializable {

    @FXML
    private PieChart pieChart;
    @FXML
    private BarChart<String, Integer> barChart; // 축에 들어가는 타입이 제네릭으로 표현했다
    @FXML
    private AreaChart<String, Integer> areaChart; // 축에 들어가는 타입이 제네릭으로 표현했다

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<PieChart.Data> data1 = FXCollections.observableArrayList();
        data1.add(new PieChart.Data("AWT", 10));
        data1.add(new PieChart.Data("Swing", 30));
        data1.add(new PieChart.Data("SWT", 25));
        data1.add(new PieChart.Data("JavaFX", 35));
        
        pieChart.setData(data1);
        
        XYChart.Series<String, Integer> series1 = new XYChart.Series<String, Integer>();
        series1.setName("남자"); // 범례 설정
        
        ObservableList<XYChart.Data<String, Integer>> data2 = FXCollections.observableArrayList();
        data2.add(new XYChart.Data<String, Integer>("2015", 70));
        data2.add(new XYChart.Data<String, Integer>("2016", 40));
        data2.add(new XYChart.Data<String, Integer>("2017", 50));
        data2.add(new XYChart.Data<String, Integer>("2018", 30));
        series1.setData(data2);
        
        XYChart.Series<String, Integer> series2 = new XYChart.Series<String, Integer>();
        series2.setName("여자"); // 범례 설정
        
        series2.setData(FXCollections.observableArrayList(
            new XYChart.Data<String, Integer>("2015", 30),
            new XYChart.Data<String, Integer>("2016", 60),
            new XYChart.Data<String, Integer>("2017", 50),
            new XYChart.Data<String, Integer>("2018", 60)
        ));
        
        XYChart.Series<String, Integer> series3 = new XYChart.Series<String, Integer>();
        series3.setName("평균 온도 (℃)"); // 범례 설정
        
        series3.setData(FXCollections.observableArrayList(
            new XYChart.Data<String, Integer>("2015", 13),
            new XYChart.Data<String, Integer>("2016", 20),
            new XYChart.Data<String, Integer>("2017", 6),
            new XYChart.Data<String, Integer>("2018", 22)
        ));
        
        XYChart.Series<String, Integer> series4 = new XYChart.Series<String, Integer>();
        series4.setName("평균 속도 (Km/h)"); // 범례 설정
        
        series4.setData(FXCollections.observableArrayList(
            new XYChart.Data<String, Integer>("2015", 90),
            new XYChart.Data<String, Integer>("2016", 87),
            new XYChart.Data<String, Integer>("2017", 71),
            new XYChart.Data<String, Integer>("2018", 112)
        ));
        
        barChart.getData().add(series1);
        barChart.getData().add(series2);
        
        areaChart.getData().add(series3);
        areaChart.getData().add(series4);
        
    }    
    
}
