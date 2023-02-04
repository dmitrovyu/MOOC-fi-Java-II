
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEJAN
 */
public class BoxWithMaxWeight extends Box {
    private int maxCapacity;
    private ArrayList<Item> contents;
    
    public BoxWithMaxWeight(int capacity){
        this.maxCapacity = capacity;
        this.contents = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        int current = 0;
        for (Item items: contents){
            current += items.getWeight();
        }
        if (current + item.getWeight()<=maxCapacity){
            contents.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        
        for(Item items : contents){
            if (items.equals(item)) return true;
        }
        return false;
    }
    
}
