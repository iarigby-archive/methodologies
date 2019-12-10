import acm.program.ConsoleProgram;

public class Ex45_46 extends ConsoleProgram {
	
	@Override
	public void run() {
		String text = readLine("Enter Text: ");
		char maxCharacter = countMaxOccurence(text.toLowerCase());
		println("Character with most occurences was: " + maxCharacter);
	}
	
	/*
	 * returns character that occurs most times in @param text
	 */
	private char countMaxOccurence(String text) {
		// prints 'nothing' if user entered nothing
		char maxChar = ' ';
		int maxCharCount = 0;
		for (int i = 0; i < text.length(); i++) {
			char currentChar = text.charAt(i);
			// inefficient, better to loop over unique chars
			// solution in Ex 48 I think
			int currentCharCount = countOccurence(text, currentChar);
			if (currentCharCount > maxCharCount) {
				maxChar = currentChar;
				maxCharCount = currentCharCount;
			}
		}
		return maxChar;
	}
	
	/**
	 * extra steps:
	 * - handle empty strings
	 */
	private void Ex45() {
		// do not need to handle empty string in first input
		// because for loop ends at text.lengt() and returns initial
		// value of numOccurences
		String text = readLine("Enter Text: ");
		String characterText = readLine("Enter character: ");
		// characterText == null won't work because it's just an empty string
		while (characterText.length() == 0)
			characterText = readLine("Hey! enter at least one char: ");
		int occurences = countOccurence(text.toLowerCase(), characterText.charAt(0))
		println(characterText + " occured " + occurences + " times.");
	}
	
	/**
	 * @return how many times @param character occurs in @param text
	 */
	private int countOccurence(String text, char character) {
		int numOccurences = 0;
		for (int i = 0; i < text.length(); i++) {
			// can use == because char is a primitive type
			if (text.charAt(i) == character)
				numOccurences++;
		}
		return numOccurences;
	}
}
