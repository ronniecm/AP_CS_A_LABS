package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel04 extends JPanel{
	private Odometer odo;
	private JPanel buttonPanel;
	
	public Panel04()
	{
		setLayout(new BorderLayout());
		
		odo = new Odometer();
		add(odo, BorderLayout.NORTH);
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		add(buttonPanel, BorderLayout.CENTER);
		
		JButton button = new JButton("Step");
		button.addActionListener(new Listener());
		buttonPanel.add(button);
		button.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			odo.update();
		}
	}
	
	public static void main(String[] args)
	{
		if(true)
		{
			try {
				UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			} catch(Exception e) {
				e.getStackTrace();
			}
		}
		JFrame frame = new JFrame("Odometer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500, 500);
		frame.setSize(400, 200);
		frame.setContentPane(new Panel04());
		frame.setVisible(true);
	}
}
