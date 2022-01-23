package Interface;

class Phone{
	public void call() {
		System.out.println("Please dail the number :");
	}
	void sms() {
		System.out.println("Text our meassage");
	}
}

interface ICamera{
	void capture();
	void record();
}
interface IMusicPlayer{
	void play();
	void pause();
}

class SmartPhone extends Phone implements ICamera , IMusicPlayer{
	public void capture() {
		System.out.println("Click on capture button to take a photo.");
	}
	public void record() {
		System.out.println("Long press the capture button to take a video.");
	}
	public void play() {
		System.out.println("play music.");
	}
	public void pause() {
		System.out.println("Pause the music.");
	}
	
}


public class Example2 {

	public static void main(String[] args) {
		
		SmartPhone s= new SmartPhone();
		s.call();
		s.sms();
		ICamera c=s; //Reference can be from interface class. (but not object)
		c.capture();
		c.record();
		IMusicPlayer m=s; //Reference from musicPlayer interface class
		m.play();
		m.pause();
		

	}

}
