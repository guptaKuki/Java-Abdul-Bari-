package JavaLangClasses;
import java.lang.* ; // Imported during every java project
//Object class is parent class for all the classes in java.
public class ObjectClasses {

	public static void main(String[] args) {
		Object o1=new Object();
		System.out.println(o1.toString());  // If we just call object name then it will call toString() in print function.
		
		Object o2=new Object();
		System.out.println(o1.equals(o2)); //whether it will hold the same object or not.
		Object o3=o1;
		System.out.println(o3.equals(o1)); //It will return true if both are holding same object.
		
		System.out.println(o1.hashCode()); //Given using the internal address of an object, unique for all objects
		
		MyObject k=new MyObject();
		k.hashCode();
		MyObject2 k1=new MyObject2();
	
	}

}
// To Override Object Methods
class MyObject{  //This class extends Object class by default. We can call all the object method by creating MyObject class object.
	
	public String toString() {
		return "MyObject" ;
	}
	public int hashCode() {  //By this Override method we set hash value 100 for every object.
		return 100;
	}
	
	public boolean equals(Object o) {  //now two object will compare on their hashCode
		return this.hashCode() == o.hashCode() ;
	}
	/*public void wait()   
	 These methods cannot be overridden because they are final method.
	public void notify()*/
}

class MyObject2 extends MyObject{
	//Though it is extending only from MyObject class as MyObject class is by default extends from Object it will also extend from Object
    //All classes directly or indirectly extends from Object class
}