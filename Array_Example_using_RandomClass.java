package Java_Programs;
import java.util.*;
public class Array_Example_using_RandomClass {
	public static void main (String [] args)
	{
		Random r = new Random();
		int value [] = new int[50];
		
		for (int i = 0 ; i < value.length ; i++)
		{
			value[i] = r.nextInt(50);
		}
		
		System.out.println(value [49]); //So it's print 1st 20th value then all
		
		for (int i : value)
			System.out.println(i);
	}

}
