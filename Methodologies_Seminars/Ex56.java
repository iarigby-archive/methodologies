import java.util.ArrayList;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Ex56 extends ConsoleProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		String line = "abc";
		println("press enter to exit");
		while (line != "") {
			line = readLine("enter array: ");
			println(bogoSort(readArray(line)));
		};
	}
	
	private ArrayList<Integer> bogoSort(ArrayList<Integer> list) {
		while (!isSorted(list)) 
			list = shuffle(list);
		return list;
	}
	
	private boolean isSorted(ArrayList<Integer> list) {
		for (int i = 1; i < list.size(); i++)
			if (list.get(i - 1) > list.get(i))
				return false;
		return true;
	}
	
	private ArrayList<Integer> shuffle(ArrayList<Integer> list) {
		ArrayList<Integer> shuffled = new ArrayList<>();
		while(!list.isEmpty())  {
			int nextIndex = rgen.nextInt(list.size());
			shuffled.add(list.remove(nextIndex));
		}
		return shuffled;
	}
	
	
	private ArrayList<Integer> readArray(String line) {
		ArrayList<Integer> list = new ArrayList<>();
		StringTokenizer tk = new StringTokenizer(line, ",");
		while (tk.hasMoreTokens())
			list.add(Integer.parseInt(tk.nextToken()));
		return list;
	}
}
