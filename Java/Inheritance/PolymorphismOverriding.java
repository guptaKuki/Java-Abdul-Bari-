package Inheritance;

class Cellphone{
	
	public void print() {
		System.out.println("Cellphone");
	}
}

class SmartPhone extends Cellphone{

	//override
	public void print() {
		System.out.println("SmartPhone");
	}
	public void inherit() {
		System.out.println("Inherited from Cellphone.");
	}
}
public class PolymorphismOverriding {

	public static void main(String[] args) {
		
		Cellphone c=new Cellphone();
		c.print();
		
		SmartPhone s=new SmartPhone();
		s.print();
		s.inherit();
		
		Cellphone cs=new SmartPhone();
		cs.print();
	}

}

//Method calls are different in overriding it depends on object.
//Method overriding is used for runtime polymorphism and method overloading is used for compile time polymorphism.