
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEJAN
 * @param <T>
 */
public class Pipe <T> {
    
    private ArrayList<T> pipe = new ArrayList<>();
    private T element;
    
    public void putIntoPipe(T element){
        pipe.add(element);
        
    }
    public T takeFromPipe() {
        if (!pipe.isEmpty()) {
            element = pipe.get(0);
            pipe.remove(0);
            return element;
        }
        
        return null;
       
    }
    public boolean isInPipe(){
        return !pipe.isEmpty();
    }
    
    
}
