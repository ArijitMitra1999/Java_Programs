package Java_Programs;

public class Constructor_Overloading_Example 
{
	public static void main (String [] args)
	{
		constructor obj = new constructor(5.5);
	}

}
class constructor
{
	public constructor(int i)
	{
		System.out.println("It's a int value");
	}
	public constructor(double j)
	{
		System.out.println("It's a double value");
	}
}