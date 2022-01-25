package StaticAndFinal;

//Static members belongs to a class and they can be shared by all the objects of the class and all the objects have their own non-static members.

class HondaCity{
	static long price=50; //The “price=50” is the meta data of the class HondaCity.
	int a,b;
	
	 // we cannot use this or Super keyword in static .
	static double onRoadPrice(String city) {
		switch (city) {
		case "delhi" :
			return price+price*0.1;
		case "mumbai" :
			return price+price*0.09;
		}
		return 0;
	}
}


public class StaticTest {

	public static void main(String[] args) {
	
		System.out.println(HondaCity.price); //Static members can be accessed just by using class name.
		
		HondaCity h1=new HondaCity();
		HondaCity h2=new HondaCity();

		System.out.println("H1 price "+h1.price+" H2 price "+h2.price); //All the object can use the static variable as a shared data.
		HondaCity.price=100;
		System.out.println("After changing H1 price "+h1.price+" H2 price "+h2.price); //h1 and h2 shared the data of price.
		
		double p=h1.onRoadPrice("delhi");
		System.out.println("Price in delhi "+p);
	}

}
