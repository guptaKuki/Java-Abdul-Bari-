package IO_Streams;

import java.io.*;

public class MyRead {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("e:\\Java (AbdulBari)\\My.txt");
		
		BufferedReader br= new BufferedReader( new InputStreamReader(fis));
		
		Student s= new Student();
		s.rollNo= Integer.parseInt(br.readLine());
		s.name=br.readLine();
		s.branch=br.readLine();
		
		System.out.println("Name :"+s.name+" Roll :"+s.rollNo+" Branch :"+s.branch);
		

	}

}
