package Java_Genrics;

public class GenericArray<T>
{
	T data[] =  (T[]) new Object[3]; // It was used in old version of java that's why this is giving error.
		int length=0;	
	public static void main(String[] args) {
		
		/* we don't have to typecast when you are using those objects and at compile time only
		it will check that we are not storing anything invalid.*/
		GenericArray<String> ga = new GenericArray<>();  // here we initialize the data array type that it is a type of string
		ga.data[0]="Hi";
		ga.data[1]="Bye";
		
		//ga.data[2]=10; this will give error because we cannot save integer into string array
		//ga.data[2]=new Integer(10);
		ga.data[2]="Good";
		
		
		String str1;
		for( int i=0;i<3;i++) {
			str1= (String)ga.data[i];
			System.out.println(str1);
		}
		//String str= ga.data[0];

	}

}
