package application;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) {
        Label label = new Label("Enter your name and start");
        TextField name = new TextField();
        Button button = new Button("Start");
        GridPane pane1 = new GridPane();
        pane1.add(label, 0, 0);
        pane1.add(name, 0, 1);
        pane1.add(button, 0, 2);

        pane1.setPrefSize(300, 180);
        pane1.setAlignment(Pos.CENTER);
        pane1.setVgap(10);
        pane1.setHgap(10);
        pane1.setPadding(new Insets(20, 20, 20, 20));
        Scene scene1 = new Scene(pane1);

        GridPane pane2 = new GridPane();

        Scene scene2 = new Scene(pane2);

        button.setOnAction((event) -> {
            Label welcome = new Label("Welcome " + name.getText() + "!");
            pane2.add(welcome, 1, 1);
            pane2.setPrefSize(300, 180);
            pane2.setAlignment(Pos.CENTER);
            window.setScene(scene2);
            window.show();
        });

        window.setScene(scene1);
        window.show();

    }

    public static void main(String[] args) {

        launch(GreeterApplication.class);

        System.out.println("Hellow world! :3");
    }
}
