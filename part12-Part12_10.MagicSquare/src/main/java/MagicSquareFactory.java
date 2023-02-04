
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        
       
		int currentRow = 0;
		//first value is in the middle of the square
		int currentCol = size / 2;
		//places 1 in the middle of the top row
		square.placeValue(currentCol, currentRow, 1);

		for (int i = 2; i <= size*size  ; i++) {
			
			int nextRow = currentRow - 1;

			
			if (nextRow < 0) {
				nextRow = square.getHeight() - 1;
			}

			
			int nextCol = currentCol + 1;
			if (nextCol >= square.getWidth()) {
				nextCol = 0;
			}

			
			int nextBoxValue = square.readValue(nextCol, nextRow);

			if (nextBoxValue != 0) {
				nextRow = currentRow + 1;
				nextCol = currentCol;
			}

			square.placeValue(nextCol, nextRow, i);
			currentRow = nextRow;
			currentCol = nextCol;
		}
        return square;
    }
}