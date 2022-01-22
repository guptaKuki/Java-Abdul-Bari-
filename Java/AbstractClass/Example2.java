package AbstractClass;

abstract class Hospital{
	abstract void emergency();
	
	abstract void appointment();
	
	abstract void admit();
	
	abstract void billing();
}

class MyHospital extends Hospital{
	MyHospital(){
		System.out.println("City Hospital");
	}
	
	void emergency() {
		System.out.println("Emergency is Available 24 x 7");
	}
	void appointment() {
		System.out.println("You can take appointment From Monday to Saturday");
	}
	void admit() {
		System.out.println("Please fill your admit prodecure");
	}
	void billing() {
		System.out.println("Your total amount:");
	}
}
public class Example2 {

	public static void main(String[] args) {
		Hospital h= new MyHospital();
		h.appointment();
		h.admit();
		h.billing();
	}

}
