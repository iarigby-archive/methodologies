import java.awt.event.ActionEvent;
import java.util.ArrayList;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import acmx.export.javax.swing.JButton;
import acmx.export.javax.swing.JTextField;

public class Ex68 extends GraphicsProgram {

	private JTextField message = new JTextField(30);
	private int startingPosition = 30;
	private int labelHeight = 15;
	private ArrayList<GLabel> messages = new ArrayList<GLabel>();
	private JButton upButton = new JButton("up");
	private JButton downButton = new JButton("down");
	int maxWidth;
	@Override
	public void run() {
		add(message, SOUTH);
		message.addActionListener(this);
		add(downButton, SOUTH);
		downButton.addActionListener(this);
		add(upButton, SOUTH);
		upButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == message) {		
			sendMessage();
		} else if (e.getSource() == upButton) {
			scroll(1);
		} else if (e.getSource() == downButton) {
			scroll(-1);
		}
	}
	
	private void sendMessage() {
			GLabel label = new GLabel(message.getText());
			messages.add(label);
			add(label);
			updateView();
			message.setText("");
	}
	
	private void updateView() {
		for (int i = 0; i < messages.size(); i++) {
			messages.get(messages.size() - i - 1).setLocation(15, getHeight() - startingPosition - i*labelHeight);
		}
	}
	private void scroll(int direction) {
		for (GLabel message : messages) {
			message.move(0, labelHeight*direction);
		}
	}
	
	
	// 
	//		messages.get(messages.size() - i - 1).setLocation(15, getHeight() - startingPosition - i*labelHeight);
}
