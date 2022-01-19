package Oops;

class SetandGet{
	
	private int length;
	private int breadth;
	
	//constructor
	public SetandGet() {     //Default Constructor (no value is passes)
		length=1;
		breadth=1;
	}
	public SetandGet(int l ,int b) {  //parameterized constructor (we have pass some value)
		setLength(l);
		setBreadth(b);
	}
	
	
	//Getter and Setter methods to read and write the value of private variables
	public int getlength() {
		return length;
	}
	public int getbreadth() {
		return breadth;
	}
	public void setLength(int l) {
		if(l > 0)
			length=l;
		else 
			length =0;
	}
	public void setBreadth(int b) {
		if(b > 0)
			breadth=b;
		else
			breadth=0;
	}
	
	
	public int area() {
		return length*breadth;
	}
	
	public int perimeter() {
		return 2*length*breadth;
	}
	
	public boolean isSquare(int length,int breadth) {
		if(length == breadth) {
			return true;
		}else {
			return false;
		}
	}
}
public class DataHiding {

	public static void main(String[] args) {
		
		SetandGet r=new SetandGet();
		
		SetandGet r1=new SetandGet(5,5);
		
			r.setLength(5);
			r.setBreadth(10);
		//for object r	
		System.out.println("Length :"+r.getlength()+ " Breadth :"+r.getbreadth());
		 System.out.println("Area :"+r.area());
		 System.out.println("Perimeter :"+r.perimeter());
		 System.out.println("Square :"+r.isSquare(r.getlength(),r.getbreadth()));
		 
		 //for object r1
		 System.out.println("Length :"+r1.getlength()+ " Breadth :"+r1.getbreadth());
		 System.out.println("Area :"+r1.area());
		 System.out.println("Perimeter :"+r1.perimeter());
		 System.out.println("Square :"+r1.isSquare(r.getlength(),r1.getbreadth()));
	}
	
}
