import acm.program.*;

public class Ex29 extends ConsoleProgram {
	public void run() {
		println("this program calculates fibonacci numbers: ");
		int n = readInt("enter the number: ");
		while (n > 0) {
			println("answer: " + fib(n));
			n = readInt("enter the number: ");
		}
	}

	/**
	 * calculates @param n-th fibonacci number
	 */
	private int fib(int n) {
		int previous = 1;
		int current = 1;
		// start calculating from 3rd, otherwise return 1
		for (int i = 2; i < n; i++) {
			int next = previous + current;
			previous = current;
			current = next;
		}
		return current;
	}
}