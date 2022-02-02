package LambdaExpression;

//Lambda expressions are used for de1ining anonymous expressions or nameless methods or functions.//

@FunctionalInterface
interface MyLambda{   //Lambda expressions are de1ined with the help of interfaces.
	public void display();
}

/*
 class My implements MyLambda{
	public void display() {
		System.out.println("Hello World");
	}
} 
*/

public class LambdaMethod {

	public static void main(String[] args) {
	
		MyLambda m=()->{System.out.println("Hello World");};
		//The lambda expression is ‘->’.
		
		m.display();

	}

}
