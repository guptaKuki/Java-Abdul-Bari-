package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		try {      //The try statement allows you to define a block of code to be tested for errors while it is being executed.
			int c=a/b;
			System.out.println("Value of c :"+c);
		} 
		//Try and Catch block comes in pairs.
		catch(ArithmeticException e) {     //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
			System.out.println("Division by zero is not allowed.");
		}
		System.out.println("Bye");
	}

}
