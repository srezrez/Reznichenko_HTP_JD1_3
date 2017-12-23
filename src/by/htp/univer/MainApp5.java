package by.htp.univer;

public class MainApp5 {

	public static void main(String[] args) {

		Student student = null; 
		student = new Student();
		
		System.out.println();
		student.age = 21;
		student.name = "Igor";
		student.surname = "Blinov";
		student.enterYear = 2015;
		
		Student student2 = null;
		student2 = new Student();
		student2.age = 20;
		student2.name = "Anna";
		student2.surname = "Petrova";
		student2.enterYear = 2015;
		
		Group group = new Group();
		group.number = 1;
		group.students = new Student[10];
		
		group.students[0] = student2;
		group.students[1] = student;
		group.greetNewStudent();
		System.out.println("An average age of students is: " + group.calculateAvgAge());
		System.out.println("The number of students who entered university in 2015 is: "+ group.numberOfStudents());
		System.out.println("A year with max students is: " + group.findYearMax());
	}
}
