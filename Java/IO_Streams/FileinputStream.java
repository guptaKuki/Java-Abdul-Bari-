package IO_Streams;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis= new FileInputStream("e:/java (AbdulBari)/Test.txt"); //pass the absolute path with new file name(text.txt)
			
			byte b[]=new byte[fis.available()]; //availabel is used to find the number of bytes present in the file.
			fis.read(b);
			
			String str=new String(b);
			System.out.println(str);
			
			fis.close(); //to close the resources.
			} 
			
			
			catch(FileNotFoundException e) {
				System.out.println(e);
			}catch( IOException e) {
				System.out.println(e);
			}
		}


	}


