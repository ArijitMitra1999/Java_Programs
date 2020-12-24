package after_ExceptionHandling;
//Collection interface
import java.util.Collection;
import java.util.ArrayList;
public class Collection_Generics {

	public static void main(String[] args) throws Exception
	{
	//	int values[] = new int [4];
	//	Object values1[] = new Object[4]; // In this array we can use anything like integer string
		
	//	values1[0] = "Arijit" ;
	//	values1[1] = 5;
	//If we need integer string both then we can use "Object"
	//Otherwise use generics like both site mention <Integer>,<Double>
		 Collection<Double> values = new ArrayList<Double>();
		 values.add(3.2);
		 values.add(5.6);
		 values.add(3.54);
		 values.remove(5.6);
		 for (Object i : values) //Enhanced forloop for Collection Api
		 {
			 System.out.println(i);
		 }
	}

}
