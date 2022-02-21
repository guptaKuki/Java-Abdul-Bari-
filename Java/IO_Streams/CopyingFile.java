package IO_Streams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class CopyingFile {

	public static void main(String[] args)throws Exception {
		
		FileInputStream fis=new FileInputStream("e:/java (AbdulBari)/source1.txt");
		FileOutputStream fos=new FileOutputStream("e:/java (AbdulBari)/source2.txt");
		
		int x;
		while((x=fis.read()) != -1) {
			if(x>= 65 &&  x<=90)
				fos.write(x+32);
			else
				fos.write(x);
		}
		
		fis.close();
		fos.close();
		

	}

}
