import java.io.BufferedReader;

import acm.program.ConsoleProgram;

public class FileReader extends ConsoleProgram {

	public FileReader(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		try {
			FileReader f = new FileReader("FileReader.java");
		BufferedReader br = new BufferedReader());
		} catch (Exception e) {
			
		}
	}
}







/** 1. try to separate constructors
		BufferedReader br = new BufferedReader(new FileReader("FileReader.java").getReader());
*/

/** 2. Always do this first:
		FileReader f = new FileReader("FileReader.java");
		BufferedReader br = new BufferedReader(f.getReader());
*/