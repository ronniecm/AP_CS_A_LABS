package GUI;
import javax.swing.*;

public class HelloButtonDriver {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Hello Button"); 
		frame.setSize (400, 350);
		frame.setLocation (200, 200); 
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 
		frame.setContentPane (new HelloButtonPanel());
		frame.setVisible(true);
	}
}
