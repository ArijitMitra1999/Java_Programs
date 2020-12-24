package Java_Programs;
import java.util.*;
public class Switch_Case 
{
	public static void main(String args[]) 
	{
		Scanner A = new Scanner(System.in);
		System.out.println("Enter Zero to three");
		int B = A.nextInt();
		System.out.println("By Swich Case You Enter : ");
		switch (B) 
		{
		case 0 :
		{
		    System.out.println("Zero");
		    break;
		}
		case 1 :
		{
			System.out.println("One");
			break;
		}
		case 3:
		{
			System.out.println("Three");
			break;
		}
		case 4 :
		{
			System.out.println("Four");
			break;
		}
	    default :
	    {
	    	System.out.println("You Enter Wrong Number");
	    	break;
	    }
		}
		
    }
}
