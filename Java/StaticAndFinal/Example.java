package StaticAndFinal;


class ExampleTest{  //Only inner Class can Make Static .
	static int x=10;
	int y=20;
	
	void Show() {
		System.out.println(x+" "+y);
	}
	
	static void display() {
		System.out.println(x);  //Static methods can access only static members.
	}
}
public class Example {

	public static void main(String[] args) {
		ExampleTest t1=new ExampleTest();
		t1.Show();
		t1.x=25;
		t1.y=45;
		
		ExampleTest t2=new ExampleTest();
		t2.Show();
	}

}
