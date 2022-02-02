package LambdaExpression;


@FunctionalInterface
interface Reference{
	public void display(String str);
}

interface Here{
	public int display(String s1 , String s2);
}

//Method referencing is more like polymorphism.
public class MethodReference {
	
	//Constructor
//	public MethodReference(String k) {
//		System.out.println(k.toUpperCase());
//		
//	}

	public static void reverse(String s) {
		StringBuffer sb=new StringBuffer(s);	
		sb.reverse();
		System.out.println(sb);
	}
	
	public void convert(String s) {
		System.out.println(s.toUpperCase());
	}
	
	
	public static void main(String[] args) {
		
		Reference ref= System.out::println; //‘: :’ is used for method reference.
		ref.display("Have a nice day !");
		
		Reference r= MethodReference::reverse;
		
		r.display("P R O G R A M M I N G");
		 //Any method can be called or referred to by the functional interface with a single method.
		MethodReference m=new MethodReference();
		Reference f=m::convert;
		f.display("gupta");
		
		//Reference g=MethodReference::new; //Constructor of any class can be assigned as method reference.
		
		Here h=String::compareTo;
		System.out.println(h.display("Zell", "Well"));
	}

}
