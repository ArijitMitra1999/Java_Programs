package Java_Programs;
import java.util.*;
class Demo_Loop 
{
	public static void main (String[] args)
	{
		Scanner A = new Scanner (System.in);
		System.out.println("Enter a number between 1 to 10");
        double i = A.nextDouble();
	    while(i < 10)
	    {
		System.out.println(i);
		i++;
	    }
	     
	}
}
