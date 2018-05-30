package GUI;
import javax.swing.*;
import java.awt.*;

public class Odometer extends JPanel {
	private JLabel hundreds;
	private JLabel tens;
	private JLabel ones;
	private int steps = 0;
	
	public Odometer()
	{
		setLayout(new FlowLayout());
		hundreds = new JLabel("" + steps / 100);
		hundreds.setOpaque(true);
		hundreds.setBackground(Color.black);
		hundreds.setForeground(Color.white);
		hundreds.setFont(new Font("Times New Roman", Font.BOLD, 48));
		tens = new JLabel("" + steps % 100 / 10);
		tens.setFont(new Font("Times New Roman", Font.BOLD, 48));
		tens.setOpaque(true);
		tens.setBackground(Color.black);
		tens.setForeground(Color.white);
		ones = new JLabel("" + steps % 10);
		ones.setFont(new Font("Times New Roman", Font.BOLD, 48));
		ones.setOpaque(true);
		ones.setBackground(Color.white);
		add(hundreds);
		add(tens);
		add(ones);
	}
	
	public void update()
	{
		steps++;
		hundreds.setText("" + steps / 100);
		tens.setText("" + steps % 100 / 10);
		ones.setText("" + steps % 10);
	}
	
}
