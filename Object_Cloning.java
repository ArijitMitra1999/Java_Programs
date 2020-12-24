package after_ExceptionHandling;

public class Object_Cloning {

	public static void main(String[] args) {
		/*
		 * 1. Shallow
		 * 2. Deep
		 * 3. Clone
		 */
		// Shallow
		Abc obj = new Abc();
		obj.i = 5 ;
		obj.j = 6 ;
		Abc obj1 = obj;
		obj1.j =8 ;
	 /*// For Deep
		  Abc obj = new Abc();
		  obj.i = 5 ;
		  obj.j = 6 ;
		  Abc obj1 = new Abc();
		  obj1.i = obj.i ;
		  obj1.j = obj.j ;
		  obj1.j =8 ;
    */
		System.out.print(obj); // For deep : i = 5 , j = 6 
		System.out.print(obj1); // for deep : i = 5 , j = 8

	}

}
class Abc
{
	int i ;
	int j ;
	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}
	
	
}
