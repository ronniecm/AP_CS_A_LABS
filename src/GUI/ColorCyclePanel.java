package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorCyclePanel extends JPanel {
	private JButton cycleButton;
	
	public ColorCyclePanel()
	{	
		setLayout(new BorderLayout());
		setOpaque(true);
	
		cycleButton = new JButton("Cycle Buttons");
		cycleButton.addActionListener(new Listener());
		add(cycleButton, BorderLayout.NORTH);
	}
	
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(getBackground().equals(new Color(238, 238, 238)) || getBackground().equals(Color.GRAY))
				setBackground(Color.RED);
			else if(getBackground().equals(Color.RED))
				setBackground(Color.GREEN);
			else if(getBackground().equals(Color.GREEN))
				setBackground(Color.BLUE);
			else
				setBackground(Color.GRAY);
		}
	}
}
