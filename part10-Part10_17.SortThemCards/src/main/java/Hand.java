/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEJAN
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    
    public int compareTo(Hand hand) {
        int one = this.hand.stream()
                .mapToInt(Card::getValue)
                .sum();
        int sec = hand.hand.stream()
                .mapToInt(Card::getValue)
                .sum();
        
         if (one>sec) return 1;
         if (one < sec) return -1;
         return 0;
                
        
    
    }
    private List<Card> hand = new ArrayList<>();
    
    public void add(Card card){
        this.hand.add(card);
    }
    public void print() {
        hand.stream()
                .forEach(s -> System.out.println(s));
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    public void sortBySuit(){
        Collections.sort(hand,new BySuitInValueOrder());
    }
    
}
