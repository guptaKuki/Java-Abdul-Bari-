package JavaLangClasses;



/*Wrapper class hierarchy=>
 * Object:
 *      =>Number:
 *              =>Byte
 *              =>Short
 *              =>Integer
 *              =>long
 *              =>Float
 *              =>Double
 *      =>Character
 *      =>Boolean    
 */


public class WrapperClasses {

	public static void main(String[] args) {
	 /*Primitive data Type are build in data type  and they are not object
	  int i=10;   where i is just a  normal variable
		*/
		
		Integer i=new Integer(10);  //The Constructor is Deprecated method
		
		Integer a= Integer.valueOf(5);
		 Integer b=6;
		 
		 Byte c=15;
		 Byte d=Byte.valueOf("15");
		 //Byte bb=18;
		// Byte e=Byte.valueOf(bb);
		 
		 Short f=Short.valueOf("123");
		 
		 float g=12.3f;
		// Float h=Float.valueOf("123.4");
		 
		 Double j=Double.valueOf(123.45);
		 Character k=Character.valueOf('A');
		 Boolean l=Boolean.valueOf("True");
		 
		 
		 Byte bb=18;  //This is a primitive data type
		 Byte e=Byte.valueOf(bb); //d is a wrapper to the primitive bb type and convert it o an object ,This is called boxing.
		 
		 Float h=Float.valueOf("123.4");
		 Float x=h.floatValue(); // It convert object to primitive ,called unboxing.
		 float y=h; // This will call automatically floatvalue(). ,called Auto unboxing.
		 
		 int p=10;
		 Integer q=Integer.valueOf(p);// Boxing
		 Integer n=p; //Auto Boxing
		 
		 int s=q;//Auto unboxing
		 int v=q.intValue(); //unboxing		 
	}

}
