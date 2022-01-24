package InnerClass;

abstract class My{
	abstract void meth1();
}

class Outward{
	void meth2() {
		My m=new My() {
			public void meth1() {
				System.out.println("anonymous class");
			}
		};
		m.meth1();
	}
}
public class AnonymousClass {

	public static void main(String[] args) {
		Outward out=new Outward();
		out.meth2();

	}
}
// As My is abstract class.So, we cannot create the object of a abstract class.
// A class that has no name is known as an anonymous inner class in Java. It should be used if you have to override a method of class or interface.
