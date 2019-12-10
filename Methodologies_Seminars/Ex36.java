import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Ex36 extends ConsoleProgram {

	private final static int OCCURENCECOUNT = 3;

	public void run() {
		println(countAverageFlipsForTails(100));
	}
	
	/**
	 * Count the average number of coin flips required
	 * for getting OCCURENCECOUNT tails in maxFlips amount of flips
	 * 
	 * this number will get closer to 2 as maxFlips gets large
	 */
	private int countAverageFlipsForTails(int maxFlips) {
		/**
		 * structure of the solution is the same as in 
		 * finding the average. the only difference is that
		 * instead of user input, we get the next number from
		 * a method
		 */
		int count = 0;
		int sum = 0;
		while (count < maxFlips) {
			println("test " + count);
			count++;
			int necessaryFlips = countFlipsUntilHeads(OCCURENCECOUNT);
			sum += necessaryFlips;
			println("result: " + necessaryFlips);
		}
		// this time we don't check for count != 0 
		// because we do it 100 times
		return sum / count;
	}
	/**
	 * flips a coin until it gets tails 
	 * @return number of flips before we got occurenceCount tails 
	 */
	private int countFlipsUntilHeads(int occurenceCount) {
		int flipCount = 1;
		int tailsCount = 0;
		while (tailsCount < occurenceCount) {
			if (coinFlip()) {
				tailsCount++;
			} else {
				tailsCount = 0;
			}
			flipCount++;
		}
		return flipCount;
	}
	
	/**
	 * flips a coin
	 * @return true if it was tails, false if it was heads
	 */
	private Boolean coinFlip() {
		RandomGenerator rgen = new RandomGenerator();
		return rgen.nextBoolean(); 
	}
}
