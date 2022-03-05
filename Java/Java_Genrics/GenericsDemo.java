package Java_Genrics;

public class GenericsDemo {

	public static void main(String[] args) {
		//If you have a reference of an object, you can assign the object of any type object of any class, string or integer
		Object obj = new String("Hello");
		
		obj= new Integer(20); //the object is not type string, it is of type integer
		
		String str= (String)obj; //It is giving incompatible types
		
		/* At this point, The compiler is not checking the type, but at runtime we're getting an error that integer cannot
be converted into string.*/ 
		
	}

}
