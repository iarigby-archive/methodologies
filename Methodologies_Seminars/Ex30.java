import acm.program.ConsoleProgram;

public class Ex30 extends ConsoleProgram {
	public void run() {
		println("this program reverses a number");
		int n = readInt("enter the number: ");
		while (n != 0) {
			println("answer: " + reverse(n));
			n = readInt("enter the number: ");
		}
	}
	
	/**
	 * reverses the digits of number n @param n
	 * example return 4321 for 1234
	 */
	private int reverse(int n) {
		int result = 0;
		while (n != 0) {
			int lastDigit = n % 10; 
			result = result*10 + lastDigit; // append last digit
			n /= 10; // "delete" last digit
		}
		return result;
	}
}
