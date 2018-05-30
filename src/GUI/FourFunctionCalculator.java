package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FourFunctionCalculator extends JPanel {
	private JPanel buttons;
	private JPanel opButtons;
	private NumberButton[][] numButtons;
	private JTextField calcText;
	private OpButton add;
	private OpButton subtract;
	private OpButton multiply;
	private OpButton divide;
	private NumberButton zero;
	private JButton equals;
	private String op;
	private int[] nums;
	private JButton clear;
	public FourFunctionCalculator()
	{
		nums = new int[2];
		setLayout(new BorderLayout());
		
		buttons = new JPanel();
		buttons.setLayout(new GridLayout(3, 3));
		add(buttons, BorderLayout.CENTER);
		
		numButtons = new NumberButton[3][3];
		
		int tracker = 1;
		
		for(int r = 0; r < numButtons.length; r++)
		{
			for(int c = 0; c < numButtons[0].length; c++)
			{
				numButtons[r][c] = new NumberButton(tracker++);
				numButtons[r][c].addActionListener(new NumListener(r, c));
				buttons.add(numButtons[r][c]);
			}
		}
		
		
		calcText = new JTextField("0", 10);
		add(calcText, BorderLayout.NORTH);
		
		opButtons = new JPanel();
		opButtons.setLayout(new FlowLayout());
		add(opButtons, BorderLayout.SOUTH);
		
		zero = new NumberButton(0);
		zero.addActionListener(new NumListener(100, 100));
		add = new OpButton("+");
		add.addActionListener(new Operation());
		subtract = new OpButton("-");
		subtract.addActionListener(new Operation());
		multiply = new OpButton("x");
		multiply.addActionListener(new Operation());
		divide = new OpButton("/");
		divide.addActionListener(new Operation());
		clear = new JButton("C");
		clear.addActionListener(new Clear());
		
		
		opButtons.add(add);
		opButtons.add(subtract);
		opButtons.add(zero);
		opButtons.add(multiply);
		opButtons.add(divide);
		opButtons.add(clear);
		
		equals = new JButton("=");
		equals.addActionListener(new Equals());
		add(equals, BorderLayout.EAST);
	}
	
	private class NumListener implements ActionListener
	{
		private int row, col;
		public NumListener(int r, int c)
		{
			row = r;
			col = c;
		}
		
		public void actionPerformed(ActionEvent e)
		{
			calcText.setEnabled(true);
			if(calcText.getText().equals("0"))
			{
				if(row == 100 && col == 100)
				{
					calcText.setText("0");
				} else {
					calcText.setText(numButtons[row][col].printVal());
				}
			} else {
				if(row == 100 && col == 100)
				{
					calcText.setText(calcText.getText() + "0");
				} else {
					calcText.setText(calcText.getText() + numButtons[row][col].printVal());
				}
			}
		}
	}
	
	private class Operation implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == add)
				op = add.getOp();
			else if(e.getSource() == subtract)
				op = subtract.getOp();
			else if(e.getSource() == multiply)
				op = multiply.getOp();
			else if(e.getSource() == divide)
				op = divide.getOp();
			
			nums[0] = Integer.parseInt(calcText.getText());
			calcText.setEnabled(false);
			calcText.setText("");
			
		}
	}
	
	private class Equals implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			nums[1] = Integer.parseInt(calcText.getText());
			
			double answer = 0;
			
			if(op.equals(add.getOp()))
				 answer = nums[0] + nums[1];
			else if(op.equals(subtract.getOp()))
				 answer = nums[0] - nums[1];
			else if(op.equals(multiply.getOp()))
				 answer = nums[0] * nums[1];
			else if(op.equals(divide.getOp()))
				 answer = (double)nums[0] / nums[1];
			
			calcText.setText("" + answer);
		}
	}
	
	private class Clear implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			nums[0] = 0;
			nums[1] = 0;
			op = "";
			calcText.setText("0");
		}
	}
	public static void main(String[] args)
	{
		if(true)
		{
			try {
				UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			} catch(Exception e) {
				e.getStackTrace();
			}
		}
		
		JFrame frame = new JFrame("Calculator");
		frame.setLocation(300, 250);
		frame.setSize(350, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new FourFunctionCalculator());
		frame.setVisible(true);
	}
}
