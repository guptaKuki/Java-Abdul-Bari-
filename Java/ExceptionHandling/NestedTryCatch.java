package ExceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		 int a[]= {10,0,8,3,5};
		 try {
			 int r=a[1]/a[2];
			 System.out.println(r);
			 // when a try catch block is presented in another try block then it is called a nested try catch block.
			 try {
				 System.out.println(a[10]);
			 }
			 catch(ArrayIndexOutOfBoundsException e) {
				 System.out.println(e);
			 }
		 }
		 catch(ArithmeticException e) {
			 System.out.println(e);
		 }

	}

}
