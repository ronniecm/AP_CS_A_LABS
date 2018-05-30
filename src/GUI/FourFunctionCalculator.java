package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FourFunctionCalculator extends JPanel {
	private JPanel buttons;
	private JPanel opButtons;
	private NumberButton[][] numButtons;
	private JTextField calcText;
	private JButton decimal;
	private OpButton add;
	private OpButton subtract;
	private OpButton multiply;
	private OpButton divide;
	private NumberButton zero;
	private JButton equals;
	private String op;
	private double[] nums;
	private JButton clear;
	private int pushes = 0;
	private boolean pushed = false;
	
	public FourFunctionCalculator()
	{
		nums = new double[2];
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
		calcText.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		calcText.setHorizontalAlignment(SwingConstants.RIGHT);
		add(calcText, BorderLayout.NORTH);
		
		opButtons = new JPanel();
		opButtons.setLayout(new FlowLayout());
		add(opButtons, BorderLayout.SOUTH);
		
		decimal = new JButton(".");
		decimal.addActionListener(new NumListener(101, 101));
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
		
		
		opButtons.add(decimal);
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
			if(pushed || calcText.getText().equals("0"))
			{
				calcText.setText("");
				pushed = false;
				if(row == 100 && col == 100)
				{
					calcText.setText("0");
				} else if(row == 101 && col == 101) {
					calcText.setText(".");
				} else {
					calcText.setText(numButtons[row][col].printVal());
				}
			} else {
				if(row == 100 && col == 100)
				{
					calcText.setText(calcText.getText() + "0");
				} else if(row == 101 && col == 101) {
					calcText.setText(calcText.getText() + ".");
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
			pushes++;
			pushed = true;
			System.out.println(pushes);
			if(pushes > 1)
			{
				nums[1] = Double.parseDouble(calcText.getText());
				calculate();
			}
			
			nums[0] = Double.parseDouble(calcText.getText());
			
			if(e.getSource() == add)
				op = add.getOp();
			else if(e.getSource() == subtract)
				op = subtract.getOp();
			else if(e.getSource() == multiply)
				op = multiply.getOp();
			else if(e.getSource() == divide)
				op = divide.getOp();
			
			System.out.print("changed op");
			
			
			System.out.println(nums[0]);
			//calcText.setText("");
			
		}
	}
	
	private class Equals implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			nums[1] = Double.parseDouble(calcText.getText());
			
			calculate();
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
			pushes = 0;
		}
	}
	
	public void calculate()
	{
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
		System.out.println(calcText.getText());
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
