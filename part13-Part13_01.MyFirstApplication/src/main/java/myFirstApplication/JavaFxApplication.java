/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myFirstApplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author DEJAN
 */
public class JavaFxApplication extends Application {
    
    @Override
    public void start(Stage window){
        Button button = new Button("This is button");
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        
        Scene scene = new Scene(componentGroup);
        window.setScene(scene);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(JavaFxApplication.class);
        
    }
    
}
