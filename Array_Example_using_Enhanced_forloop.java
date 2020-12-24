package Java_Programs;

public class Array_Example_using_Enhanced_forloop {
	public static void main(String [] args)
	{
		int a [] = new int [5];
		for (int i = 0 ; i < a.length ; i++)
		{
			a [i] = i + 1 ;
		}
		for(int i : a)
			System.out.println (i);
	}

}
