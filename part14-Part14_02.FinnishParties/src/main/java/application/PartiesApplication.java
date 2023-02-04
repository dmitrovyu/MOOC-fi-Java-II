package application;

import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class PartiesApplication extends Application {

    @Override

    public void start(Stage window) {

        // read from partiresdata.tsv file
        ArrayList<String> rows = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                rows.add(row);
                System.out.println("" + row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }

        //initiate graph
        NumberAxis xAxis = new NumberAxis(1968,2008,4);
        NumberAxis yAxis = new NumberAxis(0,30,5);
        

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
       // XYChart.Series partiesData = new XYChart.Series();
        String[] dataXAxisValues = rows.get(0).split("\t");

        for (String dataXAxisValue : dataXAxisValues) {
            System.out.println(dataXAxisValue);
        }

        for (int i = 1; i < rows.size(); i++) {
            String[] data = rows.get(i).split("\t");
            XYChart.Series partiesData = new XYChart.Series();
            partiesData.setName(data[0]);
            System.out.println(data[0]);
            for (int j = 1; j < data.length; j++) {
                if (data[j].equals("-")) {
                    data[j] = "0";
                }
                partiesData.getData().add(new XYChart.Data(Integer.valueOf(dataXAxisValues[j]), Double.valueOf(data[j])));
               System.out.println(dataXAxisValues[j]+ " " +data[j]);  

            }
            
            lineChart.getData().add(partiesData);

        }
        Scene view = new Scene(lineChart,640,480);
        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(PartiesApplication.class);
    }

}
