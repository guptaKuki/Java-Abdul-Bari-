package Multithreading;

/* Runnable class is not a thread. it is only capable of running but it cannot run by itself */
class Try implements Runnable{
	//Override
	//The class becomes abstract if it does not implements all the features of interface.
	public void run() {
		int i=1;
		while(i<=100) {
			System.out.println(i+ "Good");
			i++;
		}
			
	}
}
public class UsingRunnableInterface {

	public static void main(String[] args) {
		Try k= new Try();
		Thread t=new Thread(k);
		
		t.start();
		int j=1;
		while(j<=100) {
			System.out.println(j+" Day");
			j++; 
		}

	}

}
