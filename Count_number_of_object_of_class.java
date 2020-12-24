package Java_Programs;

class A
{
    int i;
	public A()
	{
		i++;
	}
	public void Counter() 
	{
		System.out.println(i);
	}
	
}


public class Count_number_of_object_of_class 
{
	public static void main (String [] args)
	{
	A obj1 = new A();
	A obj2 = new A();
	A obj3 = new A();
	
	obj1.Counter();
	obj2.Counter();
	obj3.Counter();
	
	}
}
