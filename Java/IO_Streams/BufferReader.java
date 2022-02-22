package IO_Streams;

import java.io.*;

public class BufferReader {

	public static void main(String[] args) throws Exception{

//		FileReader fis= new FileReader("e:/Java (AbdulBari)/Source1.txt");
//		BufferedReader bis=new BufferedReader(fis);
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		
		String str=br.readLine();
		System.out.println(str);
		
//		fis.close();
//		bis.close();
	}

}
