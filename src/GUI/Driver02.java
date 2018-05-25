package GUI;
import javax.swing.*;

public class Driver02 {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("GUI03");
		frame.setSize(1280, 730);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel02());
		frame.setVisible(true);
	}
}
