package JavaLangClasses;

//It is used to define our own data types or to de:ine an enumerated data type.

//Enums are de:ined just like classes.
//Enum will be directly inherited by the enum object in the lang  package.

enum Dept{
	CS( "Nidhi","Block A"),IT("Akash","Block B"),ECE("Kuki","Block C"),AEIE("Jyoti","BlockD");
	//If we define values in CS,IT then we must pass parameter in constructor
	//As they are final we should write in upper case
	
	//Enum can also have constructor but it must be type of Private or Default.
	 String head;
	 String location;
	private Dept(String head,String loc) {
		//System.out.println(this.name());
		this.head=head;
		this.location=loc;
		
	}
	
	public String getHead() {
		return head;
	}
	
	public String getLocation() {
		return location;
	}
	public void display() {
		System.out.println(this.name()+" "+this.ordinal());
	}
}
public class EnumClass {

	public static void main(String[] args) {
	
		Dept d=Dept.CS; //we can only those values which are in enum department.
		Dept c= Dept.ECE;
		
		System.out.println(d.ordinal()+" "+c.ordinal()); //Ordinal 9ives us index value . index value given as they are initialize

		Dept list[]=Dept.values(); //All the Dept value store in list array of type Dept
		for(Dept x:list)
			System.out.print(x+" ");
		System.out.println();
		
		
		
		Dept p=Dept.ECE;
		System.out.println(p.getHead());
		System.out.println(p.getLocation());
		
		p.display();
		//enum are widely use in switch case
		/*switch(p){
			case CS:
				System.out.println("Head: Nidhi \nBlock:A");
				break;
			case IT:
				System.out.println("Head: Akash \nBlock:B");
				break;
			case ECE:
				System.out.println("Head: Kuki \nBlock:C");
				break;
			case AEIE:
				System.out.println("Head: Jyoti \nBlock:D");
				break;
				}
		*/
			
		
	}

}
