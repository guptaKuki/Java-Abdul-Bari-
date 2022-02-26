package IO_Streams;

import java.io.FileInputStream;
import java.io.DataInputStream;

public class Datainput {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("e:/Java (AbdulBari)/Stuent2.txt");
		DataInputStream dis= new DataInputStream(fis);
		
		Student s2= new Student();
		
		// If we read the data we need to read that data in same order in which the data is written.
		s2.rollNo= dis.readInt();
		s2.name=dis.readUTF();
		s2.branch = dis.readUTF();
		s2.avg = dis.readFloat();
		
		System.out.println("Name :"+s2.name+" Roll :"+s2.rollNo+" Branch :"+s2.branch+ " Average :"+s2.avg);
		
		
		fis.close();
		dis.close();
	}

}
