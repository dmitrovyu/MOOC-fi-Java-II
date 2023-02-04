package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class BorderPaneApplication extends Application {
    
    @Override
    
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        layout.setBottom(new Label("SOUTH"));
        layout.setTop(new Label("NORTH"));
        layout.setRight(new Label("EAST"));
        Scene scene = new Scene(layout);
        window.setMinHeight(500);
        window.setMinWidth(500);
        window.setScene(scene);
       
        
        window.show();
        
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        launch(BorderPaneApplication.class);
    }

}
