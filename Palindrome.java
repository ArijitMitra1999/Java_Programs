package Java_Programs;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int num = 121,r,s = 0 ; // r = reminder and s = reverse number
	    int t = num; 
	    /* i used to store this value because in while loop like after getting reverse number num should be zero. */
	    while( num > 0 )
	    {
	    	r = num % 10;
            num = num  / 10;
	        s = s * 10 + r ;
	    }
	    // palindrome if orignalInteger and reversedInteger are equal
	    if (t == s)
	    	System.out.println(s + " is a palindrome.");
	    else
	        System.out.println(s + " is not a palindrome.");
		
	}
	

}
