
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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> vehicleRegistry;
    
    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
        
    }
    public boolean add(LicensePlate licensePlate, String owner){
        if (!(vehicleRegistry.get(licensePlate) == null)) return false;
        else {
            this.vehicleRegistry.put(licensePlate, owner);
            return true;
        }
       
    }
    
    public String get(LicensePlate licensePlate){
        return this.vehicleRegistry.getOrDefault(licensePlate, null);
    }
    
    public boolean remove (LicensePlate licensePlate){
       return  this.vehicleRegistry.remove(licensePlate, this.vehicleRegistry.get(licensePlate));
       
    }
    
    public void printLicensePlates(){
        for (LicensePlate licensePlate : vehicleRegistry.keySet()){
            System.out.println(licensePlate);
            
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : vehicleRegistry.values()){
          if(!owners.contains(owner)) {
              System.out.println(owner);
              owners.add(owner);
          }
            
        }
    }
    
}
