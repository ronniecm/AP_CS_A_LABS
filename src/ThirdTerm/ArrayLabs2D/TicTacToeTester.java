package ThirdTerm.ArrayLabs2D;

import javax.swing.JOptionPane;

public class TicTacToeTester
{
   public static void main (String [] args)
	{
	   char player = 'x';
		TicTacToe game = new TicTacToe();
		while (true)
		{
		   System.out.println (game);
			String input = JOptionPane.showInputDialog ("Row for " +
			               player + " (from 0-2 and press Cancel to exit)");
			if (input == null) System.exit(0);
			
			int row = Integer.parseInt (input);
			input = JOptionPane.showInputDialog ("Column for " + player +
		                                        " from 0-2 and press Cancel to exit)") ;
			int column = Integer.parseInt (input);
			game.set (row, column, player);
         if(game.getWinner('x')) {
            System.out.println(game);
            System.out.println("x is the winner.");
            System.exit(0);
         }
         
         if (game.getWinner('o'))
         {
            System.out.println(game);
            System.out.println("o is the winner.");
            System.exit(0);
         }
         
			if (player == 'x')
			  player = 'o';
			else
			  player = 'x';
		} // while
	}  // main
} // TicTacToeTester