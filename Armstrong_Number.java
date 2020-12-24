package Java_Programs;

import java.util.Scanner;

public class Armstrong_Number 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int temp = n ; int sum = 0 ; int r ;
		
		while (n > 0)
		{
			r = n % 10 ;
			n = n / 10 ;
			sum = sum + r*r*r ;
		}
		if (temp == sum)
			System.out.println("It is a Amstrong Number");
		else
			System.out.println("It is Not a Amstrong Number");
	}
}
