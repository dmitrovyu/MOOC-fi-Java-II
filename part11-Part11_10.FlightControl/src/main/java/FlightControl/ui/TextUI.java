/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author DEJAN
 */
public class TextUI {
    private FlightControl flightControl;
    private Scanner scanner;
    
    public TextUI(FlightControl flightControl, Scanner scanner){
        this.flightControl = flightControl;
        this.scanner = scanner;
    }
    
    public void start(){
        startsAssetControl();
        System.out.println("");
        startsFlightControl();
        System.out.println("");
    }
    
    public void startsAssetControl(){
        System.out.println("Airport Asset Control");
        while(true){
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equals("x")) break;
            if(input.equals("1")) {
                addAirplane();
            }
            if(input.equals("2")){
                addFlight();
            }
        } 
    }
    public void addAirplane(){
        System.out.println("Give the airplane id:");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity:");
        int cap = Integer.parseInt(scanner.nextLine());
        this.flightControl.addAirplane(id, cap);
    }
    
    public void addFlight() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println("Give the departure airport id: ");
        String deptID = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String targetID = scanner.nextLine();
        this.flightControl.addFlight(this.flightControl.getAirplane(id),deptID,targetID);
    }
    
    
    public void startsFlightControl(){
        System.out.println("Flight Control");
        
        while(true){
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print(">");
            String input = scanner.nextLine();
            if (input.equals("x")) break;
            if (input.equals("1")) printAirplanes();
            if(input.equals("2")) printFlights();
            if(input.equals("3")) printAirplaneDetails();
        } 
        
        
    }
    public void printAirplanes(){
        for (Airplane airplane : this.flightControl.getAirplanes()){
            System.out.println(airplane);
           
        }   
    }
    
    public void printFlights(){
        for(Flight flight : this.flightControl.getFlights()){
            System.out.println(flight);
            
        }
    }
    public void printAirplaneDetails(){
        System.out.println("Give the airplane id: ");
        Airplane airplane = askForAirplane();
        System.out.println(airplane);
    }
    public Airplane askForAirplane(){
        Airplane plane = null;
        while (plane == null) {
            String id = scanner.nextLine();
            plane = flightControl.getAirplane(id);
            
            if (plane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
            
        }
        return plane;
    }
    
    
}
