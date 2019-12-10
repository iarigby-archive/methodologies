import acm.program.ConsoleProgram;

public class Ex48 extends ConsoleProgram {
	@Override
	public void run() {
		String text = readLine("enter text: ");
		printStatistics(text);
	}
	
	private void printStatistics(String text) {
		String withoutDuplicates = removeDuplicates(text);
		for (int i=0; i < withoutDuplicates.length(); i++) {
			char c = withoutDuplicates.charAt(i);
			int count = countChars(text, c);
			println(c + ": " + count);
		}
	}
	
	private String removeDuplicates(String text) {
		return "";
	}
	
	private String removeDuplicate(String text, char c) {
		return "";
	}
	private int countChars(String text, char c) {
		int sum = 0;
		for (int i = 0; i < text.length(); i++)
			if (text.charAt(i) == c)
				sum++;
		return sum;
	}

}
