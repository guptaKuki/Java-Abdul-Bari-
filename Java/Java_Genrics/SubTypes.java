package Java_Genrics;

class MyArray2 extends MyArray{
	/*If we don't mention any type then MyArray2 accepts object 
	if we define MyArray2 extends MyArray<String> it will accept only string*/
}

// To define a bond here
// we can only use extend to implement as well as extend.
class My<T extends Number>{
	int temp;
	// this will allow those classes which are originated from numbers
}

public class SubTypes {

	public static void main(String[] args) {
	
		My<Float> m= new My<>();

	}

}
