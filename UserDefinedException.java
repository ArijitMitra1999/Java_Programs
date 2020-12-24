package after_ExceptionHandling;

public class UserDefinedException 
{

	public static void main(String[] args) 
	{
		int i = 5 ;
		try
		{
		if (i > 10)
		
			System.out.println("Valid");

		else
			
		throw new MyException("error");
		
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
class MyException extends Exception
{
	public MyException(String mag)
	{
		super(mag);
	}
}