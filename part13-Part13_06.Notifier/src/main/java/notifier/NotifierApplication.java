package notifier;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class NotifierApplication extends Application {
    
    @Override
    public void start(Stage window){
        Button button = new Button("Update");
        Label label = new Label();
        TextField txtField = new TextField();
        VBox vBox = new VBox();
        vBox.getChildren().add(txtField);
        vBox.getChildren().add(button);
        vBox.getChildren().add(label);
        Scene view = new Scene(vBox);
        
        button.setOnAction((eh)-> {
            label.setText(txtField.getText());
        });
        
        window.setMinHeight(400);
        window.setMinWidth(600);
        window.setScene(view);
        
        
        window.show();
        
        
        
        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(NotifierApplication.class);
    }

}
