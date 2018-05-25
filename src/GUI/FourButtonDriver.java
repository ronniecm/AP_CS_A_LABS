package GUI;
import javax.swing.*;

public class FourButtonDriver {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Four Button");
		frame.setLocation(0, 0);
		frame.setSize(1280, 730);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 
		frame.setContentPane(new FourButtonPanel());
		frame.setVisible(true);
		
		JFrame frame1 = new JFrame("Color Cycle");
		frame1.setLocation(0, 0);
		frame1.setSize(1280, 730);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setContentPane(new ColorCyclePanel());
		frame1.setVisible(true);
	}
}
