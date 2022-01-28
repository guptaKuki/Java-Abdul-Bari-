package ExceptionHandling;

class NegativeDimensionException extends Exception{
	public String toString(){
		return "Negative dimension is not allowed.";
	}
}
public class DefiningOwnException {
	//throws is used for declaring that a method may throw exception
	static void areaMethod(int l,int b) throws NegativeDimensionException {
		int area=l*b;
		System.out.println(area);
	}

	public static void main(String[] args) {
		try {
		areaMethod(-7,-9);
		}catch(NegativeDimensionException e) {
			System.out.println(e);
		}
	}

}
