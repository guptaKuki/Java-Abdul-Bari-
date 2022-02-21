package IO_Streams;

import java.io.FileReader;

public class Filereader {

	public static void main(String[] args)throws Exception {
		
		FileReader fr=new FileReader("e:/java (AbdulBari)/Test.txt");
		
		int x;
		while((x=fr.read()) != -1) {
			System.out.print((char)x);
		}

	}

}
