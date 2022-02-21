package IO_Streams;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileoutputStream {

	public static void main(String[] args) {
		try {
		FileOutputStream fos= new FileOutputStream("e:/java (AbdulBari)/Test.txt");
		
		String str="Learn Java Programming";
		
	    //fos.write(str.getBytes());
		
		//another way of writing.
		byte b[]=str.getBytes();
		for( byte x:b)
			fos.write(x);
		
		fos.write(b, 6, str.length()-6); // byte array, offset,length
		fos.close();
		} 
		
		
		catch(FileNotFoundException e) {
			System.out.println(e);
		}catch( IOException e) {
			System.out.println(e);
		}
	}

}
