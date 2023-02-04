/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author DEJAN
 */
public class PracticeView {
    private Dictionary dict;
    private String word;
    
    public PracticeView(Dictionary dict){
        this.dict = dict;
        this.word = dict.getRandomWord();
    }
    
    public Parent getvView(){
        GridPane layout = new GridPane();
        Label question = new Label("Translate the word: " + "'" + word +"'");
        TextField answer = new TextField();
        Button button = new Button("Check");
        Label result = new Label ("");
        
        layout.setAlignment(Pos.CENTER);
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(10,10,10,10));
        
        layout.add(question, 0, 0);
        layout.add(answer, 0, 1);
        layout.add(button, 0, 2);
        layout.add(result,0,3);
        
        button.setOnAction((event) -> {
            if (answer.getText().equals(dict.get(word))) {
                result.setText("Correct");
            }
            else {
                result.setText("Incorrect! The translation of the word '" + word + "' is " +  dict.get(word));
                
            }
            
        });
        return layout;
        
    }
    
    
}
