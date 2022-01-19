package Oops;

class Product{
	 
	private  String item_no;
	public String name;
	private int price;
	private int quantity;
	
	//constructor
	public Product(String str, String n) {
		item_no=str;
		name=n;
	}
	
	//property methods
	public String getItem_no() {
		return item_no;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int q) {
		quantity=q;
	}
	public void setprice(int p) {
		price =p;
	}
}

class Customer{
	private String custId;
	private String name;
	private String address;
	private String phoneNo;
	
	//constructor
	public Customer(String customer ,String tag) {
		custId=customer;
		name=tag;
	}
	
	//property methods
	public String getcustId() {
		return custId;
	}
	public String getname() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getphone() {
		return phoneNo;
	}
	
	public void setphone(String pNo) {
		phoneNo=pNo;
	}
	public void setAddress( String add) {
		address=add;
	}
}
public class ProductCustomer {

	public static void main(String[] args) {
		 
		Customer cus=new Customer("A84H36" , "Pepsi");
		cus.setphone("983541189");
		
		System.out.println(cus.getname());
		System.out.println(cus.getcustId());
		System.out.println(cus.getphone());
		Product pro =new Product("A84H36","pepsi");
		System.out.println(pro.getItem_no()+" "+pro.name);

	}

}
