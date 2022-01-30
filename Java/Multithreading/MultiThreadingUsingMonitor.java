package Multithreading;

 /*synchronize method prints the data separately from both
thread in other words it prevents the data to be overlapped.*/

class MyData{
	/*The other method for synchronization is to write the synchronize at the signature method of the 
	display class so the whole method is being synchronized.*/
	
	// synchronized void display(String str)
	
	void display(String str) {
		synchronized(this) {  //the synchronize method is used to execute the classes separately.
		for( int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		}
	}
}

class Thread1 extends Thread{
	MyData d;
	Thread1(MyData data){
		d=data;
	}
	public void run() {
		d.display("HELLO WORLD"); //The classes Mythread1 access the data from the display class which is the shared object.
	}
}

class Thread2 extends Thread{
	MyData d;
	Thread2(MyData data2){
		d=data2;
	}
	public void run() {
		d.display("WELCOME"); //The classes Mythread2 access the data from the display class which is the shared object.
	}
}
public class MultiThreadingUsingMonitor {

	public static void main(String[] args) {
		MyData D=new MyData();
		Thread1 t1 =new Thread1(D);
		Thread2 t2 =new Thread2(D);
		t1.start();
		t2.start();
	}

}
