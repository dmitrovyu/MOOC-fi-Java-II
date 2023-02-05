package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class SavingsCalculatorApplication extends Application {
    
    @Override 
    
    public void start(Stage window){
        
        UIGraph uiGraph = new UIGraph();
        Scene view = new Scene((BorderPane) uiGraph.getView());
        
        window.setScene(view);
        window.setTitle("Savings Calculator");
        window.show();
        
       
    }
    

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SavingsCalculatorApplication.class);
    }

}
