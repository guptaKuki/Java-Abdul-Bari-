package Oops;

class Rectangle{
	
	public int length;
	public int breadth;
	
	public int area() {
		return length*breadth;
	}
	
	public int perimeter() {
		return 2*(length+breadth);
	}
	
	public boolean isSquare(int length,int breadth) {
		if(length == breadth) {
			return true;
		}else {
			return false;
		}
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		 
		Rectangle r=new Rectangle();
		
		r.length=5;
		r.breadth =5;
		 System.out.println("Area :"+r.area());
		 System.out.println("Perimeter :"+r.perimeter());
		 System.out.println("Square :"+r.isSquare(r.length,r.breadth));
	}

}
