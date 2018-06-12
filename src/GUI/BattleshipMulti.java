package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BattleshipMulti extends JPanel{
	private JButton white, red;
	private JButton[][] guessingBoard;
	private JPanel selection;
	private JPanel board;
	private JButton reset;
	private boolean hit = false;;
	
	public BattleshipMulti()
	{
		setLayout(new BorderLayout());
		
		selection = new JPanel();
		selection.setLayout(new FlowLayout());
		add(selection, BorderLayout.NORTH);
		
		white = new JButton("Miss Marker");
		white.setOpaque(true);
		white.setBackground(Color.white);
		white.addActionListener(new Listener2());
		red = new JButton("Hit Marker");
		red.setOpaque(true);
		red.setBackground(Color.red);
		red.setForeground(Color.white);
		red.addActionListener(new Listener2());
		
		selection.add(white);
		selection.add(red);
		
		board = new JPanel();
		board.setLayout(new GridLayout(12, 12));
		add(board, BorderLayout.CENTER);
		
		guessingBoard = new JButton[12][12];
		for(int r = 0; r < guessingBoard.length; r++)
		{
			for(int c = 0; c < guessingBoard.length; c++)
			{
				guessingBoard[r][c] = new JButton();
				guessingBoard[r][c].setOpaque(true);
				guessingBoard[r][c].setBackground(Color.blue);
				guessingBoard[r][c].addActionListener(new Listener(r, c));
				board.add(guessingBoard[r][c]);
			}
		}
		
		reset = new JButton("Reset");
		reset.addActionListener(new Reset());
		add(reset, BorderLayout.SOUTH);
	}
	
	private class Listener implements ActionListener
	{
		private int r, c;
		public Listener(int row, int col) {
			r = row;
			c = col;
		}
		
		public void actionPerformed(ActionEvent e) {
			if(hit)
				guessingBoard[r][c].setBackground(Color.red);
			else
				guessingBoard[r][c].setBackground(Color.white);
		}
	}
	
	private class Listener2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == red)
				hit = true;
			else if(e.getSource() == white)
				hit = false;
		}
	}
	
	private class Reset implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			for(JButton[] row : guessingBoard)
			{
				for(JButton col : row)
				{
					col.setBackground(Color.blue);
				}
			}
		}
	}
}

