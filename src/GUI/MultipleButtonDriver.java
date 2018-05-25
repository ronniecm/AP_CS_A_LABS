package GUI;

import javax.swing.*;

public class MultipleButtonDriver {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Multiple Buttons");
		frame.setSize(500, 300);
		frame.setLocation(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new MultipleButtonPanel());
		frame.setVisible(true);
	}
}
