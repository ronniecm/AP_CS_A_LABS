package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HelloButtonTextBoxPanel extends JPanel{
	
	private JPanel nPanel;
	private JTextField input;
	private JButton sqrt;
	private JLabel answer;
	
	public HelloButtonTextBoxPanel()
	{
		setLayout(new BorderLayout());
		
		nPanel = new JPanel();
		nPanel.setLayout(new FlowLayout());
		add(nPanel, BorderLayout.NORTH);
		
		input = new JTextField("0.0", 10);
		input.addActionListener(new Listener());
		nPanel.add(input);
		
		sqrt = new JButton("SQRT");
		sqrt.addActionListener(new Listener());
		nPanel.add(sqrt);
		
		answer = new JLabel("0.0");
		answer.setFont(new Font("Times New Roman", Font.BOLD, 48));
		add(answer, BorderLayout.CENTER);
		answer.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double inputNum = Double.parseDouble(input.getText());
			Double ans = new Double(Math.sqrt(inputNum));
			if(inputNum >= 0)
				answer.setText("" + ans);
			else
				answer.setText("Error.");
		}
	}
}
