package buttonandlabel;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;


public class ButtonAndLabelApplication extends Application{
    
    @Override
    public void start(Stage window){
        
        Button button = new Button();
        Label label = new Label();
        FlowPane flowPane = new FlowPane();
        button.setText("Button1");
        label.setText("Label1");
        flowPane.getChildren().add(button);
        flowPane.getChildren().add(label);
        Scene view = new Scene(flowPane);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch (ButtonAndLabelApplication.class);
        
        
    }

}
