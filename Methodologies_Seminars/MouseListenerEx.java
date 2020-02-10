import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class MouseListenerEx extends GraphicsProgram {
	
	private GOval circle;
	private GLabel label;
	private final int diameter = 30;
	private final int vy = 10;
	@Override
	public void init() {
		label = new GLabel("x will be here");
		add(label, 200, 200);
		addMouseListeners();
	}
	
	@Override
	public void run() {
//		while(true) {
//			if (circle != null)
//				drop(circle);
//			pause(50);
//		}
	}
	
	private void drop(GOval circle) {
		if (!atBottom(circle))
			circle.move(0, vy);
	}

	private boolean atBottom(GOval circle) {
		return circle.getY() + vy + diameter >= getHeight();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		label.setLabel("dragged");
	}

	private void createCircle(int x, int y) {
			circle = new GOval(x, y, diameter, diameter);
			add(circle);
	}

}
