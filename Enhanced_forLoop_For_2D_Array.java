package Java_Programs;

public class Enhanced_forLoop_For_2D_Array 
{
	public static void main(String[] args)
	{
		int X [] = {5,6,7,8};
		int Y [] = {6,7,8,9};
		int Z [] = {9,8,7,6};
		
		int P [] [] = {
				      {5,6,7,8},
				      {6,7,8,9},
				      {9,8,7,6}
		              };
		
		for(int i [] : P)
		{
			for (int j : i)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
	}

}
