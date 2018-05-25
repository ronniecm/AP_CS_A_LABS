package GUI;
import javax.swing.*;
import java.awt.*;

public class Panel00 extends JPanel {
	private JLabel label1;
	private JButton button1;
	
	public Panel00()
	{
		setLayout(new FlowLayout());
		label1 = new JLabel("My First Label");
		button1 = new JButton("HI");
		add(label1);
		add(button1);
	}
}
