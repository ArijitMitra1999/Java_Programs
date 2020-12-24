package after_ExceptionHandling;
import java.io.*;
public class ExceptionHandling1 
{ 
	/*
	 * Throwable
	 *         1) Exception
	 *                 1) Checked
	 *                        -	IOException
	 *                        - SQLException
	 *                 2) Unchecked
	 *                        1) RuntimeException
	 *                               -ArithmeticException
	 *          2) Error   
	 *          in one try we can use multiple catch            
	 */

	public static void main(String[] args) 
	{
		int i = 8 , j  , k ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
		System.out.println("Enter the number of J : ");
		j = Integer.parseInt(br.readLine());
		k = i / j ;
		System.out.println( "Output is : "+ k);
		}
		catch(IOException e)
		{
		System.out.println("Check this code");
		}
		catch(Exception e)
		{
		System.out.println("Unknown Exception");
		}
		finally //It Prints anything that execute or not
		{
			System.out.println("Bye");
		}
	}
}


