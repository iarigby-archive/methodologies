import acm.program.ConsoleProgram;

public class Ex59 extends ConsoleProgram {
	
	public void run() {
		int n = 25, m = 26;
		int[][] matrix = new int[n][m];
		println(getMaximumSquareSize(matrix));
	}
	
	private int getMaximumSquareSize(int[][] matrix) {
		int max = 1;
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[0].length; y++) {
				int maxOnCoordinate = findBiggestSquare(matrix, x, y);
				if (maxOnCoordinate > max)
					max = maxOnCoordinate;
			}
		}
		return max;
	}
	private int findBiggestSquare(int[][] matrix, int x, int y) {
		int max = 0;
		for (int length = 1; length < matrix.length - x; length++) {
			for (int width = 1; width < matrix[0].length; width++) {
				// if ()
			}
		}
		return max;
	}

}
