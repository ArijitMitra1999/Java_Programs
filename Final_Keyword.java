package Java_Programs;

public class Final_Keyword 
{
	public static void main(String[] args)
	{
		D obj = new D ();
		obj.show();
	
	}
}
class D
{
	final public void show()
	{
		System.out.println("In A Show");
	}
}
/*
class E extends D // Final Keyword never extends that is why we are getting errors 
{
	public void show() 
	{
		System.out.println("In B Show");
	}
} 
*/