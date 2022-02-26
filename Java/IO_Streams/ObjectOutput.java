package IO_Streams;
import java.io.*;

class College implements Serializable{ // Must implement Serializable.
	
	// if any variable is static and transient then it will not be serialized
	// it only serialized non-static member
	String name;
	int code;
	int noOfBranches;
	String state;
	
	College(){}  // must have a non parameterized constructor.
	
	public  String toString() {
		return "\nCollege Details\n"+
				"\nName Of College "+name+
				"\ncode "+code+
				"\nNo of Branches "+noOfBranches+
				"\nState "+state;
	}
}
public class ObjectOutput {

	public static void main(String[] args)throws Exception{
		FileOutputStream fos = new FileOutputStream("e:/Java (AbdulBari)/College.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		College c= new College();
		c.name="Academy of Technology";
		c.code=1062;
		c.noOfBranches=6;
		c.state="West Bengal";
		
		
		oos.writeObject(c);
		fos.close();
		oos.close();
	}

}
