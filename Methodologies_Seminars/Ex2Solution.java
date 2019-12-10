/*
import acm.program.*;
import acm.graphics.*;

	private Boolean isMultiplier(int number, int a, int b) {
		return (number % a == 0) && (number % b == 0);
	}
	private int lcm(int a, int b) {
		int max = Math.max(a, b);
		int result = max;
		while (! isMultiplier(result, a, b)) 
			result +=max;
		return result;
	}
	private Boolean isDivisor(int number, int a, int b) {
		return (a % number == 0) && (b % number == 0);
	}
	private int gcd(int a, int b)  {	
		int result = Math.min(a, b);
		while (!isDivisor(result, a, b))
			result--;
		return result;
	}
	public void run() {
		int a = readInt("Enter a: ");
		int b = readInt("Enter b: ");
		println("gcd is: " + gcd(a,b));
	}
	static final int startx = 80;
	static final int starty = 80;
	static final int width = 20;
	/**
	 * @param firstSquare will be black if 0, white if 1
	 *
	private void drawOneLine(int posy, int firstSquare, int length) {
		for (int i=0; i < length; i++) {
			GRect rect = new GRect(startx + i*width, posy, width, width);
			if (i % 2 == firstSquare) {
				rect.setFillColor(Color.BLACK);
				rect.setFilled(true);
			}
			add(rect);
		}
	}
	
	public void run() {
		drawOneLine(starty, 0, 7);
	}
	private Boolean isLcm(int i, int a, int b) {
		return (a % i == 0) && (b % i == 0);
	}
	public void run() {
		int a = readInt("Enter : a");
		int b = readInt("Enter : b");
		int min = Math.min(a,b);
		int max = Math.max(a,b);
		int i = max;
		while (!isLcm(i, a, b)) 
			i+=min;
		println("answer is: " );
	}
public class Ex2Solution extends GraphicsProgram {
	int height = 200;
	int width = height * 2;
	int posx = 150;
	int posy = 150;

	private void drawBody() {
		GRect rect = new GRect(posx, posy, width, height);
		add(rect);
	}
	
	private void drawRoof() {
		int roofMiddle = posx + width/2;
		int roofHeight = posy - height / 3;
		GLine line = new GLine(posx, posy, roofMiddle, roofHeight);
		add(line);
		GLine line2 = new GLine(roofMiddle, roofHeight, posx + width, posy);
		add(line2);
	}
	
	private void drawDoor() {
		
	}
	
	private void drawWindows() {
	}
	
	public void run() {
		drawBody();
		drawRoof();
		drawDoor();
		drawWindows();
	}
 
}
*/