package Java_Programs;

public class String_Buffer 
{

	public static void main(String[] args) 
	{
		StringBuffer sbf = new StringBuffer("Arijit");
		sbf.append(" Mitra");
		System.out.println("Without Replacement : " + sbf); 
		sbf.replace(0, 3, "Abhi");
		System.out.println("With Replacement : "+sbf); 

	}

}
