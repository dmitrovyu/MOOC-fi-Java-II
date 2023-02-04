
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DEJAN
 */
public class UserInterface {

    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scn) {
        this.scanner = scn;
        this.todoList = todoList;

    }

    public void start() {

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            if (input.equals("add")) {
                System.out.println("To add:");
                String text = scanner.nextLine();
                todoList.add(text);
            }
            if (input.equals("list")) {
                todoList.print();

            }
            if(input.equals("remove")){
                System.out.println("Which one is removed?");
                int num = Integer.parseInt(scanner.nextLine());
                todoList.remove(num);
            }
        }
    }
}
