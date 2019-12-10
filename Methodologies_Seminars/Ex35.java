import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Ex35 extends ConsoleProgram {

	public void run() {
		println(countAverageFlipsForTails(100));
	}
	
	/**
	 * Count the average number of coin flips required
	 * for getting tails in maxFlips amount of flips
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
			count++;
			int necessaryFlips = countFlipsUntilTails();
			sum += necessaryFlips;
		}
		// this time we don't check for count != 0 
		// because we do it 100 times
		return sum / count;
	}
	/**
	 * flips a coin until it gets tails
	 * @return number of flips before we got tails
	 */
	private int countFlipsUntilTails() {
		int count = 1;
		while (coinFlip()) {
			count++;
		}
		return count;
	}
	
	/**
	 * flips a coin
	 * @return true if it was heads , false if it was tails
	 */
	private Boolean coinFlip() {
		RandomGenerator rgen = new RandomGenerator();
		return rgen.nextBoolean(); 
	}
}
