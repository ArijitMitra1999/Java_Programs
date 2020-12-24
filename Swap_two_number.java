package Java_Programs;
import java.util.*;
public class Swap_two_number 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int temp;
		System.out.print("Enter the number of a : ");
		int a = sc .nextInt();
		System.out.print("Enter the number of b : ");
		int b = sc .nextInt();
		temp = a ;
		a = b ;
		b = temp ;
		System.out.println ("Value of b = a that is : " + a);
		System.out.println ("Value of a = b  that is :"  + b);
	}

}
