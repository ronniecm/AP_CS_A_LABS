package GUI;
import javax.swing.*;

public class Driver00 {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("My First GUI");
		frame.setSize(1500, 1600);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel00());
		frame.setVisible(true);
	}
}
 