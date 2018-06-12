package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Battleship2 extends JPanel {
	public final int HORIZONTAL = 1;
	public final int VERTICAL = 2;
	private int[][] matrix;
	private JButton[][] board;
	private JPanel boardPanel;
	private JButton resetButton;
	
	public Battleship2()
	{
		setLayout(new BorderLayout());
		
		boardPanel = new JPanel();
		boardPanel.setLayout(new GridLayout(12, 12));
		add(boardPanel, BorderLayout.CENTER);
		
		matrix = new int[12][12];
		board = new JButton[12][12];
		
		placeShips();
		
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				//matrix[r][c] = 0;
				board[r][c] = new JButton();
				board[r][c].setOpaque(true);
				
				if(matrix[r][c] == 1)
					board[r][c].setBackground(Color.red);
				else if(matrix[r][c] == 2)
					board[r][c].setBackground(Color.green);
				else if(matrix[r][c] == 3)
					board[r][c].setBackground(Color.ORANGE);
				else
					board[r][c].setBackground(Color.BLUE);
				//board[r][c].addActionListener(new Listener(r, c));
				boardPanel.add(board[r][c]);
			}
		}
		
		//placeShips();
		
		printBoard();
		
		resetButton = new JButton("Reset");
		resetButton.addActionListener(new Reset());
		add(resetButton, BorderLayout.SOUTH);
	}
	
	
	public void placeShips()
	{
		for(int length = 4; length >= 2; length--)
			placeShip(length);
	}
	
	public void placeShip(int length)
	{
		int orientation = (int)(Math.random() * 2 + 1);
		
		if(orientation == HORIZONTAL)
		{
			int row = (int)(Math.random() * matrix.length);
			int firstCol = (int)(Math.random() * (12 - length + 1));
			
			for(int c = firstCol; c < firstCol + length; c++)
			{
				if(matrix[row][c] == 1 || matrix[row][c] == 2 || matrix[row][c] == 3)
					firstCol = (int)(Math.random() * (12 - length + 1));
			}
			
			for(int col = firstCol; col < firstCol + length; col++)
			{
				if(length == 2)
					matrix[row][col] = 1;
				else if(length == 3)
					matrix[row][col] = 2;
				else if(length == 4)
					matrix[row][col] = 3;
			}
		} else {
			int col = (int)(Math.random() * matrix[0].length);
			int firstRow = (int)(Math.random() * (12 - length + 1));
			
			for(int r = firstRow; r < firstRow + length; r++)
			{
				if(matrix[r][col] == 1 || matrix[r][col] == 2 || matrix[r][col] == 3)
					firstRow = (int)(Math.random() * (12 - length + 1));
			}
			
			for(int row = firstRow; row < firstRow + length; row++)
			{
				if(length == 2)
					matrix[row][col] = 1;
				else if(length == 3)
					matrix[row][col] = 2;
				else if(length == 4)
					matrix[row][col] = 3;
			}
		}
	}
	
	public int checkHits()
	{
		int ones = 0;
		for(int[] row : matrix)
		{
			for(int col : row)
			{
				if(col == 1)
					ones++;
			}
		}
		
		return ones;
	}
	
	
	private class Reset implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			for(int r = 0; r < matrix.length; r++)
			{
				for(int c = 0; c < matrix[0].length; c++)
				{
					matrix[r][c] = 0;
					board[r][c].setBackground(Color.blue);
				}
			}
			
			placeShips();
			
			for(int r = 0; r < matrix.length; r++)
			{
				for(int c = 0; c < matrix[0].length; c++)
				{
					if(matrix[r][c] == 1)
						board[r][c].setBackground(Color.red);
					else if(matrix[r][c] == 2)
						board[r][c].setBackground(Color.green);
					else if(matrix[r][c] == 3)
						board[r][c].setBackground(Color.orange);
					else
						board[r][c].setBackground(Color.blue);
				}
			}
						
			printBoard();
			
		}
	} 
	
	public void printBoard()
	{
		for(int[] row : matrix)
		{
			for(int col : row)
				System.out.print(col + " ");
			System.out.println();
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
		
		JFrame frame = new JFrame("Battleship 2.0");
		frame.setLocation(0, 730/2 + 1);
		frame.setSize(1280, 730/2 + 1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Battleship2());
		frame.setVisible(true);
		
		
			
		JFrame frame2 = new JFrame("Battleship 2.0");
		frame2.setLocation(0, 0);
		frame2.setSize(1280, 730/2 + 1);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setContentPane(new BattleshipMulti());
		frame2.setVisible(true);
	}
}