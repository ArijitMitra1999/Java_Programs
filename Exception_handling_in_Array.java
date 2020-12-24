package Java_Programs;
import java.util.*;
public class Exception_handling_in_Array {
	public static void main (String[] args)
	{
		int a [] = new int[50];
		
		for (int i = 0 ; i< a.length ; i++)
		{
			a [i] = i + 1 ;
		}
		try
		{
		System.out.println(a[52]);
		}
		catch(Exception e)
		{
		System.out.println("Exception Ignored");
		}
		for ( int i : a)
		System.out.println(i);
	}

}
