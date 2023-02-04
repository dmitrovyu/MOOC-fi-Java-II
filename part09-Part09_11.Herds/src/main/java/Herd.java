/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DEJAN
 */
public class Herd implements Movable {

    private List<Movable> herd;

    public Herd() {
        herd = new ArrayList<>();

    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);

    }

    @Override
    public void move(int dx, int dy) {
        for (Movable mov : herd) {
            mov.move(dx, dy);
        }

    }

    @Override
    public String toString() {
        String string = "";
        for (Movable mov : herd) {
            string+=mov + "\n";
        }
        return string;
    }
}
