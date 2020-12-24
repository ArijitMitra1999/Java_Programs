package after_ExceptionHandling;

public class Object_Cloning_Part2 
{
	public static void main (String [] args) throws CloneNotSupportedException
	{
		Ab obj = new Ab();
		obj.i = 5 ;
		obj.j = 6 ;
		Ab obj1 = (Ab)obj.clone();
		
		System.out.print(obj);
		System.out.print(obj1);
	}

}
class Ab implements Cloneable
{
	int i ;
	int j ;
	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}
	@Override
	public Ab clone() throws CloneNotSupportedException
	{
		return (Ab) super.clone();
	}
}