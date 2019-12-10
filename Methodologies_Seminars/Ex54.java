import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Ex54 extends ConsoleProgram {

	public void run() {
		ArrayList<Integer> list = new ArrayList<>();		
		int n = readInt("how many numbers do you want to enter?: ");
		for (int i = 0; i < n; i++) {
			list.add(readInt(i + 1 + ": "));
		}
		// which cases would this code fail?
		println(findMaxAndRemove(list));
		println(findMaxAndRemove(list));
	}
	
	/**
	 * 
	 * @param list needs to have at least one element
	 */
	private int findMaxAndRemove(ArrayList<Integer> list) {
		int max = list.get(0);
		for (int i = 1; i< list.size(); i++) {
			int next = list.get(i);
			if ( next > max)
				max = next;
		}
		// remove works for duplicate items
		// 1. check when adding
		// 2. remove while contains
		// on objects you don't need indexOf
		list.remove(list.indexOf(max));
		return max;
	}
	/**
	 * 1. sort, get first 2
	 * 2. find max1, remove/compare to 1, find max
	 * [x]   have two ints 
	 * 3. keep array sorted, remove third element on each insert
	 *  add, sort, remove third
	 * 4. keep array with two max all the time, compare etc
	 */
	/**
	 * 1. save two ints, compare to each
	 * 2. save all to list,
	 * 		2.1 sort, get first two elements
	 * 		2.2 find max, remove, find max / compare to first max
	 * 
	 * 3. 
	 */
}
