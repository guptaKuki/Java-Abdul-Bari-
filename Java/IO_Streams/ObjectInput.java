package IO_Streams;

import java.io.*;

// A class can can be Serialized and deserialized but the class must be same (not similar) .
// Each serialized class have serialized Id.
public class ObjectInput {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("e:/Java (AbdulBari)/College.txt");
		
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		College c2= (College)ois.readObject(); // To read the file we need to type cast into College object
		
		System.out.println(c2);
		
		fis.close();
		ois.close();
	}

}
