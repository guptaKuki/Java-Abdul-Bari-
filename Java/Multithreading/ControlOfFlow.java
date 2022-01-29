package Multithreading;

/*The program is example explaining that the main method is the
only thread which controls the Flow of the program.*/

public class ControlOfFlow {

	//third method which Is executed is the display method.
	public static void display() {
			System.out.print("Hello");
	}
	
	//Entry point of the program is main method which executes at First.
	public static void main(String[] args) {
		
		display();//second method which executes is the calling method.
		System.out.println(" World");

	}

}
