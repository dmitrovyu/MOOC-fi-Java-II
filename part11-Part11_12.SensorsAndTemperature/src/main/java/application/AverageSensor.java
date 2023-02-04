/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DEJAN
 */
public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> averages;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.averages = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
        
    }
    
    @Override
    public boolean isOn() {
        if (this.sensors.isEmpty()){
            return false;
        }
       return this.sensors.stream()
                .allMatch(s -> s.isOn());
        
    }

    @Override
    public void setOn() {
        for (Sensor sens : sensors){
            sens.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sens : sensors){
            sens.setOff();
        }
    }

    @Override
    public int read() {
        
        if(!isOn()){
            throw new IllegalStateException("Sensor is off or empty");
            
        }
        
        int sum = this.sensors.stream()
                .map(s -> s.read())
                .reduce(0, (p,n) -> p+n);
        int average =(int)(sum / this.sensors.size());
        this.averages.add(average);
        return average;
        
    }
    
    public List<Integer> readings(){
        return this.averages;
        
    }
    
}
