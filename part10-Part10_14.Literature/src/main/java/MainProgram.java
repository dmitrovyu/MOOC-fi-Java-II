import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Book> literature = new ArrayList<>();
        while(true) {
            System.out.println("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            String bookName = input;
            System.out.println("Input the age recommendation: ");
            input = scanner.nextLine();
            int age = Integer.valueOf(input);
            literature.add(new Book(bookName,age));
      
        }
        System.out.println(literature.size() + " books in total.");
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getBookName);
                
        Collections.sort(literature,comparator);
        
        for (Book e:literature){
            System.out.println(e);
        }
        
      /*  literature.stream()
                .sorted()
                
                .forEach(book -> System.out.println(book));
      */
    }

}
