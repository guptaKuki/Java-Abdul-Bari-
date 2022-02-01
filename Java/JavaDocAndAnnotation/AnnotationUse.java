package JavaDocAndAnnotation;

class Parent{
	public void display() {}
}
	
class Child extends Parent{
	@Override // To show that this method is override and to avoid mistake.
	//It informs the compiler that the element is meant to over ride an element declared in a superclass.
	public void display() { }
}
	
class OldClass{
	
	public void show() {
		System.out.println("Hello");
	}
	
	@Deprecated  //It indicates that the marked element is deprecated and should no longer be used.
	public void print() {
		System.out.println("Good Morning");
	}
}

//Generic mthod which are not safe
class My<T>{
	@SafeVarargs
	/*When it is applied to a method or a constructor, it asserts that the code does not perform potentially unsafe operations on its varargs parameter.*/
	private void show(T...args) { // In generic, methods must be private or Final method
		for(T x:args) {
		System.out.println(x);
		}
	}
}

@FunctionalInterface
interface Wel{   //If a interface having single method then it is called Functional Interface.
	public void print();
}

public class AnnotationUse {

	@SuppressWarnings("Deprecation") //It tells the compiler to suppress specific warnings that it would otherwise generate.
	public static void main(String[] args) {
		OldClass oc=new OldClass();
		oc.print();

	}

}
