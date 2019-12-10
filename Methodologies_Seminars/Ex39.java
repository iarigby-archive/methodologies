import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.program.*;

public class Ex39 extends GraphicsProgram {
	/**
	 * this variable could be used in methods locally
	 * but since most methods reference it, it makes sense
	 * to have it accessible everywhere within the class
	 */
	private GOval circle;
	private static final int diameter = 20;
	private static final int slowness = 10;
	private int direction = 1;
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
	}
	@Override
	public void run() {
		createCircle();
		while(true) {
			move();
			if (isAtEdge())
				adjustDirection();
			pause(slowness);
		}
	}
	
	private void adjustDirection() {
		direction *= -1;
	}
	private void createCircle() {
		circle = new GOval(1, getHeight() / 2, diameter, diameter);
		add(circle);
	}
	private void move() {
		int deltaX = 1*direction;
		int deltaY = 0; 
		circle.setLocation(circle.getX() + deltaX, circle.getY() + deltaY);
	}
	
	private boolean isAtEdge() {
		return isAtHorizontalEdge() || isAtVerticalEdge();
	}
	
	private boolean isAtHorizontalEdge() {
		return circle.getX() + diameter >= getWidth() || circle.getX() <= 0;
	}
	
	private boolean isAtVerticalEdge() {
		return circle.getY() + diameter >= getHeight() || circle.getY() <= 0;
	}
	
	/**
	 * this method is not used here but can help for 
	 * other cases 
	 */
	private Boolean isAtPoint(GOval circle, GPoint point) {
		return circle.getLocation().equals(point);
	}
}
