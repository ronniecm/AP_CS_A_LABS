package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class SubwayTokens extends JPanel {
	private JLabel label;
	private JButton plusOne;
	private JButton plusTenCents;
	private JButton plusOneCent;
	private JButton minusOne;
	private JButton minusTenCents;
	private JButton minusOneCent;
	private double amount = 0.00;

	public SubwayTokens()
	{
		DecimalFormat d = new DecimalFormat("$0.00");
		setLayout(new BorderLayout());
		label = new JLabel(d.format(amount));
		label.setFont(new Font("Times New Roman", Font.BOLD, 36));
		add(label, BorderLayout.NORTH);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(2, 3));
		add(buttons, BorderLayout.CENTER);
		
		plusOne = new JButton("+1.00");
		plusTenCents = new JButton("+0.10");
		plusOneCent = new JButton("+0.01");
		minusOne = new JButton("-1.00");
		minusTenCents = new JButton("-0.10");
		minusOneCent = new JButton("-0.01");
		
		plusOne.addActionListener(new Listener());
		plusTenCents.addActionListener(new Listener());
		plusOneCent.addActionListener(new Listener());
		minusOne.addActionListener(new Listener());
		minusTenCents.addActionListener(new Listener());
		minusOneCent.addActionListener(new Listener());

		
		buttons.add(plusOne);
		buttons.add(plusTenCents);
		buttons.add(	plusOneCent);
		buttons.add(minusOne);
		buttons.add(minusTenCents);
		buttons.add(minusOneCent);
	}
	
	private class Listener implements ActionListener
	{
		DecimalFormat d = new DecimalFormat("0.00");
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == plusOne)
				amount += 1.00;
			else if(e.getSource() == plusTenCents)
				amount += 0.10;
			else if(e.getSource() == plusOneCent)
				amount += 0.01;
			else if(e.getSource() == minusOne)
				amount -= 1.00;
			else if(e.getSource() == minusTenCents)
				amount -= 0.10;
			else if(e.getSource() == minusOneCent)
				amount -= 0.01;
			
			label.setText("$" + d.format(amount));
		}
	}
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Subway Tokens");
		frame.setLocation(400, 300);
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 
		frame.setContentPane(new SubwayTokens());
		frame.setVisible(true);
	}
}
