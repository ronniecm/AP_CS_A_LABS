package SecondTerm.ArrayLabs;

public class test
{
  public static void main(String[] args)
	{
		int x = 0;
		int[] a = {1, 2, 3, 4};

		x++;
		mystery(x, a);

		System.out.println("x : " + x);
		for (int v : a)
			System.out.print(v + " ");
}

public static void mystery(int x, int[] a)
{
	x++;
	a[x] = a[x] + 1;
	
	for(int k = 1; k < a.length; k++)
		a[k] = a[k-1];
	
	for(int v : a)
		System.out.print(v + " ");

	for(int k = 0; k < a.length; k++)
		a[k]++;
   }
}