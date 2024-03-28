public class Student{
	//data
	public String studentName;
	
	//constructor
	Student(String stuName){
		this.studentName = stuName;
	}
	
	public Student (Student other){		
		this.studentName = other.studentName;

		//error checking
		if (other == null)
			System.out.println("Error");
			System.exit(0);
	}
	
	//set method & get method
	public void setStuName(String stuName) {this.studentName = stuName;}
	public String getStuName() {return studentName;}
	
	//toString method
	public String toString() {
		return studentName;
	}
}