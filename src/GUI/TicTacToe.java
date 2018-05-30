package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JPanel {
	private JButton[][] buttons;
	private String player;
	private int moves = 0;
	private JPanel resultPanel;
	private JLabel result;
	
	public TicTacToe()
	{
		setLayout(new BorderLayout());
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3,3));
		add(buttonPanel, BorderLayout.CENTER);
		
		buttons = new JButton[3][3];
		for(int r = 0; r < buttons.length; r++)
		{
			for(int c = 0; c < buttons[0].length; c++)
			{
				buttons[r][c] = new JButton();
				buttons[r][c].setFont(new Font("Times New Roman", Font.BOLD, 36));
				buttons[r][c].addActionListener(new Listener(r, c));
				buttonPanel.add(buttons[r][c]);
			}
		}
		
		player = "X";
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new reset());
		add(reset, BorderLayout.SOUTH);
	}
	
	private class Listener implements ActionListener
	{
		private int row, col;
		public Listener(int r, int c)
		{
			row = r;
			col = c;
		}
		
		public void actionPerformed(ActionEvent e)
		{
			
			buttons[row][col].setText(player);
			moves++;
			buttons[row][col].setEnabled(false);
			
			if(checkForWin(buttons, player))
			{
				resultPanel = new JPanel();
				resultPanel.setLayout(new FlowLayout());
				add(resultPanel, BorderLayout.NORTH);
				result = new JLabel(player + " wins! Click reset to play again");
				resultPanel.add(result);

				for(JButton[] group : buttons)
				{
					for(JButton button : group)
						button.setEnabled(false);
				}
			} else {
				if(moves == 9)
				{
					resultPanel = new JPanel();
					resultPanel.setLayout(new FlowLayout());
					add(resultPanel, BorderLayout.NORTH);
					result = new JLabel("No one wins! Click reset to play again");
					resultPanel.add(result);
				} else {
					if(player.equals("X"))
						player = "O";
					else
						player = "X";
				}
			}
		}
	}
	
	public class reset implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			player = "X";
			remove(resultPanel);
			moves = 0;
			for(int r = 0; r < buttons.length; r++)
			{
				for(int c  = 0; c < buttons[0].length; c++)
				{
					buttons[r][c].setEnabled(true);
					buttons[r][c].setText("");
				}
			}
		}
	}
	
	public boolean checkRows(JButton[][] buttons, String player)
	{
		for(int r = 0; r < buttons.length; r++)
		{
			if(buttons[r][0].getText().equals(player) && 
			   buttons[r][1].getText().equals(player) &&
			   buttons[r][2].getText().equals(player))
					return true;
		}
		
		return false;
	}
	
	public boolean checkCols(JButton[][] buttons, String player)
	{
		for(int c = 0; c < buttons[0].length; c++)
		{
			if(buttons[0][c].getText().equals(player) && 
			   buttons[1][c].getText().equals(player) &&
			   buttons[2][c].getText().equals(player))
					return true;
		}
		
		return false;
	}
	
	public boolean checkMajorDiag(JButton[][] buttons, String player)
	{
		if(buttons[0][0].getText().equals(player) && 
		   buttons[1][1].getText().equals(player) &&
		   buttons[2][2].getText().equals(player))
				return true;
		return false;
	}
	
	public boolean checkMinorDiag(JButton[][] buttons, String player)
	{
		if(buttons[0][2].getText().equals(player) &&
		   buttons[1][1].getText().equals(player) &&
		   buttons[2][0].getText().equals(player))
				return true;
		return false;
	}
	
	public boolean checkForWin(JButton[][] buttons, String player)
	{
		if(checkRows(buttons, player) || checkCols(buttons, player) ||  checkMajorDiag(buttons, player) || checkMinorDiag(buttons, player))
			return true;
		
		return false;
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
		JFrame frame = new JFrame("TicToe");
		frame.setLocation(400, 100);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new TicTacToe());
		frame.setVisible(true);
	}
}
