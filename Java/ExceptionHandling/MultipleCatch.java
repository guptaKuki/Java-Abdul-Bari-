package ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int a[]= {10,0,8,3,5};
			
			int r=a[0]/a[1];
			System.out.println(r);
			System.out.println(a[10]);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {   //A Try block can have multiple catch block.
			System.out.println(e);
		}
	}

}
