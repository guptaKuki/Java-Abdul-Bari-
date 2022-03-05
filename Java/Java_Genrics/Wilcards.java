package Java_Genrics;

public class Wilcards {
	
	static void fun(MyArray<?> obj) {
		// <?> means we can pass any type if object means no bound
		obj.display();
	}
	// UPPER BOUND
	// static void fun(MyArray< ? super Numbers> obj){

	public static void main(String[] args) {
		
		MyArray<String> ma1= new MyArray<>();
		ma1.append("kuki");
		ma1.append("Nidhi");

		
		MyArray<Integer> ma2= new MyArray<>();
		ma2.append(52);
		ma2.append(15);
		
		fun(ma1);
		fun(ma2);
	}

}
