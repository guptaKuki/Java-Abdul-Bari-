package StaticAndFinal;

final class SuperTest{
	public void show() {
		System.out.println("hello");
	}
}

//class SubTest extends SuperTest{ }  //Final Class cannot be extended or inherited.
	
class Animal{
	final void display() {
		System.out.println("Animal");
	}
}

class Hippo extends Animal{
	//public void display() {}    // Final method cannot be override.
}


public class FinalDemo {
	final int A=10;  //As a member of a class we need initialize and declare at same time.
	
	final int B; //using instance block we can initialize later.
	{              // we can initialize in a instance block.
		B=9;
	}
	
	static final int F; //Final variable can initialize inside a static block. 
	static {
		F=2;
	}
	 
	final int H;
	FinalDemo(){
		H=5;
	}
	
	public static void main(String[] args) {
	
		final int K; 
		K=10;  // We can initialize afterward declaration.
		
	}

}
