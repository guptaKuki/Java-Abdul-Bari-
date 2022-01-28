package ExceptionHandling;

public class CheckedUnchecked {
	static void fun1() {            //The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exception.
		try {
		System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	static void fun2() {
		fun1();
	}	
	static void fun3() {
		fun2();
	}
	public static void main(String[] args) {
		fun3();
	}
}
