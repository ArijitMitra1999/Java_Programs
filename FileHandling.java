/* File handling is nothing but the storing of data and retrieving that data. 
UTF is a type of format in which the data will be saved. 
writeUTF()  method is used to write the data and readUTF() method is used to read the data. */
package after_ExceptionHandling;
import java.io.*;
public class FileHandling 
{
	public static void main(String[] args) throws Exception
	{
		//Create a file and then write
		File f = new File("demo.txt");
		FileOutputStream dis = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(dis);
		dos.writeUTF("Demo Content");
		
	    //Write
		FileInputStream fis = new FileInputStream(f);
		DataInputStream fos = new DataInputStream(fis);
		String str = fos.readUTF();
		System.out.println(str);
	}
}
