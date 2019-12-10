import acm.program.ConsoleProgram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex52 extends ConsoleProgram {
	
	@Override
	public void run() {
		
		println("a" + "\n" + "b");
			String text="";
		String sentenceEndings = ".?!";
		int sentenceCount = 0;
		for (int i = 0; i < sentenceEndings.length(); i++) {
			sentenceCount += countOccurence(text, sentenceEndings.charAt(i));
		}
	}	
	private int countOccurence(String text, char c) {
		// 
		return 0;
	}
	private void bla() {	
		try {
			readFile();
		} catch (FileNotFoundException e) {
			println(e.getStackTrace());
			println("could not find file");
		} catch (IOException e) {
			println("unknwon io exception occured");
		}
	}
	
	private void readFile() throws IOException {
			FileReader f = new FileReader("Ex52.java");
			BufferedReader bf = new BufferedReader(f);
			String line = bf.readLine();
			while (line != null) {
				println(line);
				line = bf.readLine();
			}
			bf.close();
	}
}
