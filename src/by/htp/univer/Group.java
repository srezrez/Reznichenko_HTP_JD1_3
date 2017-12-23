package by.htp.univer;

public class Group {
	int number;
	Student students[];
	
	public void greetNewStudent(){
		System.out.println("Hello, new student!");
	}
	public int calculateAvgAge(){
		int count=0, age=0, avgAge;
		for(int i=0; i<students.length; i++){
			if(students[i]!= null){
		age += students[i].age;
		count++;
		}
		}
		avgAge = age/count;
		return avgAge;
	}
	
	public int numberOfStudents(){
		int counter=0;
		for(int i=0; i< students.length; i++){
			if(students[i]!= null)
				if(students[i].enterYear == 2015)
					counter++;
		}
		return counter;
	}
	
	public int findYearMax(){
		int counter1 =0, year1 = students[0].enterYear, year = 0, counter = 0;
		for (int i=0; i<students.length; i++){
			if (students[i]!=null){
				year = students[i].enterYear;
				for(int j=0; j<students.length; j++){
					if (students[j]!= null){
						if (students[j].enterYear == year)
							counter++;
						if (counter>counter1){
							year1=year;
							counter1=counter;
						}
					}
				}
			}
		}
		return year1;
	}
}
