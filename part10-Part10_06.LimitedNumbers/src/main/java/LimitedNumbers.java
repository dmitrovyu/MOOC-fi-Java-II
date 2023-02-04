
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input =  new ArrayList<>();
        
        while(true){
            Integer num = scanner.nextInt();
            if (num <0) break;
            input.add(num);
        }
        input.stream()
                .filter(s -> ((s>0) && (s<6)))
                .forEach(num -> System.out.println(num));
        

    }
}
