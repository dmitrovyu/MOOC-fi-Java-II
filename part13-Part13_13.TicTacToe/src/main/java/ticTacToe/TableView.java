/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;


/**
 *
 * @author DEJAN
 */
public class TableView {

    private int player;
    private ExtButton[][] buttons = new ExtButton[3][3];
    private Label title;
    private Label footer;
    private boolean endGame;
    private int tableValues[][];

    public TableView(String player) {

        this.player = 1;
        this.title = new Label("Turn: X");
        this.footer = new Label("Please select the button");
        this.endGame = false;

    }

    public Parent getView() {
        BorderPane layout = new BorderPane();

        layout.setPadding(new Insets(30, 30, 10, 10));

        title.setFont(Font.font("Monospace", 40));
        layout.setTop(title);

        GridPane buttonsGrid = new GridPane();
        buttonsGrid.setVgap(10);
        buttonsGrid.setHgap(10);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ExtButton button = new ExtButton(i, j);
                button.getButton().setFont(Font.font("Monospaced", 40));
                buttons[i][j] = button;
                buttonsGrid.add(button.getButton(), i, j);

                button.getButton().setOnAction((event) -> {
                    changeButton(button);
                });

            }
        }
        layout.setCenter(buttonsGrid);

        footer.setFont(Font.font("Monospace", 12));
        layout.setBottom(footer);

        return layout;
    }

    private void changeButton(ExtButton button) {

        if (endGame) {
            return;
        }

        if (!button.getButton().getText().equals(" ")) {
            footer.setText("Player please select the empty field");
            return;
        }
        button.getButton().setText(playerText(player));
        button.setValue(player);
       

        if (player == 1) {
            player = -1;
        } else {
            player = 1;
        }

        title.setText("Turn: " + playerText(player));
        footer.setText("Please select the button");
        checkVictory(button);

    }

    private String playerText(int player) {
        //Convert number to text
        if (player == 1) {
            return "X";
        } else {
            return "O";
        }
    }

    private void checkVictory(ExtButton button) {
        
        // Check rows and coloums for victory
        int sumX = 0;
        int sumY = 0;
        for (int i = 0; i < 3; i++) {
            sumY += buttons[button.getCoordX()][i].getValue();
            sumX += buttons[i][button.getCoordY()].getValue();
        }
        

        endGame(sumX,sumY);
        
        // Check  left diagonal
        sumX = 0;
      
        if (button.getCoordX() == button.getCoordY()){
            for (int i = 0; i<3; i++){
                sumX +=buttons[i][i].getValue();
                endGame(sumX, 0);
            }
        }
        //Check right diagonal
        sumX = 0;
        if (button.getCoordX() + button.getCoordY() == 2){
            for (int i =0; i<3; i++){
                sumX +=buttons[i][2-i].getValue();
                endGame(sumX,0);
            }
            
        }
        
    }
    // Display text after end game
      private void endGame(int sumX, int sumY){
          if (sumY == 3 || sumX == 3) {
            title.setText("The end!");
            this.endGame = true;
        }
        if (sumX == - 3 || sumY == -3) {
            title.setText("The end!");
            this.endGame = true;
        }
          
     

    }

}
