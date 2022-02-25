package IO_Streams;

import java.io.*;

public class FileHandling {

	public static void main(String[] args) throws Exception {
			File f= new File("e:\\Java (AbdulBari)");
			
			System.out.println(f.isDirectory());
			
			// To get the list of files
			String list[]=f.list();
			for(String x:list) {
				System.out.println(x);
			}
			
			System.out.println("---------------------------------");
			
			// To get the list of files name with path
			 File file[]=f.listFiles();
			  for(File x: file) {
				  System.out.print(x.getName()+" ");
				  System.out.println(x.getPath());
			  }

			  File f2= new File("e:\\ Java (AbdulBari\\Test.txt");
			  
			
			  //f2.setReadOnly();
			  FileOutputStream fos = new FileOutputStream("E:\\Java (AbdulBari)\\Test.txt"); // this will give us error bcz we set it as read only.
			  System.out.println( f2.lastModified());
			
			 
			  fos.close();
			  
	}

}
