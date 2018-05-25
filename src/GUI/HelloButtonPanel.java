package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloButtonPanel extends JPanel{
	private JLabel label;
	
	public HelloButtonPanel()
	{
		setLayout(new FlowLayout());
		
		label = new JLabel("0.0000000000000");
		label.setFont(new Font("Serif", Font.BOLD, 20));
		label.setForeground(Color.blue);
		add(label);
		
		JButton button = new JButton("Random");
		button.addActionListener(new Listener());
		add(button);
	}
	
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double x = Math.random();
			label.setText("" + x);
		}
	}
}
