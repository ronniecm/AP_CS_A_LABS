package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PennyPitch extends JPanel{
	private Square[][] board;
	private JPanel boardPanel;
	private JPanel south;
	private JButton throwButton, resetButton;
	private JTextArea pointsSection;
	private int points = 0; 
	private int pennies = 0;
	
	public PennyPitch()
	{
		setLayout(new BorderLayout());
		
		boardPanel = new JPanel();
		boardPanel.setLayout(new GridLayout(5, 5));
		add(boardPanel, BorderLayout.CENTER);
		
		board = new Square[5][5];
		
		for(int r = 0; r < board.length; r++)
		{
			for(int c = 0; c < board[0].length; c++)
			{
				board[r][c] = new Square();
				boardPanel.add(board[r][c]);
			}
		}
		
		south = new JPanel();
		south.setLayout(new FlowLayout());
		add(south, BorderLayout.SOUTH);
		throwButton = new JButton("THROW");
		throwButton.addActionListener(new throwListener());
		resetButton = new JButton("RESET");
		resetButton.addActionListener(new reset());
		resetButton.setEnabled(false);
		pointsSection = new JTextArea("" + points);
		south.add(throwButton);
		south.add(pointsSection);
		south.add(resetButton);
	}
	
	private class throwListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			pennies++;
			int r = (int)(Math.random() * board.length);
			int c = (int)(Math.random() * board[0].length);
			
			while(board[r][c].getText().equals("P"))
			{
				 r = (int)(Math.random() * board.length);
				 c = (int)(Math.random() * board[0].length);
			}
			
			board[r][c].setBackground(Color.blue);
			board[r][c].setForeground(Color.WHITE);
			board[r][c].setText("P");
			points += board[r][c].getVal();
			pointsSection.setText("" + points);
			
			if(pennies == 5) {
				throwButton.setEnabled(false);
				resetButton.setEnabled(true);
			}
		}
	}
	
	private class reset implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			for(int r = 0; r < board.length; r++)
			{
				for(int c = 0; c < board[0].length; c++)
				{
					int newVal = (int)(Math.random() * 2 + 1);
					board[r][c].setForeground(Color.BLACK);
					board[r][c].setBackground(Color.yellow);
					board[r][c].setText("" + newVal);
					board[r][c].setVal(newVal);
				}
			}
			
			pennies = 0;
			points = 0;
			pointsSection.setText("" + points);
			throwButton.setEnabled(true);
			resetButton.setEnabled(false);
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
		
		JFrame frame = new JFrame("Penny Pitch");
		frame.setLocation(300, 250);
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new PennyPitch());
		frame.setVisible(true);
	}
}
