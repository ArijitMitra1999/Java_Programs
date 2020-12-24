package Java_Programs;

public class Inheritance {
	public static void main(String[] args) 
	{
		Mul obj = new Mul();
		obj.num1 = 2 ;
		obj.num2 = 1 ;
		obj.Add();
		System.out.println(obj.result);
		obj.Sub();
		System.out.println(obj.result);
		obj.Mul();
		System.out.println(obj.result);
	}
}
class Add
{
	int num1,num2,result;
	public void Add()
	{
		result = num1 + num2 ;
	}
}
class Sub extends Add
{
	public void Sub()
	{
		result = num1 - num2 ;
	}
}
class Mul extends Sub
{
	public void Mul()
	{
		result = num1 * num2 ;
	}
}
