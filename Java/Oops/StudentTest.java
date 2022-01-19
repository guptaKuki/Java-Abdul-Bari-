package Oops;
import java.util.Scanner;

class Student{
	
	public int roll;
	public String name;
	public String course;
	public int m1,m2,m3;
	
	public int total() {
		return m1+m2+m3;
	}
	public float average() {
		return total()/3;
	}
	
	public char grade() {
		if(average() > 70.0) 
			return 'A';
		else
			return 'B';
	}
}

public class StudentTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student st=new Student();
		st.roll=s.nextInt();
		st.name=s.next();
		st.course=s.next();
		st.m1=s.nextInt();
		st.m2=s.nextInt();
		st.m3=s.nextInt();
		
		System.out.println(st.roll +" "+st.name+" "+st.course);
		System.out.println("Total Marks :"+st.total());
		System.out.println("Average Marks :"+st.average());
		System.out.println("Grade :"+st.grade());

	}

}
