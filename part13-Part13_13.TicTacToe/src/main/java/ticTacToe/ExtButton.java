/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import javafx.scene.control.Button;

/**
 *
 * @author DEJAN
 */
public class ExtButton {

    private int coordX;
    private int coordY;
    private Button button;
    private int value;

    public ExtButton(int i, int y) {
        this.coordX = i;
        this.coordY = y;
        button = new Button(" ");
        this.value = 0;

    }

    public int getCoordX() {
        return this.coordX;
    }

    public int getCoordY() {
        return this.coordY;
    }

    public Button getButton() {
        return this.button;
    }

    public int getValue() {
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }
}
