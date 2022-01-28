package ExceptionHandling;

class LowBalanceException extends Exception {
	public String toString() {
		return "Balance should not be less than 1000";
	}
}

public class DefineExceptionClass {
	static void fun2() {
		try {
		throw new LowBalanceException();
		}
		catch(LowBalanceException e) {
			System.out.println(e);
		}
	}
	
	static  void fun1() {
		System.out.println(10/5);
		fun2();
	}

	public static void main(String []args) {
		fun1();
	}
}
