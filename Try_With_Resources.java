package after_ExceptionHandling;
//Try with resource
import java.io.*;
public class Try_With_Resources 
{
	// Whenever use io package then always close the resources

	public static void main(String[] args) throws Exception
	{
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		
		{
		String str;
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
	    //IF i use this resouces after try then no need to use catch
		str = br.readLine();
		}
				
	}

}
