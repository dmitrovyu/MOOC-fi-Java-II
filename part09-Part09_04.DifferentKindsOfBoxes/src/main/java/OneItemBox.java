/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEJAN
 */
public class OneItemBox extends Box {
    private Item item;
    public OneItemBox() {
        
        
    }
    @Override
    public void add(Item item){
        if (this.item == null) this.item = item;
    }
    @Override
    
    public boolean isInBox(Item item){
        if (!(this.item == null)) return this.item.equals(item);
        return false;
    }
    
    
}
