package IO_Streams;

import java.io.*;

public class RandomAccess {

	public static void main(String[] args) throws Exception {
		RandomAccessFile rf= new RandomAccessFile("e:\\Java (AbdulBari)\\Source2.txt","rw");
		
		/*java programming
		we have copy this file into another source file*/
		
		System.out.println((char)rf.read()); // to read one byte
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		rf.write('A'); //this will overwrite the previous write
		System.out.println((char)rf.read());
		rf.skipBytes(4); // to jump the pointer 
		System.out.println((char)rf.read());
		System.out.println(rf.getFilePointer()); //to get  the value pointer
		rf.seek(rf.getFilePointer()-7); // to move the pointer
		System.out.println((char)rf.read());
		rf.close();
		
	}
}
