package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel02 extends JPanel {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JTextField southText;
	
	public Panel02()
	{
		setLayout(new BorderLayout());
		
		button1 = new JButton("This is a normal compass.");
		button1.setOpaque(true);
		button1.setBackground(Color.RED);
		button1.setBorderPainted(false);
		button1.addActionListener(new Listener1());
		button1.setFont(new Font("Helvetica", Font.ITALIC, 24));
		add(button1, BorderLayout.NORTH);
		
		button2 = new JButton("It goes on a map");
		button2.setOpaque(true);
		button2.setBackground(Color.BLUE);
		button2.setBorderPainted(false);
		button2.addActionListener(new Listener1());
		button2.setFont(new Font("Arial", Font.BOLD, 24));
		add(button2, BorderLayout.WEST);
		
		button3 = new JButton("It is correct.");
		button3.setOpaque(true);
		button3.setBackground(Color.GREEN);
		button3.setBorderPainted(false);
		button3.addActionListener(new Listener1());
		button3.setFont(new Font("Sans-Serif", Font.ITALIC, 24));
		add(button3, BorderLayout.EAST);
		
		button4 = new JButton("Not upside down");
		button4.setOpaque(true);
		button4.setBackground(Color.ORANGE);
		button4.setBorderPainted(false);
		button4.addActionListener(new Listener1());
		button4.setFont(new Font("Times New Roman", Font.BOLD, 24));
		add(button4, BorderLayout.SOUTH);
		
		ImageIcon pic = new ImageIcon("compass.jpg");
		button5 = new JButton(pic);
		button5.setOpaque(true);
		button5.setBackground(Color.YELLOW);
		button5.setBorderPainted(false);
		button5.addActionListener(new Listener1());
		add(button5, BorderLayout.CENTER);
		

		southText = new JTextField(240);
		button4.add(southText);
		southText.addActionListener(new Listener2());
	}
	
	private class Listener1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			button1.setText("This is a bad compass");
			button2.setText("It does not belong on a map");
			button3.setText("It is wrong");
			button4.setText("It is upside down");
			ImageIcon newPic = new ImageIcon("upsideDown.jpg");
			button5.setIcon(newPic);
		}
	}
	
	private class Listener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			button1.setBackground(Color.WHITE);
			button2.setBackground(Color.WHITE);
			button3.setBackground(Color.WHITE);
			button4.setBackground(Color.WHITE);
			button5.setBackground(Color.WHITE);
		}
	}
}
