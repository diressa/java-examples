public class Course{
	//Data fields:
	private String course_name;
	private String instructor;
	private College_Student[] listStudents;


	//Loaded constructor:
	public Course(String cn, String inst, College_Student[] listStudents){
		this.course_name = cn;
		this.instructor = inst;
		this.listStudents = new College_Student[listStudents.length];
		for(int i = 0; i < listStudents.length;i++) {
			this.listStudents[i] = new College_Student (listStudents[i]);
		}
	}
	
	//Copy constructor:
	public Course(Course other){
		this.course_name = other.course_name;
		this.instructor = other.instructor;
		this.listStudents = other.listStudents;
	}
	
	//set methods
	public void setCn(String cn){
		this.course_name = cn;
	}
	public void setIns(String inst){
		this.instructor = inst;
	}
	public void setListStu(College_Student[] listStudents){
		this.listStudents = listStudents;
	}	
	
	//get methods
	public String getCn() {
		return this.course_name;
	}
	public String getInst() {
		return this.course_name;
	}
	public College_Student[] getListStu() {
		College_Student[] temp = new College_Student[listStudents.length];
		for(int i = 0; i < listStudents.length; i++){ 
			temp[i] = listStudents[i];
		}
		return temp;
	}
	
	
	//toString method for first 4 students (course 1)
	public String toString() {
		String output = "";
		
		for (int i = 0; i< listStudents.length; i++) {
			output += listStudents[i].toString();
		}
		
		return "\n" + this.course_name + " with " + this.instructor + output;
	}

	
}
