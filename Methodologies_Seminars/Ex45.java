import acm.program.ConsoleProgram;

public class Ex45 extends ConsoleProgram {
	@Override
	public void run() {
		String text = readLine("enter text: ");
		char maxCharacter = countMaxOccurence(text.toLowerCase());
		println(maxCharacter);
	}
	
	private char countMaxOccurence(String text) {
		char maxChar = ' ';
		int maxCharCount = 0;
		for (int i = 0; i < text.length(); i++) {
			char currentChar = text.charAt(i);
			int currentCharCount = countOccurence(text, currentChar);
			if (currentCharCount > maxCharCount) {
				maxChar = currentChar;
				maxCharCount = currentCharCount;
			}
		}
		return maxChar;
	}
	
	private int countOccurence(String text, char ch) {
		int numOccurences = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ch)
				numOccurences++;
		}
		return numOccurences;
	}
}
