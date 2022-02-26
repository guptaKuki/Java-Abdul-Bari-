package IO_Streams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Dataoutput {

 public static void main(String[] args) throws Exception{
		
		FileOutputStream fos = new FileOutputStream("e:/Java (AbdulBari)/Stuent2.txt");
		DataOutputStream dos= new DataOutputStream(fos);
		
		Student s1= new Student();
		s1.rollNo=82;
		s1.name="Kuki";
		s1.branch="ECE";
		s1.avg=80.5f;
		
		dos.writeInt(s1.rollNo);
		dos.writeUTF(s1.name);
		dos.writeUTF(s1.branch);
		dos.writeFloat(s1.avg);
		
		fos.close();
		dos.close();
	}

}
