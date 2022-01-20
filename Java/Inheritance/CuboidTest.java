package Inheritance;

class Dimension{
	public int length;
	public int breadth;
	Dimension(){
		length=breadth=1;
	}
	
	Dimension( int l,int b){
		length=l;
		breadth=b;
	}
	
	public int area() {
		return length*breadth;
	}
}

class Cuboid extends Dimension{
	public int height;
	Cuboid(){
		height=1;
	}
	
	Cuboid(int l,int b,int h){
		super(l,b);
		height=h;
	}
	
	public int Volume() {
		return area()*height;
	}
}

public class CuboidTest {

	public static void main(String[] args) {
		Cuboid c=new Cuboid(5,4,10);
		System.out.println("Volume of cuboid :"+c.Volume());
	}
}
