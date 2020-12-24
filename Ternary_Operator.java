package Java_Programs;
// It is a replacement of if else condition
import java.util.*;
public class Ternary_Operator
{

	public static void main(String[] args) 
	{
		Scanner find = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int A = find.nextInt();
		System.out.println("For Ternary Operator :");
		boolean B = A == 1 ? true : !true ;
		System.out.println(B);
		
	}
}