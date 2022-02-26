package IO_Streams;

import java.io.*;
 // Here we want to store the object of class Student in a my.txt file.
class Student{        // Student Class
	int rollNo;
	String name;
	String branch;
	float avg;
}

public class MyWrite {

	public static void main(String[] args)throws Exception {
		
		FileOutputStream fos = new FileOutputStream("e:/Java (AbdulBari)/My.txt");  // To write in a file we need FIleoutputstream
		
		PrintStream ps= new PrintStream(fos);  // print stream to print the object in a file.
		// Whatever we write in print stream will go into fileoutputstream and through fos will go into my.txt file
		
		Student s= new Student();
		s.rollNo=82;
		s.name="Kuki";
		s.branch="ECE";
		
		ps.println(s.rollNo);
		ps.println(s.name);
		ps.println(s.branch);
		
		fos.close();
	}

}
