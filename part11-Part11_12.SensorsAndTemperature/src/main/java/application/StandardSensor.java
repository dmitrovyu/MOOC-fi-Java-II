/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author DEJAN
 */
public class StandardSensor implements Sensor{
    private int number;
    public StandardSensor(int num){
        this.number = num;
        
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
    }
    

    @Override
    public void setOff() {
    }

    @Override
    public int read() {
        return this.number;
    }
    
}
