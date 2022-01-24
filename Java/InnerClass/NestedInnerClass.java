package InnerClass;

class Outer{
	int x=10;
	
	class Inner{
		int y=20;
		void innnerDisplay() {
			System.out.println("x: "+x +"y :"+y);
		}
	}
	
	void outerDisplay() {
	System.out.println("Outer Class");
	
		Inner i=new Inner();
		i.innnerDisplay();
		System.out.println(i.y);
	}
}
public class NestedInnerClass {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.outerDisplay();
		
		Outer.Inner p=new Outer().new Inner();
		System.out.println(p.y);
	}

}
