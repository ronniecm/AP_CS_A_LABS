package GUI;

import javax.swing.JFrame;

public class HelloTextBoxDriver {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Text Box"); 
		frame.setSize(300, 200);
		frame.setLocation(365, 200); 
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); 
		frame.setContentPane (new HelloButtonTextBoxPanel());
		frame.setVisible(true);
	}

}
