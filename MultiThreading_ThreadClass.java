package after_ExceptionHandling;
//Everything is continue through Thread
//Thread.sleep(500) that means it will print after 5 second one by one
//We Use Exception Handling cause it shows error
class Hi extends Thread
{
	public void run()  // 	Thread should be in run method
	{
		for(int i=1 ; i <=5 ; i++)
		{
		System.out.println("Hii");
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e) 
		{
			System.out.println("Error");
		}
		}
	}
}
class Hello extends Thread
{
	public void run()
	{
		for(int j = 1 ; j<= 5 ; j++)
		{
		System.out.println("Hello");
		try
		{
			Thread.sleep(1000);
		} 
		catch (Exception e) 
		{
			System.out.println("Error");
		}
		}
	}
}
public class MultiThreading_ThreadClass 
{
	public static void main(String [] args)
	{
	Hi obj1 = new Hi();
	Hello obj2 = new Hello();
	
	obj1.start(); // for run method we use start
	try{Thread.sleep(10);} catch (Exception e) {}
	obj2.start(); // Start is a method only used for thread
	
	}
}
