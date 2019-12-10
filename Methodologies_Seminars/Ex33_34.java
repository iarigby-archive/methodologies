import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Ex33_34 extends GraphicsProgram {

	private static final int MINRADIUS = 20;
	private static final int MAXRADIUS = 100;

	public void run() {
		drawRandomCircles(1000);
	}

	/**
	 * draws count number of random circles
	 */
	private void drawRandomCircles(int count) {
		for (int i=0; i<count; i++) {
			drawRandomCircle();
		}
	}
	/**
	 * draws a circle with random coordinates, diameter, color
	 */
	private void drawRandomCircle() {
		RandomGenerator rgen = new RandomGenerator();
		int diameter = rgen.nextInt(MINRADIUS, MAXRADIUS);
		// - diameter so the edges won't cut the circle
		int x = rgen.nextInt(getWidth() - diameter);
		int y = rgen.nextInt(getHeight() - diameter);
		Color color = rgen.nextColor();
		drawCircle(diameter, x, y, color);
	}

	/**
	 * draws a circle with specified x, y, diameter, color 
	 */
	private void drawCircle(int diameter, int x, int y, Color color) {
		GOval circle = new GOval(x, y, diameter, diameter);
		circle.setFillColor(color);
		circle.setFilled(true);
		add(circle);
		GPoint point = new GPoint(1, 2);
		circle.setLocation(point);
	}


}
