package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
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
           Label letters = new Label("Letters: 0");
           hBox.getChildren().add(letters);
           Label noOfWords = new Label("Words: 0");
           hBox.getChildren().add(noOfWords);
           Label longestWord = new Label ("The longest word is: ");
           hBox.getChildren().add(longestWord);
           
           txtArea.textProperty().addListener((change, oldValue, newValue) -> {
               int characters = newValue.length();
               String[] parts = newValue.split(" ");
               int words = parts.length;
               String longest = Arrays.stream(parts)
                                .sorted((s1,s2) -> s2.length()-s1.length())
                                .findFirst()
                                .get();
               letters.setText("Letters: " + characters);
               noOfWords.setText("Words: " + words);
               longestWord.setText("The longest word is: " + longest);
                       
           });
           
           
           
           
           
           
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
