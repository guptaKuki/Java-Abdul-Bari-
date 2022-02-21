package IO_Streams;
import java.io.FileInputStream;
import java .io.FileOutputStream;
import java.io.SequenceInputStream;
public class Copying2 {

	public static void main(String[] args)throws Exception {
		
		FileInputStream fis1=new FileInputStream("e:/Java (AbdulBari)/Source1.txt");
		FileInputStream fis2=new FileInputStream("e:/Java (AbdulBari)/source2.txt");
		
		FileOutputStream fos=new FileOutputStream("e:/Java (AbdulBari)/Destination.txt");
		
		SequenceInputStream sis= new SequenceInputStream(fis1,fis2);
		int x;
		while((x=sis.read()) != -1) {
			fos.write(x);
			System.out.print((char)x);
		}
		
		sis.close();
		fos.close();
		fis1.close();
		fis2.close();
		
	}

}
