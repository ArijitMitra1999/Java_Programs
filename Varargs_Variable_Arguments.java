package Java_Programs;
public class Varargs_Variable_Arguments {
	// A method that takes variable number of integer 
    // arguments. 
    static void fun(int ... a) 
    { 
        System.out.println("Number of arguments: " + a.length); 
  
        // using for each loop to display contents of a 
        for (int i: a) 
            System.out.print(i + " "); 
        System.out.println(); 
    } 
  
    // Driver code 
    public static void main(String [] args) 
    { 
        // Calling the varargs method with different number 
        // of parameters 
        fun(100);         // one parameter 
        fun(1, 2, 3, 4);  // four parameters 
        fun ();
    } 
} 