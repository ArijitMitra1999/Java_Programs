package after_ExceptionHandling;

	class Ari implements Runnable
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
	class Abhi implements Runnable
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
	public class Threading_RunableInterface {
	public static void main(String[] args) 
	{
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		Thread T1 = new Thread(obj1);
		Thread T2 = new Thread(obj2);
		
		T1.start(); // for run method we use start
		try{Thread.sleep(10);} catch (Exception e) {}
		T2.start();

	}

}
