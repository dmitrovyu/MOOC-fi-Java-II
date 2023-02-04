/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import java.util.HashMap;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author DEJAN
 */
public class FlightControl {
    private HashMap<String,Airplane> airplanes;
    private HashMap<String,Flight> flights;
    private Map<String,Place> places;
    
    public FlightControl(){
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
        
    }
    
    public void addAirplane(String ID, int capacity){
        this.airplanes.put(ID, new Airplane(ID, capacity));
        
    }
    
    public void addFlight (Airplane airplane, String departureID, String targetID){
        this.places.putIfAbsent(departureID,new Place(departureID));
        this.places.putIfAbsent(targetID, new Place(targetID));
        Flight flight = new Flight(airplane,this.places.get(departureID), this.places.get(targetID));
        this.flights.put(flight.toString(), flight);
    }
    
    public Airplane getAirplane(String ID){
        return this.airplanes.get(ID);
    }
    
    public Collection<Airplane> getAirplanes(){
        return this.airplanes.values();
    }
    
    public Collection<Flight> getFlights(){
        return this.flights.values();
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
