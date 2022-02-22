package IO_Streams;
import java.io.*;

public class ByteOutput {

	public static void main(String[] args) throws Exception{
		ByteArrayOutputStream bos= new ByteArrayOutputStream(10);
	
		bos.write('a');
		bos.write('b');
		bos.write('c');
		bos.write('d');
		
		byte b[]= bos.toByteArray();
		for(byte x:b)
			System.out.println((char)x);
		
		bos.writeTo(new FileOutputStream("e:/Java (AbdulBari)/Test.txt"));

		bos.close();
	}

}
