package Interface;

interface Test1{
	void method1();
	void method2();
}

class Test2 implements Test1{
	public void method1() {
		System.out.println("Method1 of Test2");
	}
	public void method2() {
		System.out.println("method2 of Test2");
	}
	public void method3() {
		System.out.println("Method3 of Test2");
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
	
		Test1 t= new Test2();
		t.method1();
		t.method2();
	   //t.method3();
		//When we make a object of interface class holding a object of implemented class then we can call only those methods which are present in interface class.
	}

}
