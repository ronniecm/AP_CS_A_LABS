package GUI;
import javax.swing.*;

public class Driver01 {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Application");
		frame.setSize(1000, 2000);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel01());
		frame.setVisible(true);
	}
}
