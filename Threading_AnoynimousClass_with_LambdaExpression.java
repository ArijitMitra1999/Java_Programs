package after_ExceptionHandling;
//Efficient Code
public class Threading_AnoynimousClass_with_LambdaExpression 
{
	public static void main(String[] args) throws Exception
	{
		Thread T1 = new Thread(()->  
		{
			for(int i=1 ; i <5 ; i++)
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
		});
		
		Thread T2 = new Thread( ()->
		{
			for(int j = 1 ; j< 5 ; j++)
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
		});
		T1.start(); // for run method we use start
		try{Thread.sleep(10);} catch (Exception e) {}
		T2.start();
		System.out.println(T1.isAlive());
		//isAlive() - it is used to check that thread in in running state or not.
		
		//Joining
		T1.join(); //Join method join a statement at last when thread are going to stop.
		T2.join();
		System.out.println(T1.isAlive());
		System.out.println("Joining!!");
		
	}

}
