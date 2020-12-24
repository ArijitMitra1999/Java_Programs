package Java_Programs;
import java.util.ArrayList;
//int,float,double - primitive data type
// Integer , Float, Double , Character - Classes
public class Wrapper_Class 
{

	public static void main(String[] args) 
	{
		int i = 5 ;
		Integer ii = new Integer(i); //boxing
		Integer jj = i ; //Auto Boxing
		
		int j = jj.intValue(); //Unboxing
		int k = jj;  //Autounboxing
		
		ArrayList<Integer> values = new ArrayList<Integer> ();
		values .add(5);
		values.add(7);
		

	}

}
