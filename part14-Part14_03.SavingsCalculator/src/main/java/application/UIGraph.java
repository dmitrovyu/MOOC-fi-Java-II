/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;


import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author DEJAN DMITROVIC
 */
public class UIGraph {

    private BorderPane layout;
    private LineChart<Integer, Number> lineChart;
    private Label monthSavLabel;
    private Label yearlyIntRateLabel;
    private Slider monthSlider;
    private Slider yearlyIntRateSlider;
    private XYChart.Series monthlySavingSeries;
    private XYChart.Series yearlyIntRateSeries;
    private int monthlySavingsValue;
    private double yearIntRateValue;

    public Parent getView() {
        monthlySavingsValue = 25;
        yearIntRateValue = 0;
        layout = new BorderPane();
        layout.setPadding(new Insets(20, 20, 20, 20));

        //Graph
        NumberAxis xAxis = new NumberAxis();
        xAxis.setAutoRanging(false);
        xAxis.setUpperBound(30);
        
        NumberAxis yAxis = new NumberAxis();

        lineChart = new LineChart(xAxis, yAxis);
        monthlySavingSeries = new XYChart.Series<>();
        yearlyIntRateSeries = new XYChart.Series<>();
        lineChart.setLegendVisible(false);

        layout.setCenter(lineChart);

        //VBox
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        BorderPane monthlySavings = new BorderPane();
        BorderPane yearlyIntRate = new BorderPane();

        monthSavLabel = new Label("Monthly savings");
        yearlyIntRateLabel = new Label("Yearly interest rate");

        //Slider 0ne
        monthSlider = new Slider(25, 250, 25);
        monthSlider.setShowTickLabels(true);
        monthSlider.setShowTickMarks(true);
        monthSlider.setMajorTickUnit(25);
        monthSlider.setMinorTickCount(0);
        monthSlider.setBlockIncrement(25);
        monthSlider.setSnapToTicks(false);

        //Slider two
        yearlyIntRateSlider = new Slider(0, 10, 0);

        Label monthSavValue = new Label("25");
        Label yearlyIntRateValue = new Label("0");

        monthlySavings.setLeft(monthSavLabel);
        monthlySavings.setCenter(monthSlider);
        monthlySavings.setRight(monthSavValue);

        yearlyIntRate.setLeft(yearlyIntRateLabel);
        yearlyIntRate.setCenter(yearlyIntRateSlider);
        yearlyIntRate.setRight(yearlyIntRateValue);

        vBox.getChildren().add(monthlySavings);
        vBox.getChildren().add(yearlyIntRate);

        layout.setTop(vBox);

        monthSlider.valueProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {

            monthlySavingsValue = newValue.intValue();
            monthSavValue.setText(Integer.toString(monthlySavingsValue));
            drawNewIntRate(monthlySavingsValue, yearIntRateValue);
        });

        yearlyIntRateSlider.valueProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {

            yearIntRateValue = newValue.doubleValue();
            yearlyIntRateValue.setText(String.format("%.2f",yearIntRateValue));
            drawNewIntRate(monthlySavingsValue, yearIntRateValue);
        });

        return layout;

    }

    public void drawNewIntRate(int monthSavings, double interestRate) {
        lineChart.getData().remove(monthlySavingSeries);
        lineChart.getData().remove(yearlyIntRateSeries);
        yearlyIntRateSeries = new XYChart.Series<>();
        monthlySavingSeries = new XYChart.Series();

        double intRatePerc = (double) (interestRate) / 100;
        double futureValue = 0;
        for (int i = 0; i < 31; i++) {
            if (i == 0) {
                futureValue = 0;

            } else {
                if (interestRate == 0) {
                    futureValue = i * 12 * monthSavings;
                } else {
                    futureValue = monthSavings * 12 * ((Math.pow(1 + intRatePerc, i + 1) - (1 + intRatePerc)) / intRatePerc);
                   // System.out.println(monthSavings + " " + futureValue + " " + " " + intRatePerc + " " + Math.pow(1 + intRatePerc, i + 1));

                }

            }

            yearlyIntRateSeries.getData().add(new XYChart.Data(i, futureValue));
            monthlySavingSeries.getData().add(new XYChart.Data(i, i * 12 * monthSavings));
        }

        
        lineChart.getData().add(yearlyIntRateSeries);
        lineChart.getData().add(monthlySavingSeries);

    }
}
