package Java_Genrics;

class Data<T>{
	
	private T data;
	public T getData() {
		return data;
	}
	
	public void setData(T d) {
		data=d;
	}
}

public class Example_1 {

	public static void main(String[] args) {
		
		Data<Integer> d= new Data<Integer>();
		
		d.setData(10);
		System.out.println(d.getData());
	}

}
