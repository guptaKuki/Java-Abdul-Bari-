package Inheritance;

class Account{
	private String accountNo;
	private String holderName;
	private String dob;
	private double balance;
	
	 public Account(String an,String hn,String d) {
		 accountNo=an;
		 holderName=hn;
		 dob=d;
	 }
	 
	 public String getAccountNo() {
		 return accountNo;
	 }
	 
	 public String getHolderName() {
		 return holderName;
	 }
	 
	 public double getbalance() {
		 return balance;
	 }
	 public void setbalance(double b) {
		 balance=b;
	 }
}

class SavingAccount extends Account {
	public SavingAccount(String an, String hn, String d) {
		super(an, hn, d);	
	}

	private double deposit;
	private double withdraw;
	public void setAmount(double depo) {
		deposit =depo;
	}
	
	public void setWithdraw(double wd) {
		withdraw=wd;
	}
	public double deposit() {
		return deposit;
	}
	public double withdraw() {
		return getbalance()-withdraw;
	}
}

public class AccountTest {

	public static void main(String[] args) {
		
	 SavingAccount s=new SavingAccount("283109000352" , "Kuki" , "01/04/2000");
	}

}
