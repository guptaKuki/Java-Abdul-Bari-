package Interface;

//interfaces are used for call back method in java.
interface Member{
	void callBack();
}

class Store {
	Member mem[]= new Member[20]; 
	int count=0;
	void print() {
	for(int j=0;j<mem.length ;j++) {
		System.out.println(mem[j]);
	}
	}
	//whenever a Customer  is taking a membership count will incremented.
	void register(Member m) {
		mem[count++]=m;
	}
	
	void inviteSale() {
		for( int i=0;i<count;i++) {
			mem[i].callBack();
		}
	}
}

// A member is a who gets a notification of every sale. 
class Customer implements Member{
	String name;
	Customer(String n){
		name=n;
	}
	public void callBack() {
		System.out.println("Ok,I'll visit. "+name);
	}
}

public class Example3 {

	public static void main(String[] args) {
		Customer c1=new Customer("Akashat"); //Customer is created
		
		Customer c2= new Customer("Rimjhim");
		
		Store s=new Store();
	
		s.register(c1); // Registration of customer 1.
		s.register(c2);
		s.inviteSale(); // invite the member for a sale.
		s.print();
	}

}
