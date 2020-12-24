package Java_Programs;

public class Pattern_Example_Java_Part1 
{
	public static void main (String[] args)
	{
		int i , j ;
		for ( i = 1 ; i <= 5 ; i++) //	Row
		{
			for ( j = 1 ; j <= i ; j++) // columns
			{
				if ((i + j ) % 2 == 0)
				System.out.print("1 ");
			    else
			    System.out.print("0 "); 
			}
			System.out.println("");
		}
	}

}
