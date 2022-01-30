package Multithreading;

class Mydata{
	int value=0;
	boolean flag=true;
	
	synchronized public void set(int v) {
		while(flag != true) { 
			try {
			wait();}
		catch(Exception e) {};
		}
		value =v;
		flag=false;
		notify();	
	}
	
	synchronized public int get() {
		int x=0;
		while(flag != false) {
			try {
			wait();}
		catch(Exception e) {};	
		}
		x=value;
		flag=true;
		notify();
		return x;
	}
}

class Producer extends Thread{
	Mydata d;
	public Producer(Mydata data){
		d=data;
	}
	public void  run() {
		int i=1;
		while(true) {
			d.set(i);
			System.out.println("Producer "+i);
			i++;
		}
	}
}

class Consumer extends Thread{
	Mydata d;
	public Consumer(Mydata data){
		d=data;
	}

	public void  run() {
		int val;
		while(true) {
			val=d.get();
			System.out.println("Consumer "+val);
	
		}
	}
}
public class InterThread {

	public static void main(String[] args) {
		Mydata m=new Mydata();
		Producer p=new Producer(m);
		Consumer c=new Consumer(m);
		
		p.start();
		c.start();
	}
}
