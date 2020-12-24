package Java_Programs;

public class Labeled_Break_Statement
{
	public static void main (String [] args)
	{
		Arijit :
		for (int i = 1 ; i <= 4 ;i++ )
		{
			for (int j = 1 ;j <= 4; j++)
			{
				if(i == 3)
					break Arijit; // Here arijit is labeled break statement
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
