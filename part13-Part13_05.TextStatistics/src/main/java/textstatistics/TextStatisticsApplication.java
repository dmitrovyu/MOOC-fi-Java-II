package textstatistics;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

public class TextStatisticsApplication extends Application{

       @Override
       public void start(Stage window){
           BorderPane border = new BorderPane();
           TextArea txtArea = new TextArea();
           HBox hBox = new HBox();
           hBox.getChildren().add(new Label("Letters: 0"));
           hBox.getChildren().add(new Label("Words: 0"));
           hBox.getChildren().add(new Label("The longest word is:"));
           hBox.setAlignment(Pos.CENTER);
           hBox.setSpacing(30);
           border.setBottom(hBox);
           border.setCenter(txtArea);
           Scene view = new Scene(border);
           window.setScene(view);
           window.show();
           
           
       }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }

}
