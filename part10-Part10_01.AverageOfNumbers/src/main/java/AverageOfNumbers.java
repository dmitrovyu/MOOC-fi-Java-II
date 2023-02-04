
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        // Write your program here
        while(true){
            String text = scanner.nextLine();
            if (text.equals("end")) break;
            input.add(text);
        }
        double average;
        average = input.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        
        System.out.println("average of the numbers: " + average);
        

    }
}
