package ThirdTerm.ArrayLabs2D;

public class Encryptor2D {
	private char[][] grid;
	static final int ROWS = 6, COLUMNS = 6;
	static char[] initCharSet = {'A', 'B',  'C', 'D', 'E', 'F',
								'G', 'H', 'I', 'J', 'K', 'L',
								'M', 'N', 'O', 'P', 'Q', 'R',
								'S', 'T', 'U', 'V', 'W', 'X',
								'Y', 'Z', '1', '2', '3', '4',
								'5', '6', '7', '8', '9', '0'};
	
	public Encryptor2D()
	{
		grid = new char[ROWS][COLUMNS];
		for(int r = 0; r < grid.length; r++)
		{
			for(int c = 0; c < grid[0].length; c++)
			{
				int randomNum = (int)(Math.random() * initCharSet.length);
				while(valuePresent(initCharSet[randomNum]))
				{
					randomNum = (int)(Math.random() * initCharSet.length);
				}
				
				grid[r][c] = initCharSet[randomNum];
			}
		}
	}
	
	private boolean valuePresent(char value)
	{
		for (int r = 0; r < grid.length; r++)
		{
			for (int c = 0; c <grid[0].length; c++)
			{
				if(grid[r][c] == (value))
					return true;
			}
		}
		
		return false;
	}
	
	public Point getCoordinates(char searchValue)
	{		
		Point searchValueCoor;
		for (int r = 0; r < grid.length; r++)
		{
			for (int c = 0; c < grid[0].length; c++)
			{
				if (grid[r][c] == searchValue)
				{
					searchValueCoor = new Point(r, c);
					return searchValueCoor;
				}
			}
		}
		
		return null;
	}
	
	public String encryptTwo(String twoString)
	{
		char char1 = twoString.charAt(0);
		char char2 = twoString.charAt(1);
		
		if (getCoordinates(char1).getCol() == getCoordinates(char2).getCol() ||
			getCoordinates(char1).getRow() == getCoordinates(char2).getRow()) {
			
			return Character.toString(char2) + Character.toString(char1);	
		
		} else {
			
			return Character.toString(grid[getCoordinates(char1).getRow()][getCoordinates(char2).getCol()]) +
				   Character.toString(grid[getCoordinates(char2).getRow()][getCoordinates(char1).getCol()]);
		}
	}
	
	public String encryptWord(String wordToEncrypt)
	{
		String output = "";
		if (wordToEncrypt.length() % 2 == 0)
		{
			for(int i = 0; i <= wordToEncrypt.length() - 2; i+=2)
				output += encryptTwo(wordToEncrypt.substring(i, i+2));
		} else {
			char lastCharacter = wordToEncrypt.charAt(wordToEncrypt.length() - 1);
			for(int i = 0; i <= wordToEncrypt.length() - 2; i+=2)
				output += encryptTwo(wordToEncrypt.substring(i, i+2));
			if(getCoordinates(lastCharacter).getCol() == 5) {
				output += grid[getCoordinates(lastCharacter).getRow()][0];
			} else {
				output += grid[getCoordinates(lastCharacter).getRow()][getCoordinates(lastCharacter).getCol() + 1];
			}
		}
		
		return output;
	}
	
	public String encrypt()
	{
		return "hi";
	}
	
	public String toString()
	{
		String s = "";
		
		for(int r = 0; r < grid.length; r++)
		{
			for(int c = 0; c < grid[0].length; c++)
			{
				s += grid[r][c] + " ";
			}
			
			s += "\n";
		}
		
		return s;
	}
	
	public static void main(String[] args)
	{
		Encryptor2D grid = new Encryptor2D();
		System.out.println(grid);
		System.out.println(grid.encryptWord("RON"));
	}
	
}
