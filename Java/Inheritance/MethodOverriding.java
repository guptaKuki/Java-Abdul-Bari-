package Inheritance;

class Super{
	public void display() {
		System.out.println("Super class display");
	}
}

class SubClass extends Super{
	
	//Method Override
	//Redefining the method of super class in the sub class.
	public void display() {
		System.out.println("Sub class display");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Super sup=new Super();
		SubClass sub=new SubClass();
		
		sup.display();
		sub.display();
		
		//Dynamic Method Dispatch
		//Whhen a super class reference holding an object of sub class and override method is called then
		// the method of oject will be called not the methd of refernce
		Super s=new SubClass();
		s.display();
	}

}


//Signature must be same in method overriding.
//If the method name is different the method is not overridden but it is overloaded.
//Argument may be different but the parameter must be same.
//Return type must be same, if it is not same then the method is neither overridden nor overloaded.
//Final and static methods cannot be overridden.
//Method can be overridden with same or lenient (public, protected) access specifiers but the stricter(private) access speciPiers cannot be used in sub class.



