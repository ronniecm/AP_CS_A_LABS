package ThirdTerm.ArrayLabs2D;

public class Reflection {
	public static void main(String[] args)
	{
		int[][] m = new int[3][5];
		for(int r = 0; r < m.length; r++)
		{
			for(int c = 0; c < m[0].length; c++)
			{
				m[r][c] = (int)(Math.random() * 11);
			}
		}
		
		for(int[] u : m)
		{
			for(int v : u)
				System.out.print(v + " ");
			System.out.println();
		}
		
		System.out.println();
		
		int[][] mReflected = reflect(m);
		
		for(int[] u : mReflected)
		{
			for(int v : u)
				System.out.print(v + " ");
			System.out.println();
		}
	}
	public static int[][] reflect (int[][] m) {
		int[][] reflectedMatrix = new int[m.length][m[0].length];
		
		for(int r = 0; r < m.length; r++)
		{
			for(int c = 0; c < m[0].length; c++)
			{
				reflectedMatrix[r][c] = m[r][m[0].length-1-c];
			}
		}
		
		return reflectedMatrix;
	}
}
