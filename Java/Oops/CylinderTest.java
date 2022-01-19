package Oops;

class Cylinder{
	
	public double radius;
	public double height;
	
	public double lidArea() {
		return  Math.PI*radius*radius;
	}
	
	public double circumference() {
		return 2*Math.PI*radius;
	}
	
	public double volume() {
		return lidArea()*height;
	}
	
	public double surfaceArea() {
		return circumference()*height + (2*lidArea());
	}
}

public class CylinderTest {

	public static void main(String[] args) {
		
		Cylinder c=new Cylinder();
		c.radius=5.0;
		c.height=4.0;
		
		System.out.println("Lid Area :"+c.lidArea());
		System.out.println("Volume of Cylinder :"+c.volume());
		System.out.println("Total Surface Area :"+c.surfaceArea());

	}

}
