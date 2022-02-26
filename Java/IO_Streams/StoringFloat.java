package IO_Streams;

import java.io.*;

public class StoringFloat {

	public static void main(String[] args)throws Exception {
		
		float list[]= {10.5f,5.2f,4.3f,81.2f};
		
		FileOutputStream fo= new FileOutputStream("e:/Java (AbdulBari)/FolatingNumber.txt");
		DataOutputStream dos= new DataOutputStream(fo);
		
		dos.writeInt(list.length);
		
		for(float x: list) {
		dos.writeFloat(x);
		}
	
		dos.close();
		fo.close();
	
		FileInputStream fi =new FileInputStream("e:/Java (AbdulBari)/FolatingNumber.txt");
	
		DataInputStream dis= new DataInputStream(fi);
	
		int length =dis.readInt();
		float data;
		for( int i=0;i<length;i++) {
			data= dis.readFloat();
			System.out.print(data+"  ");
		}
			dis.close();
			fi.close();
		
	}

}
