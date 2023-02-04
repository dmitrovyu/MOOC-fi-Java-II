
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
public class Box implements Packable{
    private ArrayList<Packable> boxContent;
    final private double capacity;
    
    public Box(double capacity){
        boxContent = new ArrayList<>();
        this.capacity = capacity;
        
    }
    
    public void add(Packable item){
        
        if (this.weight() + item.weight() <capacity) {
            boxContent.add(item);
        }
        
    }
    
    @Override
    public double weight(){
        double sum = 0;
        for(Packable item : boxContent){
            sum += item.weight();
        }
        return sum;
    }
    
    @Override
    public String toString(){
        return "Box: " + boxContent.size() + " items, total weight " + this.weight() + " kg";
    }
    
    
    
}
