package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class MultipleViews extends Application {
    
    @Override
    public void start(Stage window) {
        Label label1 = new Label("First View!");
        Button button1 = new Button("To the second view!");
        BorderPane pane = new BorderPane();
        pane.setTop(label1);
        pane.setCenter(button1);
        Scene view1 = new Scene(pane, 300, 300);
        
        VBox vBox = new VBox();
        Button button2 = new Button("To the third view!");
        Label label2 = new Label("Second view!");
        vBox.getChildren().add(button2);
        vBox.getChildren().add(label2);
        Scene view2 = new Scene(vBox, 300, 300);
        
        GridPane pane2 = new GridPane();
        pane2.add(new Label("Third view!"), 0, 0);
        Button button3 = new Button("To the first view!");
        pane2.add(button3, 1, 1);
        Scene view3 = new Scene (pane2, 300, 300);
        
        button1.setOnAction((eh) -> {
            window.setScene(view2);
        });
        button2.setOnAction((event) -> {
            window.setScene(view3);
        });
        button3.setOnAction((event) -> {
            window.setScene(view1);
        });
        
        
        window.setScene(view1);
        window.show();
        
        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

}
