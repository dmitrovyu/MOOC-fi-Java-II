
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);

            if (num == 0) {
                break;
            }

            if (num > 0) {
                sum += num;
                count++;

            }

        }
        if (count > 0) {
            System.out.println((double) sum / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
