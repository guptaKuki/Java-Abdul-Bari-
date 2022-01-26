package Packages.Access2;

import Packages.Access1.*;

public class QP {

	public static void main(String[] args) {
		Project1 p2=new Project1();     // Different package non sub class can only access public modifier.
		p2.show();
	}

}

class QP2 extends Project1{  // Different package Subclass can access only public and protected modifiers.
	
}
