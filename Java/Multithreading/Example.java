package Multithreading;


class ATM{

	synchronized public void checkBalance(String name) {
		System.out.print(name+ " Checking");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
			System.out.println(" Balance ");
		
	}
	
	synchronized public void Withdraw(String name,int amount) {
		System.out.print(name+" withdrawing ");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
			System.out.println(amount);
	}
}

class Customer extends Thread{
	String name;
	int amount;
	ATM atm;
	
	Customer(String str ,int rupees,ATM at){
		name=str;
		amount=rupees;
		atm=at;
	}
	
	public void useATM() {
		atm.checkBalance(name);
		atm.Withdraw(name, amount);
	}
	public void run() {
		useATM();
	}
}
public class Example {

	public static void main(String[] args) {
		ATM a=new ATM();
		Customer c1=new Customer("Kuki" , 5000 ,a);
		Customer c2 =new Customer("Nidhi" , 10000 ,a);
		c1.start();
		c2.start();

	}

}
