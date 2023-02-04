
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        final int max = 100;
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;


        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts[0].equals("add")){
                int add = Integer.valueOf(parts[1]);
                if (add >0) firstContainer+= add;
                if (firstContainer > max) firstContainer = max;
            }
            if (parts[0].equals("move")){
                int move = Integer.parseInt(parts[1]);
                if (move > firstContainer) move = firstContainer;
                firstContainer-=move;
                secondContainer+=move;
                if(secondContainer > max) secondContainer=max;
                
            }
            if (parts[0].equals("remove")){
                int remove = Integer.parseInt(parts[1]);
                if (remove > secondContainer) remove = secondContainer;
                secondContainer-=remove;
                
                if(secondContainer < 0) secondContainer=0;
                
            }
        }
    }

}
