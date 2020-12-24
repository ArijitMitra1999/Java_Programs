package after_ExceptionHandling;

public class Threading_ChangeThreadName_Priority
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
			//Thread Priority Change
			T1.setPriority(1); //we can also use Thread.Min_Priority
			T2.setPriority(10); // Thread.Max_Priority
			System.out.println(T1.getPriority());
			System.out.println(T2.getPriority());
			
			//Thread Name Change
			T1.setName("Hii Thread");
			T2.setName("Hello Thread");
			System.out.println(T1.getName());
			System.out.println(T2.getName());
			T1.start(); // for run method we use start
			try{Thread.sleep(10);} catch (Exception e) {}
			T2.start();
	}

}
