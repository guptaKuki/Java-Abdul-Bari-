package Inheritance;

class Find{
	
	public int max( int a ,int b) {
		return a>b?a:b ;
	}
	
	public int max( int a,int b, int c) {
		if( a>b && a>c)
			return a;
		else if(b>a && b>c) 
			return b;
		else
			return c;
	}
}

//In overloading number or type of argument will decides which method is to be called.

public class PolymorphismOverloading {

	public static void main(String[] args) {
	
		Find f=new Find();
		int maximum= f.max(10,5);
		System.out.println(maximum);
		
		int largest=f.max(6, 9, 15);
		System.out.println(largest);
	}

}

//Overloading is achieved in same class whereas overriding is achieved in inheritance.