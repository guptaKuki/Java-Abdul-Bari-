package Java_Genrics;

public class ArrayOfObject {

	public static void main(String[] args) {
		

		//aRRAY OF OBJECT
		
		Object o[]= new Object[3];
		
		o[0]="hi";
		o[1]="Bye";
		o[2]=new Integer(10);
		
		String str1;
		for( int i=0;i<3;i++) {
			str1= (String)o[i];
			System.out.println(str1);
		}

	}

}
