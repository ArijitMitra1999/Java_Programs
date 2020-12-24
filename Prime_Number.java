package Java_Programs;
import java.util.Scanner;
public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		boolean isprime = true ;
		
		for (int i = 2 ; i < num / 2 ;i++)
		{
			if (num % i == 0)
			{
				isprime = false ;
				break;
			}
		}
		
		if (isprime)
		{
			System.out.println(num + " It is prime number");
		}
		else
		{
			System.out.println(num + " It is not prime number");
		}

	}

}
