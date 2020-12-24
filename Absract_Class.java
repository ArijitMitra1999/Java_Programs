package Java_Programs;

import static java.lang.System.out;

public class Absract_Class 
{
	public static void main(String [] args)
	{
		Maheshphone obj = new Sureshphone(); // you cannot create object of abstract class
		obj.call();
		obj.move();
		obj.dance();
		obj.cock();
	}
}
abstract class Maheshphone
{
	public void call ()
	{
		out.println("Calling....");
	}
	public abstract void move(); // Abstract Method
	public abstract void dance();
	public abstract void cock();
}
abstract class Rameshphone extends Maheshphone
{
	public void move()
	{
		out.println("Moving....");
	}
}
class Sureshphone extends Rameshphone //concrete class
{
	public void dance()
	{
		out.println("Dancing....");
	}
	public void cock()
	{
		out.println("Cocking....");
	}

}
