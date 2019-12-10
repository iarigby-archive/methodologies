import acm.program.ConsoleProgram;

public class Ex58 extends ConsoleProgram {
	public void run() {
		while (true) {
			String text1 = readLine("enter first string: ");
			String text2 = readLine("enter second string: ");
			if (isAnagram(text1, text2)) {
				println("words are anagrams");
			} else {
				println("words are not anagrams");
			}
		}
	}

	private boolean isAnagram(String text1, String text2) {
		int[] text1count = countChars(text1);
		int[] text2count = countChars(text2);
		return compareArrays(text1count, text2count);
	}

	private int[] countChars(String text) {
		// 0. if this was array of objects you would need to first
		// call constructors for each
		int result[] = new int[26];
		for (int i = 0; i < text.length(); i++) {
			int index = text.charAt(i) - 'a';
			result[index]++;
		}
		return result;
	}

	private boolean compareArrays(int[] arr1, int[] arr2) {
		// not necessary now but in case you ned it
		if (arr1.length != arr2.length)
			return false;
		
		for (int i = 0; i < arr1.length; i++)
			if (arr1[i] != arr2[i])
				return false;
		return true;
	}

}
