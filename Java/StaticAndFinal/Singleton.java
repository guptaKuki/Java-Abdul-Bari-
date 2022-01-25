package StaticAndFinal;

class CoffeMachine{
	private float coffeqty;
	private float milkqty;
	private float sugarqty;
	private float waterqty;
	
	static private CoffeMachine our=null;
	 private CoffeMachine() {
		 coffeqty=1;
		 milkqty=1;
		 sugarqty=2;
		 waterqty=1;
	 }
	 
	 static public CoffeMachine getInstance() {
		 if(our== null) {
			 our=new CoffeMachine();
		 }
		 return our;
	 }
}
public class Singleton {

	public static void main(String[] args) {
		
		CoffeMachine m1=CoffeMachine.getInstance();
		CoffeMachine m2= CoffeMachine.getInstance();
		CoffeMachine m3= CoffeMachine.getInstance();		
	
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		if( m1 == m2 && m2==m3) {
			System.out.println("same");
		}
	}
	

}
