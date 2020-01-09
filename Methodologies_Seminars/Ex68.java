import java.awt.event.ActionEvent;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import acmx.export.javax.swing.JTextField;

public class Ex68 extends GraphicsProgram {

	private JTextField message = new JTextField(30);
	private int startingPosition = 10;
	private int messageCount = 0;
	private int gap = 10;
	@Override
	public void run() {
		add(message, SOUTH);
		message.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField elem = (JTextField) e.getSource();
		GLabel label = new GLabel(elem.getText());
		add(label, 10, getNextPosition(label.getHeight()));
		elem.setText("");
	}
	
	private double getNextPosition(double labelHeight) {
		messageCount++;
		return startingPosition + (gap + labelHeight) * messageCount;
	}
}
