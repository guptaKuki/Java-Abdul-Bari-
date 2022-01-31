package JavaLangClasses;

public class MathClasses {

	public static void main(String[] args) {
	  
		System.out.println(Math.abs(-123)); // Gives Absolute value
		
		System.out.println(StrictMath.abs(-123)); // More precise results and compromises with speed and it is slow.
		
		System.out.println(Math.cbrt(27.0));//Gives CubeRoot
		
		//System.out.println(Math.decrementExact(7)); //Decrement by 1 and gives 6
		
		//System.out.println(Math.decrementExact(Integer.MIN_VALUE));//but for this  this we will get exception and will not give maximum value.

		int i=Integer.MIN_VALUE;
		i--;
		System.out.println(i); //If we print after decrement we will get maximum value of integer (underflow condition).
		
		System.out.println(Math.getExponent(123.45)); //Gives Exponent
		
		System.out.println(Math.toRadians(90));// Gives Radian value
		
		System.out.println(Math.floorDiv(50, 9));//Gives floor value (means only integer)
		
		System.out.println(Math.exp(1));// e^1
		System.out.println(StrictMath.exp(1));
		
		System.out.println(Math.log10(100));// Gives log10(100)=2
		System.out.println(Math.log(100));// log(e)
		
		System.out.println(Math.max(50, 65));//Gives Maximum value
		
		System.out.println(Math.tan(45*Math.PI/180)); //Gives radian
		
		System.out.println(Math.toDegrees(Math.atan(1))); // gives degree
		
		System.out.println(Math.random());//gives random number between 0 and 1

        System.out.println(Math.pow(2, 3));

        System.out.println(Math.nextAfter(12.5, 13));//gives next float number after 12 towards 13
        System.out.println(Math.nextAfter(12, 11)); 
	}

}
