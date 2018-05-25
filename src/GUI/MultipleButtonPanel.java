package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultipleButtonPanel extends JPanel {
	private JLabel number;
	private JPanel buttons;
	private JButton random;
	private JButton cubeRoot;
	private JButton reci;
	private JButton quit;
	
	public MultipleButtonPanel()
	{
		setLayout(new BorderLayout());
		
		number = new JLabel("0.0");
		number.setForeground(Color.BLUE);
		number.setFont(new Font("Times New Roman", Font.BOLD, 36));
		add(number, BorderLayout.NORTH);
		number.setHorizontalAlignment(SwingConstants.CENTER);
		
		buttons = new JPanel();
		buttons.setLayout(new FlowLayout());
		add(buttons, BorderLayout.CENTER);
		
		random = new JButton("Random");
		random.addActionListener(new Listener());
		buttons.add(random);
		
		cubeRoot = new JButton("Cube Root");
		cubeRoot.addActionListener(new Listener());
		buttons.add(cubeRoot);
		
		reci = new JButton("Reciprocal");
		reci.addActionListener(new Listener());
		buttons.add(reci);
		
		quit = new JButton("Quit");
		quit.addActionListener(new Listener());
		buttons.add(quit);
	}
	
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == random) {
				Double rand = new Double(Math.random());
				number.setText("" + rand);
			} else if(e.getSource() == cubeRoot) {
				Double num = new Double(Double.parseDouble(number.getText()));
				number.setText("" + Math.cbrt(num));
			} else if(e.getSource() == reci) {
				Double num = new Double(Double.parseDouble(number.getText()));
				number.setText("" + (1 / num));
			} else if(e.getSource() == quit){
				System.exit(0);
			} 
		}
	}
}
