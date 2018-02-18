package ThirdTerm.ArrayLabs2D;

/*****************************************************************
Name: Ronnie Mohapatra
Period: 8
Lab: Minesweeper Lab
What I Learned: a) A 2D array is an array of arrays.
                b) Use a nested for loop to traverse a 2D array.
                c) Use two sets of brackets to initialize a 2D array.
******************************************************************/
import java.util.*;

public class MineSweeper
{
   static Scanner console = new Scanner(System.in);
 
   public static void main (String [] args)
   {
      System.out.println("Press 1 to use a 5x5 board");
      System.out.println("Press 2 to use a 10x10 board");
      int  size = welcomeAndAskForSizeOfField();
      int  [] [] minesfield = new int [size] [size];
      char [] []outputField = new char [size][size];
         			
      init (minesfield, outputField);
      displayOutput(outputField);
      
      boolean gameOver = false;
      while (gameOver != true)
      {
         gameOver = playGame(minesfield, outputField);
         displayOutput(outputField);		
      }
		// display the bombs when game is over
      displayBombs(minesfield);	
   }  // main
   	
   //*********************************************  welcomeAndAskForSizeOfField
   public static int welcomeAndAskForSizeOfField()
   {  
      int fieldSize = console.nextInt();
      if (fieldSize == 1)
         return 5;
      else
         return 10;
   }
   	
   //*********************************************  init
   public static void init (int [] [] mines, char [] [] output)
   {
      for (int r = 0; r < output.length; r++)
      {
         for (int c = 0; c < output[0].length; c++)
            output[r][c] = ' ';
      }
         // generate a random mine field
      for (int r = 0; r <  mines.length; r++)
      {
         for (int c = 0; c < mines[0].length; c++)
            mines[r][c] = (int)(Math.random() * 2);
      }
   }  // init
   	
   
   //*********************************************  displayOutput   
   public static void displayOutput (char [] [] output)
   {
      for (int r = 0; r < output.length; r++)
      {
         for (int c = 0; c < output[0].length; c++)
            System.out.print ("[" + (char)output[r][c] + "]");
         System.out.println();
      } 
   }
   	
   	
   //*********************************************  countMines		
   public static int countMines (int [] [] mines, int r, int c)
   {
      int count = 0;
      
      int rMax = r+1;
      int rMin = r-1;
      int cMax = c+1;
      int cMin = c-1;
      
      if(r == 0)
         rMin = 0;
      if(c == 0)
         cMin = 0;
      if(r == mines.length-1)
         rMax = mines.length-1;
      if(c == mines[0].length-1)
         cMax = mines[0].length-1;
         
      for(int i = rMin; i<= rMax; i++)
      {
         for(int j = cMin; j <= cMax; j++)
         {
            if(mines[i][j] == 1)
               count++;
         }
      }
      
      return count;
   }  // countMines
   	
   
   //*********************************************  playGame		
   public static boolean playGame (int [][] mines, char [] [] outputBoard)
   {
      // your code goes here
      	
      //--------------------------------------------------------------------------------
      //Step 1:  ask for the coordinates of a location
      //              check if there is a mine at that location
      //              if yes, put 'X' at that location on the outputBoard, 
      //              and return true.
      System.out.println("Enter x coordinate to check");
      int x = console.nextInt();
      System.out.println("Enter y coordinate to check");
      int y = console.nextInt();
      if (mines[x][y] == 1)
      {
         outputBoard[x][y] = 'X';
         return true;
      } else {
         int numOfMines = countMines(mines, x, y);
         outputBoard[x][y]  = (numOfMines + " ").charAt(0);
         mines[x][y] = -1; 
      }
         
      // Otherwise (i.e. no bomb at that location)
      //            1) Check the number of mines in adjacent locations (countMines(r,c))
      //            and put the count (need to change it to a char first, see below)
      //            at that location on the outputBoard.
      //
      //            E.g. if the number of mines is 3, then convert 3 to a char '3' 
      //                   by:      outputBoard[r][c] = (3 + "").charAt(0);
      //
      //             2) Another thing to do in step 2:update mines[r][c] = -1 
      //             (-1 indicates that location r,c has been marked.
      
      //             3) If all the cells that do not contain bombs have been marked, then
      //             the checkStatus() method should returns true--game over.
      //-------------------------------------------------------------------------------
      return checkStatus(mines);
         
   }  // playGame
   	
   // post: if all the cells that do not contain bombs have
   //       been marked, returns true; otherwise, returns false
   private static boolean checkStatus (int [] [] mines)
   {
      for(int i = 0; i<mines.length;i++)
      {
         for(int j = 0; j<mines[0].length;j++)
         {
            if (mines[i][j] == 0)
               return false;
         }
      }
      
      return true;
   }
   
   public static void displayBombs(int[][] minesField)
   {
      for(int[] u : minesField)
      {
         for(int v : u)
         {
            System.out.print(v + " ");
         }
         System.out.println();
      }
   }
} // Minesweeper

/* Output

 ----jGRASP exec: java MineSweeper
 Press 1 to use a 5x5 board
 Press 2 to use a 10x10 board
 1
 1 1 1 0 1 
 0 0 1 1 0 
 0 0 1 0 1 
 0 1 0 1 1 
 1 1 0 0 0 
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter x coordinate to check
 0
 Enter y coordinate to check
 3
 [ ][ ][ ][4][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter x coordinate to check
 2
 Enter y coordinate to check
 0
 [ ][ ][ ][4][ ]
 [ ][ ][ ][ ][ ]
 [1][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter x coordinate to check
 1
 Enter y coordinate to check
 0
 [ ][ ][ ][4][ ]
 [2][ ][ ][ ][ ]
 [1][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter x coordinate to check
 1
 Enter y coordinate to check
 1
 [ ][ ][ ][4][ ]
 [2][5][ ][ ][ ]
 [1][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter x coordinate to check
 1
 Enter y coordinate to check
 4
 [ ][ ][ ][4][ ]
 [2][5][ ][ ][3]
 [1][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter x coordinate to check
 2
 Enter y coordinate to check
 1
 1 1 1 -1 1 
 -1 -1 1 1 -1 
 -1 -1 1 0 1 
 0 1 0 1 1 
 1 1 0 0 0 
 Enter x coordinate to check
 2
 Enter y coordinate to check
 3
 [ ][ ][ ][4][ ]
 [2][5][ ][ ][3]
 [1][3][ ][6][ ]
 [ ][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 Enter x coordinate to check
 3
 Enter y coordinate to check
 0
 [ ][ ][ ][4][ ]
 [2][5][ ][ ][3]
 [1][3][ ][6][ ]
 [3][ ][ ][ ][ ]
 [ ][ ][ ][ ][ ]
 1 1 1 -1 1 
 Enter x coordinate to check
 3
 Enter y coordinate to check
 2
 [ ][ ][ ][4][ ]
 [2][5][ ][ ][3]
 [1][3][ ][6][ ]
 [3][ ][4][ ][ ]
 [ ][ ][ ][ ][ ]
 1 1 1 -1 1 
 Enter x coordinate to check
 4
 Enter y coordinate to check
 2
 [ ][ ][ ][4][ ]
 [2][5][ ][ ][3]
 [1][3][ ][6][ ]
 [3][ ][4][ ][ ]
 [ ][ ][3][ ][ ]
 Enter x coordinate to check
 4
 Enter y coordinate to check
 3
 [ ][ ][ ][4][ ]
 [2][5][ ][ ][3]
 [1][3][ ][6][ ]
 [3][ ][4][ ][ ]
 [ ][ ][3][2][ ]
 Enter x coordinate to check
 4
 Enter y coordinate to check
 4
 [ ][ ][ ][4][ ]
 [2][5][ ][ ][3]
 [1][3][ ][6][ ]
 [3][ ][4][ ][ ]
 [ ][ ][3][2][2]
 
 1 1 1 -1 1 
 -1 -1 1 1 -1 
 -1 -1 1 -1 1 
 -1 1 -1 1 1 
 1 1 -1 -1 -1 
 
  ----jGRASP: operation complete.
 
 */