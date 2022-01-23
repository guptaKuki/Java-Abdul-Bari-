package Interface;

interface Copy{
	//IdentiAiers are by default final and static.
	final int X=5; //IdentiAiers can be used in interfaces but the identiAiers must be given in Upper cases.
	public abstract void meth1(); //By default, methods are Public and Abstract.
	public abstract void meth2();
	
	default void meth3() {
		System.out.println("meth3 of class Test");
	}
	
	private void meth5() {
		System.out.println("meth5");
	}
	default void meth6() {
		meth5();
	}
}

//An interface can be extended from another interface.
interface Copy2 extends Copy{
	void meth4();
}

class My implements Copy2{
	public void meth1() { }
	public void meth2() {}

	public void meth4() { }
}

public class Practice {

	public static void main(String[] args) {
		My m=new My();
		m.meth1();
		m.meth3();
		
		m.meth6();

		System.out.println(Copy.X); //Static members can be accessed in main method by using interface name and dot operator.
	}
}
