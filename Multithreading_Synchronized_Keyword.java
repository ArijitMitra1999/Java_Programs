package after_ExceptionHandling;

class counter
{
	int count;
	public synchronized void increment ()
	{
		count++;
	}
}
public class Multithreading_Synchronized_Keyword {

	public static void main(String[] args) throws Exception
	{
		counter c = new counter();
		c.increment();
		Thread T1 = new Thread (new Runnable()
				{
			         public void run ()
			         {
			        	 for (int i = 1 ; i < 1000 ; i++) 
		                     {
			                    c.increment();
	                         }
			         }
				});
		Thread T2 = new Thread (new Runnable()
		{
	         public void run ()
	         {
	        	 for (int i = 1 ; i < 1000 ; i++) 
                     {
	                    c.increment();
                     }
	         }
		});
		T1.start();
		T2.start();
		
		T1.join();
		T2.join();
		System.out.println("Count" + c.count);

	}

}
