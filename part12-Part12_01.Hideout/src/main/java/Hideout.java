/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEJAN
 */
public class Hideout<T> {
    private T object;
    
    public void setValue(T t){
        this.object = t;
    }
    
    public void putIntoHideout(T toHide){
         this.object = toHide;
        
        
    }
    public T takeFromHideout(){
        T s = this.object;
        this.object = null;
        return s;
    }
    public boolean isInHideout(){
        return !(this.object == null);
        
    }
    
}
