package Inheritance;

class Parents{
	Parents(){
		System.out.println("Non-Parameterised Parent Constructor");
	}
	
	Parents(int x){
		System.out.println("Parameterised Parent Constructor "+x);
	}
}
class Children extends Parents{
	Children(){
		System.out.println("Non-Parameterised Children Constructor");
	}
	Children(int y){
		System.out.println("Parameterised Children Constructor "+y);
	}
	Children(int x,int y){
		super(x);
		System.out.println("Parameterised Children Constructor "+y);
	}
}
public class SuperConst {

	public static void main(String[] args) {
		Children ch=new Children(10,20);

	}

}
