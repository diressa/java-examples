//derived class
public class Student extends Person{
	//Data:
	private String stu_id;
	private double gpa;
	private String grade;

	//Loaded constructor:
	Student(String name, int age, String ssn, String id, double gpa, String grade, boolean alive){
		super(name, age, ssn, alive); //Derived from Person class

		this.stu_id = id;
		this.gpa = gpa;
		this.grade = grade;
	}

	//Copy constructor:
	Student(Student same){
		super(same.getName(), same.getAge(), same.getSSN(), same.getAlive());

		this.stu_id = same.stu_id;
		this.gpa = same.gpa;
		this.grade = same.grade;
	}

	//Set methods:
	public void setID(String id){this.stu_id = id;}
	public void setGPA(double gpa){this.gpa = gpa;}
	public void setGrade(String grade){this.grade = grade;}

	//Get methods:
	public String getID(){return this.stu_id;}
	public double getGPA(){return this.gpa;}
	public String getGrade(){return this.grade;}

	//toString method:
	public String toString(){	
		return "\nStudent Info: \nName: " + this.name + 
		"\nAge: " + this.age + "\nSSN: " + this.ssn 
		+ "\nExistence: " +  this.alive + "\nID: " 
		+ this.stu_id + "\nGrade Point Average: " + this.gpa 
		+ "\nLetter Grade: " + this.grade;
	}
}
