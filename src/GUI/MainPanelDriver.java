package GUI;
import javax.swing.*;
import java.awt.*;

public class MainPanelDriver {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("My Frame");
		frame.setSize(1280, 730);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new MainPanel());
		frame.setVisible(true);
	}
}
