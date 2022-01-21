package Inheritance;

class Department{
	String deptName;
	int totalStudent=120;
	String deptHead;
	
	Department(String deptName , String head){
		this.deptName=deptName;
		this.deptHead=head;
	}
}

class Section extends Department{
	String sectionName;
	int totalStudent=60;
	
	Section (String sn , String hn,String dn){
		super(dn,hn);
		sectionName=sn;
	}
	
	void display() {
		System.out.println("Department Name :"+deptName);
		System.out.println("Section Name :"+sectionName);
		System.out.println("Total number of student :"+super.totalStudent);
		System.out.println("Total student in this section :"+totalStudent);
	}
	
}
public class ThisSuper {

	public static void main(String[] args) {
		Section a=new Section("2","KSM Sir" , "ECE");
		a.display();
	}

}
