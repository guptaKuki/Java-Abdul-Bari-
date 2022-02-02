package LambdaExpression;

@FunctionalInterface
interface Capture{
	public void display();
}

class UseLambda{
	public void callLambda(Capture cap) {
		cap.display();
	}
}

class Demo{
	
	int count=10; //Instances variable may or may not be final
	
	public void method1() {
		final int temp=0;  //local variable of lambda Expression must be final or effectively final.
		
		Capture c=()->{     // Lambda expression is similar to inner class.
			int flag=5;  // Lambda expression can have local variable also.
			flag++;
			System.out.println("Hello World");
			System.out.println(temp+" "+ (++count));
		};
	
		c.display();
	
		UseLambda u=new UseLambda();
		u.callLambda(()-> {System.out.println("Have a nice day");});
		
	}
	
}


public class CaptureLambdaExpression {

	public static void main(String[] args) {
		 
		Demo d=new Demo();
		d.method1();

	}

}
