package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Battleship extends JPanel
{
   final int HORIZONTAL = 1;
   final int VERTICAL = 2;
   private JButton[][] board;
   private int[][] matrix;
   private int hits, torpedoes;
   private JLabel label;
   private JButton reset;
   
   public Battleship()
   {
      setLayout(new BorderLayout());
      hits = 0;
      torpedoes = 20;
   
      JPanel north = new JPanel();
      north.setLayout(new FlowLayout());
      add(north, BorderLayout.NORTH);
      label = new JLabel("You have " + torpedoes + " torpedoes.");
      north.add(label);
   
      JPanel center = new JPanel();
      center.setLayout(new GridLayout(10,10));
      add(center, BorderLayout.CENTER);
      board = new JButton[10][10];
      matrix = new int[10][10];
      for(int r = 0; r < 10; r++)
         for(int c = 0; c < 10; c++)
         {
            matrix[r][c] = 0;
            board[r][c] = new JButton();
            board[r][c].setOpaque(true);
            board[r][c].setBackground(Color.blue);
            board[r][c].addActionListener( new Handler1(r, c) );
            center.add(board[r][c]);
         }
   
      reset = new JButton("Reset");
      reset.addActionListener( new Handler2() );
      add(reset, BorderLayout.SOUTH);
   
      placeShip();
      for(int[] row : matrix)
      {
    	  	for(int col : row)
    	  		System.out.print(col + " ");
    	  	System.out.println();
      }
   }

   private void placeShip()
   {
    		int orientation = (int)(Math.random() * 2 + 1);
		
		if(orientation == HORIZONTAL)
		{
			int row = (int)(Math.random() * matrix.length);
			int firstColumn = (int)(Math.random() * 7);
			
			for(int c = firstColumn; c < firstColumn + 4; c++)
				matrix[row][c] = 1;
		} else {
			int col = (int)(Math.random() * matrix[0].length);
			int firstRow = (int)(Math.random() * 7);
			
			for(int r = firstRow; r < firstRow + 4; r++)
				matrix[r][col] = 1;
		}
		
		for(int[] row : matrix)
		{
			for(int col : row)
				System.out.print(col + " ");
			System.out.println();
		}
   }

    private class Handler1 implements ActionListener
   {
      private int myRow, myCol;
      public Handler1(int r, int c)
      {
         myRow = r;
         myCol = c;
      }
       public void actionPerformed(ActionEvent e)
      {
           // The following two statements are for debugging purpose
         System.out.println (myRow);
         System.out.println (myCol);
                 	 	 	 
         if(matrix[myRow][myCol] == 0)
         {
        	 	matrix[myRow][myCol] = 2;
        	 	board[myRow][myCol].setEnabled(false);
        	 	board[myRow][myCol].setText("Miss");
        	 	board[myRow][myCol].setBorderPainted(false);
        	 	board[myRow][myCol].setBackground(Color.green);
        	 	torpedoes--;
            label.setText("You have " + torpedoes + " torpedoes");
         }	else if(matrix[myRow][myCol] == 1)	{
        	 	matrix[myRow][myCol] = 3;
        	 	board[myRow][myCol].setEnabled(false);
        	 	board[myRow][myCol].setText("Hit");
        	 	board[myRow][myCol].setBorderPainted(false);
        	 	board[myRow][myCol].setBackground(Color.red);
        	 	torpedoes--;
            label.setText("You have " + torpedoes + " torpedoes");
        	 	hits++;
        	 	if(hits == 4) {
        	 		for(int r = 0; r < board.length; r++)
            	 	{
            	 		for(int c = 0; c < board[0].length; c++)
            	 			board[r][c].setEnabled(false);
            	 	}
            	 	label.setText("You won. Click reset to play another game!");
        	 	}
         }
         else
        	 	matrix[myRow][myCol] = matrix[myRow][myCol];  
         
         if(torpedoes <= 0 && hits != 4)
         {
        	 	label.setText("You have run out of torpedoes. Click reset to play another game!");
        	 	for(int r = 0; r < board.length; r++)
        	 	{
        	 		for(int c = 0; c < board[0].length; c++)
        	 		{
        	 			board[r][c].setEnabled(false);
        	 			if(matrix[r][c] == 1) {
        	 				board[r][c].setText("You Lose");
        	 				board[r][c].setBorderPainted(false);
        	 				board[r][c].setBackground(Color.red);
        	 			}
        	 		}
        	 	}
         }
      }   // actionPerformed of Handler
   }
   
       // Handling the Reset button
    private class Handler2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
    	   		torpedoes = 20;
    	   		hits = 0;
    	   		for(int r = 0; r < matrix.length; r++)
    	   		{
    	   			for(int c = 0; c < matrix[0].length; c++)
    	   			{
    	   				matrix[r][c] = 0;
    	   				board[r][c].setBorderPainted(true);
    	   				board[r][c].setBackground(Color.BLUE);
    	   				board[r][c].setText("");
    	   				board[r][c].setEnabled(true);
    	   				label.setText("You have 20 torpedoes.");
    	   			}
    	   		}
    	   		
    	   		placeShip();
      }  // actionPerformed of Handler2
   }
	
	
   public static void main(String[] args)
   {
	   /*
	  if(true) {
		  try {
			  UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		  } catch(Exception e){
			  e.printStackTrace();
		  }
	  } */
      JFrame frame = new JFrame("Battleship!");
      frame.setSize(1280, 730);
      frame.setLocation(0, 0);
      frame.setContentPane(new Battleship());
      frame.setVisible(true);
 
   }
}