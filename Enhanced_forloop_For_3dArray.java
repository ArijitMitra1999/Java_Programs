package Java_Programs;

public class Enhanced_forloop_For_3dArray 
{
	public static void main (String[] args)
	{
		int A[]     = new int [5];
		int B[][]   = new int [4][4];
		int C[][][] = new int [4] [4][4];
		
		for (int i = 0 ; i <4 ; i++)
		{
			for (int j = 0 ; j<4 ;j++)
			{
				for (int k= 0 ; k<4 ;k++)
				{
					C[i][j][k] = i +j+k ;
				}
			}
		}
		for (int i [] [] : C)
		{
			for (int j [] : i)
			{
				for (int k : j)
				{
					System.out.print(k + " ");
				}
			}
		}
	}
}
