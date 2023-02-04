package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application{
 
    private String player;
    
    @Override
    public void init() throws Exception {
 
    }
    
    @Override
    public void start(Stage window){
        
        TableView tableView = new TableView(player);
        BorderPane layouBorderPane = (BorderPane) tableView.getView();
        
        
        Scene view = new Scene(layouBorderPane,280,360);
                        
        window.setScene(view);
        window.show();
        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TicTacToeApplication.class);
    }

}