

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    
    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> output = numbers.stream()
               // .mapToInt(s -> Integer.parseInt(s))
                .filter(in -> in>0)
                .collect(Collectors.toList());
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        ArrayList<String> input = new ArrayList<>();
        
        

    }

}
