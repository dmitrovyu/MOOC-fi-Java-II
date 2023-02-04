/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEJAN
 */
public class  Cat  extends Animal implements NoiseCapable{
    
    public Cat(String name) {
        super(name);
    }
    public Cat(){
        super("Cat");
    }
    
    public void purr(){
        System.out.println(name + " purrs");
    }
    
    @Override
    public void makeNoise(){
        this.purr();
    }
}
