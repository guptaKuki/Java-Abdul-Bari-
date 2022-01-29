package Multithreading;

//Thread class contains the actual mechanism for Multithreading.

class MyThread extends Thread{
	//Override the run() method
	public void run() {
		//Run is the starting point of a program for multithreading.
		int i=1;
		while(true) {
			System.out.println(i+" Hello");
			i++;
		}
	}
}

public class UsingThreadClass {

	public static void main(String[] args) {
		MyThread m=new MyThread(); //the object of thread class is created in the main method.
		m.start();  //The start method call the thread class and runs the method which is a built in method of thread class.
		
		int i=1;
		while(true) {
			System.out.println(i+" World");
			i++;
		}

	}

}
 /* we can also extend the thread class in UsingThreadClass and the same code written in MyThraed.
this will work same the above code works. */