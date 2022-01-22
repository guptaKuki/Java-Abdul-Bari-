package AbstractClass;


abstract class Super{
	 Super(){
		System.out.println("Super Class");
	}
	 
	 public void method1() {
		 System.out.println("Super method1");
	 }
	 
	 abstract void method2();
}

class Sub extends Super{
	void method2() {
		System.out.println("Sub method2");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		 
		Super s1=new Sub();
		Sub s2=new Sub();
		s1.method1();
		s2.method2();
	}

}

//Object of an Abstract class cannot be created but object of Concrete class can be created.
// Reference of abstract class is allowed.

//If any other class inherits abstract class then that class also becomes abstract class but to become a concrete class....
//.....the subclass must override the undefined method.