package Java_Programs;
class Child
{
	int rollno;
	String name;
	
	public Child (int rollno , String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
    //Right click -> Source -> Generating toString
	@Override
	public String toString() {
		return "Child [rollno=" + rollno + ", name=" + name + "]";
	}

}

public abstract class toString_Method 
{
	public static void main(String [] args)
	{
		Child s1 = new Child (11, "Arijit");
		System.out.println("ONLY ROLL : "+s1.rollno);
		System.out.println(); // Only space print
		System.out.println(s1.toString());
	}
}
