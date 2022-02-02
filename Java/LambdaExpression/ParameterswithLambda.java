package LambdaExpression;

@FunctionalInterface
interface Expression{
	public int add(int a,int b); //A method can take multiple parameters.
	// public void display(String s);
	}
public class ParameterswithLambda {

	public static void main(String[] args) {
		
//		Expression e= (a,b)->{return a+b;};
//		System.out.println(e.add(30, 40));
		
		Expression e= (a,b)-> a+b;  //The lambda expressions may have either no parameters or one or multiple parameter
		int r=e.add(50, 10);
		System.out.println(r);

	}

}
