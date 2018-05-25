package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FourButtonPanel extends JPanel {
	private JButton red;
	private JButton green;
	private JButton blue;
	private JButton gray;
	
	public FourButtonPanel()
	{
		setOpaque(true);
		
		setLayout(new FlowLayout());
		
		red = new JButton("Red");
		green = new JButton("Green");
		blue = new JButton("Blue");
		gray = new JButton("Gray");
		
		red.addActionListener(new Listener());
		green.addActionListener(new Listener());
		blue.addActionListener(new Listener());
		gray.addActionListener(new Listener());
		
		add(red);
		add(green);
		add(blue);
		add(gray);
	}
	
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == red)
				setBackground(Color.red);
			else if(e.getSource() == green)
				setBackground(Color.green);
			else if(e.getSource() == blue)
				setBackground(Color.blue);
			else
				setBackground(Color.gray);
		}
	}
	

}
