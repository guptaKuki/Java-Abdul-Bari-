package ExceptionHandling;

public class ThrowAndThrows {

	static int area( int l,int b) throws Exception{  //Throwing an exception is alternating to returning inside the method.
		if(l<0 || b<0)
			throw new Exception(); //Only one exception can be thrown at a time by using throw keyword.
		//It is used within the method.
		return l*b;
	}
	
	static void method1() throws Exception{
		System.out.println("Area is :"+area(10,-5));
	}
	public static void main(String[] args) {
		try {
	     method1();
		}
		catch(Exception e) {
			System.out.println("Dimension should not be negative.");
		}
	}

}
