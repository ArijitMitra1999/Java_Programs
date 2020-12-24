package Java_Programs;
//Bitwise operator -> //AND (&) 
                      //OR  (|)
//Bitwise operator actually dealing with binary numbers
//& 1 1 -> 1
//| 1 0 -> 1
//| 0 0 -> 0
//| 0 1 -> 1
public class Bitwise_Operator 
{
	public static void main(String args[]) 
	{
		// AND OPERATION
		int a = 25;  // 1 1 0 0 1
		int b = 15;  // 0 1 1 1 1
		             // 0 1 0 0 1 -> 9
		int c = a & b;
		System.out.println(c);
		// OR OPERATION
		int e = 25;  // 1 1 0 0 1
		int f = 15;  // 0 1 1 1 1
		             // 1 1 1 1 1 -> 31
		int g = e | f;
		System.out.println(g);
	}

}
