package ThirdTerm.ArrayLabs2D;
/*****************************************************************
Name: Ronnie Mohapatra
Period: 8
Lab: Tic Tac Toe
What I Learned: a) To traverse all rows, stop your iteration
                   variable at 2DarrrayName.length-1
                b) To traverse all columns, stop your iteration
                   variable at 2DarrayName[0].length-1
                c) Use break to exit a loop and return to exit a
                	   method	
******************************************************************/
public class TicTacToe
{
   private char [] [] board;
   private static final int ROWS = 3, COLUMNS = 3;
      
   public TicTacToe()
   {
      board = new char [ROWS][COLUMNS];
      for (int i = 0; i < ROWS; i++)
      {
         for (int j = 0; j < COLUMNS; j++)
            board[i][j] = ' ';
      }
   }  // default constructor
      
// post-condition: set a field in the board. The field must be unoccupied
   public void set (int i, int j, char player)
   {
      if (board [i][j] != ' ')
         throw new IllegalArgumentException ("Position occupied");
      board[i][j] = player;
   }  // set
         
   public boolean getWinner(char player)
   {      
      //checks all rows for a win
      for(int r = 0; r< board.length; r++)
      {
         if(board[r][0] == player && board[r][1] == player && board[r][2] == player)
         {
        	 	return true;
         }
      }
      
      //checks all columns for win
      for(int c = 0; c<board[0].length; c++)
      {
         if(board[0][c] == player && board[1][c] == player && board[2][c] == player)
         {
     	 	return true;
         }
      }
      
      //checks major diagonal
      if(board[0][0] == player && board[1][1] == player && board[2][2] == player)
         return true; 
         
      //checks minor diagonal
      if(board[0][2] == player && board[1][1] == player && board[2][0] == player)
         return true;
      
      return false;
   }
   
   public boolean checkIfBoardIsFull()
   {
	   for (int r = 0; r < board.length; r++)
	   {
		   for (int c = 0; c < board[0].length; c++)
		   {
			   if (board[r][c] == ' ')
				   return false;
		   }
	   }
	   
	   return true;
   }
   
   public String toString()
   {
      String r = "";
      for (int i = 0; i < ROWS; i++)
      {
         r = r + "|";
         for (int j = 0; j < COLUMNS; j++)
         {
            r = r + board[i][j] + "|";
         }
         r = r + "\n";
      }
      
      return r;
   } // toString
} //TicTacToe