package JavaLangClasses;

public class IntegerBoxingUnboxing {

	public static void main(String[] args) {
		int a=10;
		Integer b=a;
		System.out.println(b.equals(a));  // we can pass primitive data
		
//		Integer c=10;
//		System.out.println(c.equals(b));
		
		Integer v=Integer.valueOf("1010", 2); // (1010,2) means a string and its radix like here we give 2 means in a binary form.
		System.out.println(v);
		
		System.out.println(Integer.parseInt("1254")); // Convert string into integer.
	}

}
