import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Ex42_extend extends GraphicsProgram {

	private GLine line;
	public void run() {
		addMouseListeners();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (line == null) 
			line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		line.setEndPoint(e.getX(), e.getY());
	}

}
