package after_ExceptionHandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo_ListInterface 
{
	public static void main(String[] args) throws Exception
	{
		 List<Integer> values = new ArrayList<Integer>();
		 values.add(3);
		 values.add(88);
		 values.add(77);
		 values.add(1,9);
		 Collections.sort(values);
		 Collections.reverse(values);
		 Collections.shuffle(values);
		 for (int i : values) //Enhanced forloop for Collection Api
		 {
			 System.out.println(i);
		 }

    }
}
