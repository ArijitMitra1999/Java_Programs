package Java_Programs;
import java.util.*;
public class Perfect_Number {
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		boolean b = isperfect(num) ;
		if (b)
			System.out.println("Its a perfect number");
		else
			System.out.println("Its not a perfect number");	
	}
	public static boolean isperfect(int num)
	{
		int sum = 0 ;
		for (int i = 1 ; i < num ; i++)
		{
			if (num % i == 0)
				sum = sum + i ;
		}
		if (num == sum)
			return true ;
		else
		return false ;
	}

}
