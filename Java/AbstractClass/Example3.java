package AbstractClass;

abstract class KFC{
	public void kfcMenu() {
		System.out.println("1. Grilled Chicken");
		System.out.println("2. Chicken Nugetts");
		System.out.println("3. Chicken Peri-peri");
	}
	abstract void billing();
	abstract void offers();	
}

class MYKFC extends KFC{
	MYKFC(){
		System.out.println("KFC Biharsharif");
	}
	
	void billing() {
		System.out.println("Your total amount :");
	}
	void offers() {
		System.out.println("20% off Festive Offers.");
	}
}
public class Example3 {

	public static void main(String[] args) {
	KFC k=new MYKFC();
	k.kfcMenu();
	k.offers();
	k.billing();
	}

}
