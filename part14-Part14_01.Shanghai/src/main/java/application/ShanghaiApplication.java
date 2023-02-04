package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication  extends Application{
    
    @Override
    public void start(Stage window){
        NumberAxis xAxis = new NumberAxis(2006,2018,4);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart <Number,Number> lineChart = new LineChart<>(xAxis,yAxis);
        lineChart.setTitle("The University of Helsinki, Shanghai ranking");
        
        XYChart.Series shangaiListRank = new XYChart.Series();
        shangaiListRank.setName("SLR");
        shangaiListRank.getData().add(new XYChart.Data(2007,73));
        shangaiListRank.getData().add(new XYChart.Data(2008,68));
        shangaiListRank.getData().add(new XYChart.Data(2009,72));
        shangaiListRank.getData().add(new XYChart.Data(2010,72));
        shangaiListRank.getData().add(new XYChart.Data(2011,74));
        shangaiListRank.getData().add(new XYChart.Data(2012,73));
        shangaiListRank.getData().add(new XYChart.Data(2013,76));
        shangaiListRank.getData().add(new XYChart.Data(2014,73));
        shangaiListRank.getData().add(new XYChart.Data(2015,67));
        shangaiListRank.getData().add(new XYChart.Data(2016,56));
        shangaiListRank.getData().add(new XYChart.Data(2017,56));
        
        lineChart.getData().add(shangaiListRank);
        lineChart.setLegendVisible(false);
        Scene view = new Scene(lineChart, 640, 480);
        window.setScene(view);
        window.show();
        
        
        
        
    }
    

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ShanghaiApplication.class);
    }

}
