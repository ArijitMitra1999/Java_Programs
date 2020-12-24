package Java_Programs;
// We can use Multiple inheritance  in Interface.

interface Ari  //we can not define interface
{
	void show();
}
class AbcImp implements Ari
{
	public void show()
	{
		System.out.println("In show");
	}
}
public class Interface 
{

	public static void main(String[] args) 
	{
		AbcImp obj = new AbcImp();
		obj.show();
	}

}
