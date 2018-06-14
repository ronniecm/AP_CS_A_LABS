package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Checkers extends JPanel {
	private int[][] matrix;
	private JButton[][] board;
	
	public Checkers()
	{
		setLayout(new GridLayout(8, 8));
		
		matrix = new int[8][8];
		board = new JButton[8][8];
		
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[0].length; c++)
			{
				board[r][c] = new JButton();
				board[r][c].setOpaque(true);
				
				setupBoard(r, c);
			}
		}
		
		setupMatrix();
	}
	
	public void setupBoard(int r, int c)
	{
		if(r % 2 == 0)
		{
			if(c % 2 == 0)
				board[r][c].setBackground(Color.black);
			else
				board[r][c].setBackground(Color.red);
		} else {
			if(c % 2 == 0)
				board[r][c].setBackground(Color.red);
			else
				board[r][c].setBackground(Color.black);
		}
		
		add(board[r][c]);
	}
	
	public void setupMatrix()
	{
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix.length; c++)
			{
				matrix[r][c] = 0;
				
				if(r == 0)
				{
					if(c % 2 == 0)
						matrix[r][c] = 1;
				} else if(r == 1) {
					if(c % 2 == 1)
						matrix[r][c] = 1;
				} else if(r == 6) {
					if(c % 2 == 1)
						matrix[r][c] = 2;
				} else if(r == 7) {
					if(c % 2 == 0)
						matrix[r][c] = 2;
				}
			}
		}
		
		for(int[] row : matrix)
		{
			for(int col : row)
				System.out.print(col + " ");
			System.out.println();
		}
	}
	
	private class Listener implements ActionListener
	{
		private int r, c;
		public Listener(int row, int col)
		{
			r = row;
			c = col;
		}
		
		public void actionPerformed(ActionEvent e)
		{
			
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
		JFrame frame = new JFrame("Checkers");
		frame.setLocation(1280/4, 0);
		frame.setSize(1280/2, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Checkers());
		frame.setVisible(true);
	}
}
