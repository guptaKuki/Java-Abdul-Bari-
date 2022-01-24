package InnerClass;

//Local Inner Classes are the inner classes that are defined inside a block. 
class Outside{
	public void display() {
		class Inside{
			void innerDisplay() {
				System.out.println("Hello");
			}
		}
		
		Inside in=new Inside();  //Local inner class cannot be invoked from outside the method.
		in.innerDisplay();
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		Outside o=new Outside();
		o.display();
		

	}

}
//Local Inner classes are not a member of any enclosing classes. 
//They belong to the block they are defined within, due to which local inner classes cannot have any access modifiers associated with them