package Java_Programs;
import java.io.*;
import java.util.*;
import java.lang.*;
public class BufferedReader1 
{
/*
 *  We use BufferedReader for taking input
 *  for use BufferedReader we have create object for BufferedReader
 *  that is InputStreamReader
 */
	public static void main(String [] args ) throws Exception
	{
		System.out.println("Enter a number");
//		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)/*or 'is'*/); 
	
		int n = Integer.parseInt(br.readLine()); // br.readLine(); -> this is in String format so if you want to convert it to a input format then follow the line
		//parseInt is a method that take a string for that we want a class that is Integer
		System.out.println(n);
	}

}


