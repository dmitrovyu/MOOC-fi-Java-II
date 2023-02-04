
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts[0].equals("add")) {
                int add = Integer.valueOf(parts[1]);
                firstContainer.add(add);
            }
            if (parts[0].equals("move")) {
                int move = Integer.parseInt(parts[1]);
                if (move > firstContainer.contains()) {
                    move = firstContainer.contains();
                }
                firstContainer.remove(move);
                secondContainer.add(move);

            }
            if (parts[0].equals("remove")) {
                int remove = Integer.parseInt(parts[1]);
                if (remove > secondContainer.contains()) {
                    remove = secondContainer.contains();
                }
                secondContainer.remove(remove);

            }
        }

    }
}
