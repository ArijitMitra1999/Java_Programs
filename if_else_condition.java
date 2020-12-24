package Java_Programs;
import java.util.*;
public class if_else_condition {
	public static void main(String a[])
	{
	 Scanner scanner = new Scanner (System.in);
	 System.out.println("Enter Your First Number");
     int A = scanner.nextInt();
     
     System.out.println("Enter Your Second Number");
     int B = scanner.nextInt();
     
     System.out.println("Enter Your Third Number");
     int C = scanner.nextInt();
      // AND FUNCTION '&&'
     if (A > B && A > C) {
     System.out.println("True Answer for And Function") ;
     }
     else if (B > C) {
    	 System.out.println("Sometimes True Answer for And Function");
     }
     else {
    	 System.out.println("False Answer for And Function");
     }
     //OR FUNCTION '||'
     if (A > B || A > C) {
         System.out.println("Perfect for Or Function") ;
         }  
}}
