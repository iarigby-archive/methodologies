import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Ex44 extends GraphicsProgram {
	
	private GOval circle;
	private final int diameter = 30;
	private final int vy = 10;
	@Override
	public void init() {
		addMouseListeners();
	}
	
	@Override
	public void run() {
		while(true) {
			if (circle != null)
				drop(circle);
			pause(50);
		}
	}
	
	private void drop(GOval circle) {
		if (!atBottom(circle))
			circle.move(0, vy);
	}

	private boolean atBottom(GOval circle) {
		return circle.getY() + vy + diameter >= getHeight();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (circle == null)
			createCircle(e.getX(), e.getY());
		else
			circle.setLocation(e.getX(), e.getY());
	}

	private void createCircle(int x, int y) {
			circle = new GOval(x, y, diameter, diameter);
			add(circle);
	}

}
