package IO_Streams;
import java.io.*;

public class ByteInput {

	public static void main(String[] args) throws Exception{
		byte b[]= {'a','b','c','d','e','f','g','h','i'};
		
		ByteArrayInputStream bis= new ByteArrayInputStream(b);
		
//		int x;
//		while((x=bis.read()) !=-1) {
//			System.out.print((char)x+" ");
//		}
		
		String str=new String(bis.readAllBytes());
		System.out.println(str);
		System.out.println(bis.markSupported()); // mark supported bcz it's a array we can read multiple times.
		bis.close();

	}

}
