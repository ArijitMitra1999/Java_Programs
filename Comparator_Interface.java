package after_ExceptionHandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class Comparator_Interface {

	public static void main(String[] args) 
	{
		 List<Integer> values = new ArrayList<Integer>();
		 values.add(3);
		 values.add(88);
		 values.add(77);
		 values.add(1,9);
		//We can use lambda expression over here like
		// Comparator<Integer> c = (i , j ) -> return (i % 100 > j % 100 ? 1 : -1 ) ;
		 Comparator<Integer> c =  new Comparator<Integer>() //Anonymous Class for creating object of a interface
				 {
			         public int compare(Integer i , Integer j) 
			         {
//			        	 if(i % 100 > j % 100)
//			        		 return 1;
//			        	 else
//			        		 return 0 ;
// Or We can change if else by ternary operator like
			        	  return (i % 100 > j % 100 ? 1 : -1 ) ;
			         }
			 
				 };
		 Collections.sort(values, c);
		 for(int k : values) 
		 {
			 System.out.println(k);
		 }
	}

}
