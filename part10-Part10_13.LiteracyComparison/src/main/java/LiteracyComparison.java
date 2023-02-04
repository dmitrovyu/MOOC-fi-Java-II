
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Literacy> input = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(s -> s.split(","))
                    .map(parts -> new Literacy(parts[0], parts[1], parts[2],parts[3], Integer.valueOf(parts[4]),Double.parseDouble(parts[5])))
                    .forEach(row -> input.add(row));
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        input.stream().sorted().forEach(row ->System.out.println(row));
                
        
                
        
        
            
       
        

    }
}
