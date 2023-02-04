package buttonandtextfield;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.application.Application;
import javafx.scene.layout.HBox;


public class ButtonAndTextFieldApplication  extends Application{
    
    @Override
    public void start(Stage window){
        Button button = new Button("Button 1");
        TextField textField = new TextField("Hello world!");
        HBox hb = new HBox();
        hb.getChildren().add(button);
        hb.getChildren().add(textField);
        Scene scene = new Scene(hb);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndTextFieldApplication.class);
    }

}
