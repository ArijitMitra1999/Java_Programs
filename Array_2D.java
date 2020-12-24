package Java_Programs;

public class Array_2D 
{
	public static void main (String [] args)
	{
		int a = 5 , b= 6 ,c =7 , d =8 ;
		int x[] = {5,6,7,8};
		int y[] = {6,7,8,9};
		int z[] = {9,8,7,6};
		
		int p [][] = {
				     {5,6,7,8},
				     {6,7,8,9},
				     {9,8,7,6}
		             };
		
		for (int i = 0 ; i < 3 ; i ++)
		{
			for (int j = 0 ; j < 4 ; j++)
			{
				System.out.print(p[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
