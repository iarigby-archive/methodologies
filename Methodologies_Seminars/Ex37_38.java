import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Ex37_38 extends ConsoleProgram {
	private int balance = 1000 ;
	private final static RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		while (balance > 0) {
			play();
			println("your balance is: " + balance);
		}
		println("you ran out of balance");
	}
	
	/**
	 * asks user for bet and places the bet
	 * if the user has enough balance
	 */
	private void play() {		
		int bet = readInt("how much do you want to bet? ");
		if (bet <= balance) {
			doOneRound(bet);
		} else {
			println("you don't have enough money to bet");
		}
	}
	
	/**
	 * asks user for number and places a bet on it
	 * @param bet assumes that user already has that amount on balance
	 */
	private void doOneRound(int bet) {
		int number = readInt("which number is your bet? ");
		balance -= bet;
		int rouletteResult = spinRoulette();
		println("roulette stopped on " + rouletteResult);
		if (rouletteResult == number)
			balance += 2*bet;
	}
	
	/**
	 * simulates spin of the roulette
	 */
	private int spinRoulette() {
		return rgen.nextInt(36);
	}
	
	
}
