package Java_Programs;

public class Jagged_Array 
{
	public static void main (String [] args)
	{
		int X[] = {5,6,7,8};
		int Y[] = {5,6,7};
		int Z[] = {6,7};
		
		int P[] [] = {
				     {5,6,7,8},
				     {5,6,7},
				     {6,7}
		             };
		int k[][] = new int[3][];
		k[0] = new int[4];
		k[1] = new int[3];
		k[2] = new int[2];
		
		
		for (int i[] : P)
		{
			for (int j : i)
			{
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}

}
