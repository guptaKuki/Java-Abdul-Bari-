package StaticAndFinal;

//public class StaticBlocks {
//static {
//	System.out.println("Block 1");
//}
//	public static void main(String[] args) {  (It is executed before the main method at the time of class loading.)
//	
//	}
//
//	static {
//		System.out.println("Block 2");
//	}
//}

class Example2{
	static {                 //Set of statements are written in the form of blocks and are made static.
		System.out.println("BLock 3");
	}
	
	static {
		System.out.println("Block 4"); //Static blocks are executed in the order they define.
	}
}
public class StaticBlocks {

	public static void main(String[] args) {  //If class  Example is not used in main method then no static block will printed.
		System.out.println("Main");
		
		Example2 e=new Example2();
	}

	
}