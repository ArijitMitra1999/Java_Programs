package after_ExceptionHandling;

import java.util.Scanner;
class AgeException extends Exception
{
	AgeException(String str)
	{
		System.out.println(str);
	}
}

public class UserDefinedException2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age::");
		int a =sc.nextInt();
		try
		{
		
		if(a<18)
			throw new AgeException("Invalid Age");
		else
			System.out.println("Valid Age");
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}

}
}
