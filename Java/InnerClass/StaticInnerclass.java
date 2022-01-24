package InnerClass;

// An inner class can also be Static which means that we can access it without creating an object of outer class.
class OuterClass{
	int x=10;
	static int y=15;
	
	static class InnerClass{
		void display() {
			System.out.println("Static inner class");
			System.out.println(y);
			//System.out.println(x);
			// It cannot access non-static data members and methods. It can be accessed by outer class name.
		}
	}
}
public class StaticInnerclass {

	public static void main(String[] args) {
		OuterClass.InnerClass p = new OuterClass.InnerClass();// here we can directly create inner class object.
		p.display();

	}

}
