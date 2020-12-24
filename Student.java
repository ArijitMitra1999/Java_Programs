package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
class Demo  
{
	 String name;
	    int Rollno;
	    int marks;
	 
	Demo(int Rollno, String name, int marks){
	        
	        this.name=name;
	        this.marks=marks;
	        this.Rollno=Rollno;
	}
	 
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getRollno() {
	        return Rollno;
	    }
	    public void setRollno(int rollno) {
	        Rollno = rollno;
	    }
	    public float getMarks() {
	        return marks;
	    }
	    public void setMarks(int marks) {
	        this.marks = marks;
	    }
	    
	public String toString() {
	        return ("Name:"+name+"\tRollNo:"+Rollno+"\tMarks"+marks);
	    }
}
public class Student
{
	public static void main(String [] args)
	{
		List<Demo>Studs = new ArrayList<Demo>();
		Studs.add (new Demo (5, "Arijit", 55));
		Studs.add (new Demo(7, "Abhijit", 98));
		Studs.add (new Demo (2, "Sushanta", 77));
		
		System.out.println("** Before sorting **:");
        
        for (Demo student : Studs) {
            System.out.println(student);
        }
        Collections.sort(Studs,new MarksComparator());
        
        System.out.println("** After sorting **");
         
        for (Demo student : Studs) {
            System.out.println(student);
        }
		
	}

}