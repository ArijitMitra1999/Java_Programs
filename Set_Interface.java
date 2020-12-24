package after_ExceptionHandling;

import java.util.*;
// Set supports unique value
// Set not support duplicate elements
public class Set_Interface 
{

	public static void main(String[] args) 
	{
		Set<Integer> Values = new  HashSet<Integer>();
		Values.add(50);
		Values.add(60);
		Values.add(65);
		Values.add(96);
		Values.add(50);
		Values.add(60);
		for(int i : Values)
		{
			System.out.println(i);
		}
	}

}
