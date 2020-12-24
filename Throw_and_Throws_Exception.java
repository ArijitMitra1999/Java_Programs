package after_ExceptionHandling;
import java.io.*;

public class Throw_and_Throws_Exception 
{
	public static void main (String [] args) throws Exception
	{
	int i = 8 , j  , k ;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number of J : ");
	j = Integer.parseInt(br.readLine());
	k = i + j ;
	System.out.println( "Output is : "+ k);
    }
}
// if use try and catch then we can throw a exception for own purposes