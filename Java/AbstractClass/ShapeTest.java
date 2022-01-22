package AbstractClass;

abstract class Shape{
	Shape(){
		System.out.println("Shape ");
	}
	abstract void area();
	abstract void perimeter();
}

class Circle extends Shape{
	public double radius;
	
	Circle(double r){
		radius =r;
		}
	public void area() {
		System.out.println( "Area :"+Math.PI*radius*radius);
	}
	public void perimeter() {
		System.out.println("Perimeter :"+2*Math.PI*radius);
	}
}

class Rectangle extends Shape{
	public int length;
	public int breadth;
	
	Rectangle( int l, int b){
		
		length=l;
		breadth=b;
	}
	
	public void area() {
		System.out.println("Area :"+length*breadth);
	}
	public void perimeter() {
		System.out.println("Perimeter :"+2*(length+breadth));
	}
}


public class ShapeTest {

	public static void main(String[] args) {
		Shape c=new Circle(5.0);
		c.area();
		c.perimeter();
		Shape r=new Rectangle(4,8);
		r.area();
		r.perimeter();

	}

}
