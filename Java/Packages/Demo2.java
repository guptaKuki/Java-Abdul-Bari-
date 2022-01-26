package Packages;
//import Packages.Demo;
public class Demo2 {

	public void display() {
		System.out.println("Welcome to Demo2");
	}
	
	public static void main(String []agrs) {
		Demo2 d=new Demo2();
		d.display();
		Demo d1= new Demo();
		d1.show();
	/*	System.out.println(d1.a+d1.b+d1.c+d1.d); 
	  Here the error show demo.c is not visible.
	  Because c is private and in same package-sub class private access modifier is not accessible.
	 */
		
	}
}
