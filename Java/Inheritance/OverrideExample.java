package Inheritance;

class TV{
	public void switchOn() {
		System.out.println("TV is Switched ON");
	}
	public void changeChannel() {
		System.out.println("TV is changing Channel");
	}
}

class SmartTV extends TV{
	//override
	public void switchOn() {
		System.out.println("Smart TV is Switched ON");
	}
	//override
	public void changeChannel() {
		System.out.println("Smart TV is changing Channel");
	}
	
	public void browse() {
		System.out.println("Smart TV browsing.");
	}
}
public class OverrideExample {

	public static void main(String[] args) {
		TV t=new TV();
		SmartTV st=new SmartTV();
		
		t.switchOn();
		t.changeChannel();
		System.out.println();
		st.switchOn();
		st.changeChannel();
		st.browse();
		System.out.println();
		
		TV k=new SmartTV();
		k.switchOn();
		k.changeChannel();
		//k.browse();
		
		// A Super Class Reference can hold the Object of Sub Class but it can call only those methods which are present in super class.
		// Super Class reference can have Object of Sub Class but a Sub Class reference cannot have Super Class Object..
		//example : SmartTV s=new TV();
	}

}
