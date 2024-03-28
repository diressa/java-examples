/**
 *	Created By: Beza Nigatu
 *	Course Class Implementation
 *	October 5, 2021
**/
public class Course{
	//data
	public String courseName;
	public String instructorName;
	private String courseNumber;
	private Student[] listStudents;

	
	//loaded constructor
	Course(String coName, String inName, String coNum, Student[] listStu){
		this.courseName = coName;
		this.instructorName = inName;
		this.courseNumber = coNum;
		this.listStudents = new Student[4];
		}
	
	//default constructor 
	Course(){}
	
	//copy constructor
	public Course (Course other){		
		this.courseName = other.courseName;
		this.instructorName = other.instructorName;
		this.courseNumber = other.courseNumber;
		this.listStudents = other.listStudents;

		//error checking
		if (other == null)
			System.out.println("Error");
			System.exit(0);
	}

	//set methods
	public void setCoName(String coName){this.courseName = coName;}
	public void setInName(String inName){this.instructorName = inName;}
	public void setCoNum(String coNum){this.courseNumber = coNum;}
	public void setListStu(Student[] listStu){this.listStudents = listStu;}

	//get methods
	public Student[] getListStu(){return listStudents;}
	public String getCoName(){return courseName;}
	public String getInName(){return instructorName;}
	public String getCoNum(){return courseNumber;}
		
	//toString method
	public String toString(){
		String[] listStudents = {"Peep", "Pep", "Pop"};

		return "\nClass occupant information: \n\nCourse Name: " 
		+ this.courseName + "\nInstructor: " + this.instructorName 
		+ "\nCourse #: " + this.courseNumber + "\nOccupants: \n"
		+ listStudents[0] + ", " + listStudents[1] + ", " + listStudents[2];
	}
}

