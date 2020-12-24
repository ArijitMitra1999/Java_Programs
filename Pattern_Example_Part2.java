package Java_Programs;

public class Pattern_Example_Part2
{
	public static void main(String [] args)
	{
		for (int i = 1 ; i <=5 ; i++) // ROW
		{
			for (int j = 1 ; j <=i ; j ++) // COLUMN
			{
				System.out.print(i+ " ");
			}
			System.out.println(" ");
		}
	}

}
