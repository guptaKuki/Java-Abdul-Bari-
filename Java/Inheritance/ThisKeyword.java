package Inheritance;

class Student{
	String name;
	int rollNo;
	
	Student(String name,int roll){
		this.name=name;
		this.rollNo=roll;
	}
	
	void display() {
		System.out.println("Name of student :"+this.name);
		System.out.println("Roll number :"+this.rollNo);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		Student s1=new Student("Kuki" , 82);
		Student s2=new Student("Mahenoor" , 102);
		
		s1.display();
		s2.display();
	}

}
