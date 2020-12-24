package Java_Programs;
// DEFAULT & STATIC METHOD IN INTERFACE
interface MyInterface
{
    default void newMethod()
    {  
        System.out.println("Deafult Method In Interface");  
    } 
    static void anotherNewMethod()
    {
    	System.out.println("Static Method In Interface");
    }
}  
public class Static_Method_in_Interface implements MyInterface
{ 
    public static void main(String[] args) 
    {  
    	Static_Method_in_Interface obj = new Static_Method_in_Interface();
        obj.newMethod();    //For Default method need to create object  
        MyInterface.anotherNewMethod();
    }  
}

