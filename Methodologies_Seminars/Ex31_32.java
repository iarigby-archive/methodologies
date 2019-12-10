import acm.program.ConsoleProgram;

public class Ex31_32 extends ConsoleProgram {
	public void run() {
	//	printPrimeNumbers(1000000);
		println("this program calculates if a number is prime or not");
		int n = readInt("enter the number: ");
		while (n > 0) {
			println("answer: " + isPrime(n));
			n = readInt("enter the number: ");
		}
	}
	
	/**
	 * prints first n prime numbers to console
	 */
	private void printPrimeNumbers(int n) {
		for (int i = 1; i < n; i++) {
			if (isPrime(i))
				println(i);
		}
	}
	
	/** 
	 * @return whether n is prime or not
	 */
	private Boolean isPrime(int n) {
		// start at 2 to skip the loop and return true for 1
		// check until square root because any pair of 
		// divisors includes one before sqrt, and one after
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (isDivisor(i, n))
				// return as soon as first divisor is found
				// short circuit evaluation
				return false;
		}
		return true;
	}
	
	/**
	 * returns if a is a divisor of b 
	 */
	private Boolean isDivisor(int a, int b) {
		return b % a == 0;
	}
}
