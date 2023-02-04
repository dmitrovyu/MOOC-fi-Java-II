
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEJAN
 */
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> facility;
    
    public StorageFacility() {
        this.facility = new HashMap<>();
    }
    
    public void add (String unit, String item){
        this.facility.putIfAbsent(unit, new ArrayList<>());
        this.facility.get(unit).add(item);
        
    }
    
    public ArrayList<String> contents(String unit){
        if ((!facility.containsKey(unit)) || facility.get(unit)== null)
            return new ArrayList<>();
        else {
            return facility.get(unit);
        }
    }
    
    public void remove (String unit, String item){
        facility.get(unit).remove(item);
        if (facility.get(unit)== null) facility.remove(unit);
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> list = new ArrayList<>();
        for (String unit : facility.keySet()){
           if (!(facility.get(unit).isEmpty())) {
               list.add(unit);
            }
          
        }
        return list;
    }
}
