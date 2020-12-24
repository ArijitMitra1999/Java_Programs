package Java_Programs;
// It's only take binary number for opeartion but gives data only decimal
public class Left_and_Right_Shift_Operator 
{

	public static void main(String[] args) 
	{
		//Left Shift
		int a = 8 ;     //     1 0 0 0
		int b = a << 2; //Ans: 1 0 0 0 0 0	it's decimal number 32
		System.out.println(b);
		//Right Shift
		int c = 8 ;     //     1 0 0 0
		int d = c >> 2; //Ans: 1 0  	it's decimal number 2
		System.out.println(d);
	}
}
