import acm.program.ConsoleProgram;
class MyClass {
	static int x;
}
public class StringExample extends ConsoleProgram {
	@Override
	public void run() {
		// what does it mean to be immutable?
		String s = "abc";
		s.substring(0,2);
		println(s); 
		
		
		
		
		
		
		int i=0;
		int n = MyClass.x;
		MyClass c = new MyClass();
		int m = c.x;
		c.x = 3;
		MyClass.x = 4;
		println(c.x);
	}
	private int plus(int n) {
		n = n + 1;
		return n;
	}
}
