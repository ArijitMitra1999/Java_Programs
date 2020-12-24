package Java_Programs;

public class first_last_initial 
{
			public static void main(String a[])
			{
			int studentAge = 21;
			double studentGPA = 6.55;
		    boolean hasperfectAttandance = true;
		    String studentFirstName = "Arijit";
		    String studentLastName = "Mitra";
			char studentFirstInitial = studentFirstName.charAt(0);
		    char studentLastInitial = studentLastName.charAt(0);
		    
		    System.out.println(studentFirstInitial);
		    System.out.println(studentLastInitial);
		    System.out.println(studentAge);
		    System.out.println(studentFirstName + " " + studentLastName + " " + "has Cgpa of" + " " + studentGPA);
			}
}


