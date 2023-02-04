/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEJAN
 */
public class Container {
    private int volume;
    final private int max = 100;
    
    public Container(){
        this.volume = 0;
    }
    
    public int contains(){
        return this.volume;
    }
    public void add (int amount){
        if (amount > 0) this.volume+=amount;
        if (this.volume > max) this.volume = max;
    }
    public void remove(int amount){
        if (amount > 0) this.volume -=amount;
        if(this.volume < 0) this.volume = 0;
    }
    @Override
    public String toString(){
        return this.volume + "/" + max;
        
    }
    
}
