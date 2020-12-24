package Java_Programs;

public class Static_Block 
{
	static
	{
		System.out.println("Hello World"); // static block always execute first then main
	}
	public static void main(String[] args)
	{
		System.out.println("What fist ?");
	}
	static
	{
		System.out.println("Static first");
	}

}
