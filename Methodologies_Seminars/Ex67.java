import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import acmx.export.javax.swing.JButton;
import acmx.export.javax.swing.JLabel;

public class Ex67 extends GraphicsProgram{
	JTextField textfield = new JTextField(10);
	
	@Override
	public void run() {
		textfield.addActionListener(this);
		add(textfield, NORTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField elem = (JTextField) e.getSource();
		if (elem == textfield) {
			GImage img = new GImage(elem.getText(), 40, 40);
			img.setSize(img.getWidth() * 0.2, img.getHeight() * 0.2);
			add(img);
		}
	}
	
}
