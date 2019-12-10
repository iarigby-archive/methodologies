import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class MidtermExamples extends ConsoleProgram {
	public void run(){
		println(hello(x,s.charAt(4)-s.charAt(3)));
		println(hello((int)y,(double)x/2+x+1));
		}
		public int hello(int x1, double y1){
		x = goodbye((double)x1/y, x1+y);
		y = goodbye(x, (int)y1);
		return x+(int)y;
		}
		public int goodbye(double x1, double y){
		int z = x + '4'-'6';
		return z+(int)y;
		}
		private int x = 0;
		private double y = 1;
		private String s = "U Mad?";

	/**	
	public void run() {
		Ex4();
	}
		private void Ex4() {
			StringTokenizer s = new StringTokenizer(" add, bc, d", "d");
			println(s.nextToken());
			println(s.nextToken());
			println(2);
			println(s.nextToken(" "));
			println(3);
			println(s.nextToken(" "));
			println(4);
			println(s.nextToken(" "));
			println(5);
		}
		*/
		
}
