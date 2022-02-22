package IO_Streams;
import java.io.*;

public class BufferInput {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis= new FileInputStream("e:/Java (AbdulBari)/Source1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
//		int x;
//		while((x=bis.read()) != -1)
//			System.out.print((char)x);
		
		System.out.println("File -"+ fis.markSupported());
		System.out.println("Buffer -"+bis.markSupported());
		System.out.println();
		
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.mark(10);
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.reset();
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		
		
		fis.close();
		bis.close();
	}

}
