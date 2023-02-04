
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random rand = new Random();
        while(true){
            int result =rand.nextInt(40)+1;
            if (!containsNumber(result)) this.numbers.add(result);
            if (this.numbers.size()>6) break;
        }
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers 
        return numbers.stream().anyMatch(i -> (i == number));
    }
}

