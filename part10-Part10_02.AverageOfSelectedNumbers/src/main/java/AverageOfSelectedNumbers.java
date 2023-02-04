
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> input = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true) {
            String text = scanner.nextLine();
            if (text.equals("end")) break;
            input.add(text);
        }
        double averageOfPositiveNumbers = input.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter (num -> num>0)
                .average()
                .getAsDouble();
        double averageOfNegativeNumbers = input.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(num -> num < 0)
                .average()
                .getAsDouble();
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String text = scanner.nextLine();
        if (text.equals("n")) System.out.println("Average of the negative numbers: " + averageOfNegativeNumbers);
        if (text.equals("p")) System.out.println("Average of the positive numbers: " + averageOfPositiveNumbers);
    }
}
