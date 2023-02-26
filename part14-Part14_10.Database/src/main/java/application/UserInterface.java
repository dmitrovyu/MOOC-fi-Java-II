package application;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }
            
            if (command.equals("1")) {
                List<Todo> todos = new ArrayList<>();
                todos = database.list();
                for(Todo todo: todos){
                    System.out.println(todo.toString());
                }
            }
            
             if (command.equals("2")) {
                 System.out.println("Please enter ToDo name :");
                 String name = this.scanner.nextLine();
                 System.out.println("Please enter ToDo description :");
                 String desc = this.scanner.nextLine();
                 
                 database.add(new Todo(name,desc,false));
                 System.out.println("Succesfully added new task");
            }
             
             if (command.equals("3")) {
                 System.out.println("Enter id of completed Todo: ");
                 int id = Integer.valueOf(this.scanner.nextLine());
                 database.markAsDone(id);
                 System.out.println("Task number: " + id + " changed status to completed");
                 
             }
             
             if (command.equals("4")) {
                 System.out.println("Enter id number of todo to be removed: ");
                 int id = Integer.valueOf(this.scanner.nextLine());
                 database.remove(id);
                 System.out.println("Task number: " + id + "succesfully removed");
             }
            // implement the functionality here
        }

        System.out.println("Thank you!");
    }

}
