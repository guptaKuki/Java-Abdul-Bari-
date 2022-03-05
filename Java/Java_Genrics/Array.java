package Java_Genrics;

class MyArray<T>{
	int length=0;
	
	@SuppressWarnings("unchecked")
	T A[]= (T[]) new Object[10];
	
	public void append(T n) {
		A[length++]=n;
	}
	
	public void display() {
		for(int i=0;i<length;i++) 
		  System.out.println(A[i]);
	}
}

public class Array {

	public static void main(String[] args) {
		
		MyArray<Integer> ma= new MyArray<>();
		
		// If we have generics class and we do not mention the type then it will take as object.
		// MyArray ma= new MyArray();
		ma.append(10);
		ma.append(20);
		ma.append(30);
		ma.display();

	}

}
