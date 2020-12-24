package Java_Programs;

public class Anoymous_Object
{
	public static void main(String[] args) 
	{
		new object(6).show(); // this object is use when we take care of one class only.
	}
}
class object
{
	private int i ;
	public object (int i)
	{
		this.i = i;
	}
	public void show()
	{
		System.out.println("i is : " + i);
	}

}
