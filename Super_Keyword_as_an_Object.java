package Java_Programs;

public class Super_Keyword_as_an_Object 
{
	public static void main (String [] args)
	{
		C obj = new C ();
		obj.show();
	}

}
class B
{
	int i = 5 ;
}
final class C extends B
{
	int i = 4 ;
	public void show()
	{
		System.out.println(super.i);
			
	}
}