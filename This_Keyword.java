package Java_Programs;

public class This_Keyword 
{
	public static void main (String [] args)
	{
		No obj = new No(6);
		obj.show();
	}
}
class No
{
	private int X ; // 	This represent the current instance
	public No (int X)
	{
		this.X = X ;
	}
	public void show()
	{
		System.out.println("X is :" + X);
	}
}