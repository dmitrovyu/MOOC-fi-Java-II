package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the title: ");
        String title = "--title=" + scn.nextLine();
        
        Application.launch(UserTitle.class, title);
        

    }

}
