package Java_Genrics;

public class GenericMethod {

	// For methods we need to define it just before the return type .
	static <E> void show(E[] list) {
		for(E x:list) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		
		GenericMethod.show(new String[] {"hi","hello","morning"});
		
		GenericMethod.show(new Integer[] {4,5,10,6});
		
		
	
		
	}

}
