
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
           MagicSquareFactory msFactory = new MagicSquareFactory();
           System.out.println(msFactory.createMagicSquare(5));
       /* 
        int[][] matrix = {
            {0, 0, 1},
            {0, 1, 0},
            {1, 0, 0}
        };
        MagicSquare newSquare = new MagicSquare(matrix);
        System.out.println(newSquare.sumsOfDiagonals());
        */
    }
}
