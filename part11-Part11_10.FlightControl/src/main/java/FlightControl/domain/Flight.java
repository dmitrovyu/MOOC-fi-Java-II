/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author DEJAN
 */
public class Flight {
    private Airplane airplane;
    private Place departureAirport;
    private Place targetAirport;
    
    public Flight(Airplane airplane,Place dep,Place target){
        this.airplane=airplane;
        this.departureAirport = dep;
        this.targetAirport = target;
    }
    public Airplane getAirplane(){
        return this.airplane;
    }
    
    public Place getDepartureAirport(){
        return this.departureAirport;
    }
    
    public Place getTargetAirport(){
        return this.targetAirport;
    }
    
    @Override
    public String toString(){
        return this.airplane.toString() + " ("+this.getDepartureAirport() + "-" + this.getTargetAirport()+")";
    }
}
