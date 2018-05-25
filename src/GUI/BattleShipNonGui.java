package GUI;

public class BattleShipNonGui {
	final int HORIZONTAL = 0;
	final int VERTICAL = 1;
	private int[][] board;
	private String[][] console;
	
	public BattleShipNonGui()
	{
		board = new int[10][10];
		console = new String[10][10];
		generateBoard();
	}
	
	public void generateBoard()
	{
		int orientation = (int)(Math.random() * 2);
		
		if(orientation == HORIZONTAL)
		{
			int row = (int)(Math.random() * board.length);
			int firstColumn = (int)(Math.random() * board[0].length - 3);
			
			for(int c = firstColumn; c < firstColumn + 4; c++)
				board[row][c] = 1;
		} else {
			int col = (int)(Math.random() * board[0].length);
			int firstRow = (int)(Math.random() * 7);
			
			for(int r = firstRow; r < firstRow + 4; r++)
				board[r][col] = 1;
		}
		
		for(int r = 0; r < console.length; r++)
		{
			for(int c = 0; c < console[0].length; c++)
				console[r][c] = "[]";
		}
	}
	
	public void printBoard()
	{
		for(int[] row : board)
		{
			for(int col : row)
				System.out.print(col + " ");
			System.out.println();
		}
		
		for(String[] row : console)
		{
			for(String col : row)
				System.out.print(col + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		BattleShipNonGui board = new BattleShipNonGui();
		board.printBoard();
	}
}
