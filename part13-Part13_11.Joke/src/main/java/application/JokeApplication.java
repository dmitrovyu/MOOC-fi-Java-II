package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class JokeApplication extends Application {
    
    @Override
    public void start (Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20,20,20,20));
        menu.setSpacing(10);
        
        Button joke = new Button ("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        
        
        menu.getChildren().addAll(joke,answer,explanation);
        menu.setAlignment(Pos.CENTER);
        
        layout.setTop(menu);
        
        StackPane first = createView("What do you call a bear with no teeth?");
        StackPane second = createView("A gummy bear.");
        StackPane third = createView("Because a gummy bear doesnt have teeth!");
        
        joke.setOnAction((event) -> layout.setCenter(first));
        answer.setOnAction((event) -> layout.setCenter(second));
        explanation.setOnAction((event) -> layout.setCenter(third));
        
        layout.setCenter(first);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
        
    }
    
    
    
    private StackPane createView(String text){
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().add(new Label(text));
        
        return layout;
    }
    

    public static void main(String[] args) {
        launch(JokeApplication.class);
    
        System.out.println("Hello world!");
    }
}
