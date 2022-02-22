package IO_Streams;
import java.io.*;

public class CharArray {

	public static void main(String[] args)throws Exception {
		
		char c[]= {'a','b','c','d','e','f','g','h'};
		CharArrayReader cr= new CharArrayReader(c);
		
		int x;
		while((x=cr.read())!= -1)
			System.out.print((char)x+" ");
		
		cr.close();

	}

}