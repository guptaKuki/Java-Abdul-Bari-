package Packages.Access1;

/*Access Modifiers:
 1. public: Can be accessed everywhere
 2. private: Can be accessed inside the class only
 3. default: Can be accessed only inside the same package
 4. protected: Can be accessed everywhere inside the same package, but only in the sub-class in different package 
 */

public class Project1 {
	
	public int p=10;
	
	private void display() {
		System.out.println("Welcome to display");
	}
	
	public void show() {
		System.out.println("Welcome to the show");
	}
	
	void create() {
		System.out.println("Create something");
	}

	public static void main(String[] args) {
	
		Project1 a=new Project1();
		System.out.println(a.p);
		a.display(); //we can access this because it is in same class.
		a.show();

	}

}
