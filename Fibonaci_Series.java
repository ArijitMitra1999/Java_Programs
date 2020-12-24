/*     1 1 2 3 5 8 13 21 .....N
 */
package Java_Programs;

public class Fibonaci_Series 
{
    public static void main(String[] args)
    {
	int k=0,a= 0,b=1;
	System.out.print("0 1 ");
	while(k < 50)
	{
		k= a + b ;
		a = b ;
		b = k ;
		System.out.print( " "  + k );
	}
    }
}
