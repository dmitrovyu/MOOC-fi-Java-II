
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        
        while(true){
            String text = scanner.nextLine();
            if(text.isEmpty()) break;
            input.add(text);
        }
        String output = input.stream()
                .reduce("",(previousString, word)-> previousString + word +"\n" );
        System.out.println(output);
        

    }
}
