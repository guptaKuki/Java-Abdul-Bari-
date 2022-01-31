package JavaLangClasses;

import java.lang.reflect.*;  //Java have a package called java.lang.re:lect which have different set of classes.
class My{
	private int a;
	protected int b;
	public int c;
	int d;
	
	public My() {};
	
	public My(int x,int y) {}
	
	public void display(String s ,String t) {}
	
	public int show(int x,int y) {return 0;}
	
}

//The set of classes that are there in reflection package will help us get the information or the definition about the class.
public class ReflectionPackageUse {

	public static void main(String[] args) {
		Class c =My.class; // To get information about class
		
		//Alternative way
		 My m=new My();
		 Class a=m.getClass();
		 
		 System.out.println(c.getName()); // It gives Package +Class name
		 
		 Field field[]= c.getDeclaredFields(); //give all the fields in c into an array
		 
		 for(Field f:field) {
			 System.out.println(f);
		 }
		 
		 Constructor con[]= c.getConstructors(); //to get all the constructors of a class
		 for(Constructor ct:con) {
			 System.out.println(ct);
		 }
		 
		 Method meth[]=c.getMethods(); //give local class methods and also the methods of parent classes
		 for(Method me:meth) {
			 System.out.println(me);
		 }
				 

	}

}
