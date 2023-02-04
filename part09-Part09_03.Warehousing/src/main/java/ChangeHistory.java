
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
public class ChangeHistory {
    private ArrayList<Double> change;
    
    public ChangeHistory(){
        this.change = new ArrayList<>();
    }
    
    public void add(double status){
        this.change.add(status);
    }
    
    public void clear(){
        this.change.clear();
    }
    
    public String toString(){
        return this.change.toString();
    }
    
    public double maxValue() {
        if (change.isEmpty()) return 0;
        double maxValue = change.get(0);
        for (Double changes: change){
            if (changes > maxValue) maxValue = changes;
            
        }
        return maxValue;
    }
    public double minValue(){
        if (change.isEmpty()) return 0;
        double minValue = change.get(0);
        for (Double changes : change){
            if(changes < minValue) minValue = changes;
        }
        return minValue;
    }
    
    public double average (){
        if (change.isEmpty()) return 0;
        double sum = 0;
        for (Double changes : change){
            sum+=changes;
        }
        return sum/change.size();
    }
        
}
