package Java_Programs;

public class Ascii_Value 
{
	public static void main(String[] args)
	{
		// 7 bits
		// 2 ^ 7 = 128
		// 0 - 127
		// American Standard Code for Information Interchange
		for (int i = 0 ; i <=127 ; i ++)
		{
			System.out.printf(" %d : %c \n" , i , i);
		}
	}
}
