package after_ExceptionHandling;
//Key value Pairing
import java.util.*;
public class Map_Inteface 
{

	public static void main(String[] args) 
	{
		Map <String,String>map = new HashMap<>();
		map.put("Myname : ", "Arijit"); //we use put for adding value
		map.put("Hisname : ", "Sayandeep");
		map.put("Hername : ", "Prayash");
		
		Set<String> keys = map.keySet(); // keySet give set of values
	
		for(String key : keys)
		{
		   System.out.println(key + " " + map.get(key)); 
		// for fetching the value we use " .get(key) "
		}
	}

}
