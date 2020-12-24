package Java_Programs;
import java.util.*;
public class String_Operation {

	public static void main(String[] args) 
	{
		String s1, s2 ;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 2 Strings");
		System.out.println("Enter 1st String : ");
		s1 = sc.nextLine();
		System.out.println("Enter 2nd String : ");
		s2 = sc.nextLine();
		
		//Step 1 (Finding Length)
		int L1 = s1.length();
		int L2 = s2.length();
		int L3 = L1 + L2  ;
		System.out.println("String length L1 : " + L1);
		System.out.println("String length L2 : " + L2);
		System.out.println("Total Length L3 : " + L3);
		// Step 2 (Finding Concatenation)
		String s3 = s1 +" " +s2 ;     //s1.concat(s2);
		System.out.println("After Concatenation, result is : " + s3);
		
		// Step 3 (Convert 1st sting into Upper Case)
		s1 = s1.toUpperCase();
		s2 = s2.toLowerCase();
		System.out.println("First String into Uppar Case : " + s1);
		System.out.println("Second String into Lower Case : " + s2);
	}
	

}
