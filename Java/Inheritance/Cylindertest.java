package Inheritance;

class Circle{
	private double radius;
	//set method
	public void setRadius(double r) {
		radius=r;
	}
	
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public double circumfrence() {
		return 2*Math.PI*radius;
	}
}

class Cylinder extends Circle{
	private double height;
	
	public void setHeight(double h) {
		height =h;
	}
	
	public double volume() {
		return area()*height;
	}
	
	public double surfaceArea() {
		return 2*area()+circumfrence()*height;
	}
}

public class Cylindertest {

	public static void main(String[] args) {
		
		Cylinder c= new Cylinder();
		c.setRadius(5.0);
		c.setHeight(6.0);
		
		System.out.println("volume :"+c.volume());
		System.out.println("Surafce Area :"+c.surfaceArea());
		System.out.println("Lid Area :"+c.area());
	}

}
