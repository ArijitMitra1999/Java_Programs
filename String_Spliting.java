package Java_Programs;

public class String_Spliting 
{

	public static void main(String[] args) 
	{
		String str = "Navin,Mahesh,Arijit"; //immutable
		
		String names[] = str.split(","); //split break the hole string and divide into many string for that we specify ","
		System.out.print(names[0]);

	}

}
