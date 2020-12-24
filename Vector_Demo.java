package after_ExceptionHandling;
//Vector can print capacity directly
//By default array capacity is 10
//Vector icrease capacity by requirement
import java.util.*;
public class Vector_Demo 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> v = new ArrayList<>(); //ArrayList are not Thread Safe
//		Vector<Integer>v = new Vector<Integer>(); //Theoritically Vectors are Thread safe
		v.add(5);
    	v.add(7);
//		v.add(6);
//		v.add(9);
//		v.add(65);
//		v.remove(1); // Index Number
//      System.out.println(v.capacity());
//		for(int i : v)
//		{
//			System.out.println(i);
//		}
		System.out.println(v.size());
		for(int i : v)
		{
			System.out.println(i);
		}
	}

}
