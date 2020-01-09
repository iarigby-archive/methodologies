import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Ex61 extends ConsoleProgram {
	
	public void run() {
		version2(readInt("enter n: "), readInt("enter m: "));
	}
	
	void version1(int n, int m) {
		
	}
	
	void version2(int n, int m) {
		findSumPairs(inputNumbers(n, m), m);
	}
	
	boolean[] inputNumbers(int n, int m) {
		boolean[] array = new boolean[m + 1];
		for (int i = 0; i < n; i++) {
			int number = readInt("enter number: ");
			// orjer m/2-is sheyvana
			if (number <= m) 
				array[number] = true;
		}
		return array;
	}
	
	ArrayList<Integer> inputNumbers(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(readInt("enter integer: "));
		return list;
	}
	
	void findSumPairs(boolean[] numbers, int m) {
		int length = numbers.length;
		for (int i = 0; i <= length/2; i++) {
			int complement = length - 1 -i;
			if (numbers[i] && numbers[complement])
				println(i + ", " + complement);
		}
	}
	
	void findSumPairs(ArrayList<Integer> numbers, int m) {
		
	}
	/* one more version:
	 * with sorted array list
	 */

}
