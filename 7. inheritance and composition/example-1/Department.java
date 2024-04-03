/**
 *
 * Created By: Beza Nigatu
 * Integration of Inheritance and Composition
 * October 14, 2021
 *
 **/
//Composition of Student & Teacher "Department has a Teacher/Student"
public class Department{
	//Data:
	private String deptName;
	private int numMajors;
	private Teacher[] listTeachers; //inherits Person base class
	private Student[] listStudents; //inherits Person base class

	//Fully Loaded constructor:
	Department(String dpt, int majors, Student[] listStu, Teacher[] listTe){
		this.deptName = new String(dpt);
		this.numMajors = majors;
		this.listStudents = new Student[5];
		this.listTeachers = new Teacher[3];
	}
	//Default Constructor:
	Department(){}

	//Set methods:
	public void setDeptName(String dpt){this.deptName = dpt;}
	public void setNumMajors(int majors){this.numMajors = majors;}
	public void setListTe(Teacher[] listTe){this.listTeachers = listTe;}
	public void setListStu(Student[] listStu){this.listStudents = listStu;}

	//Get methods:
	public String getDeptName(){return deptName;}
	public int getNumMajors(){return numMajors;}
	public Teacher[] getListTe(){
		Teacher[] pmet = new Teacher[listTeachers.length];
		for(int j= 0; j< listTeachers.length; j++) {
			pmet[j] = listTeachers[j];
		}
		return pmet;
	}
	public Student[] getListStu(){
		Student[] temp = new Student[listStudents.length];
			for (int i= 0; i< listStudents.length; i++ ){
				temp[i] = listStudents[i];
			}
			return temp;
	}

	//toString method:
	public String toString() {
		//Assigns String names to each element holder, instead of all their info included:
		//String[] listStudents = {"Peep", "Pep", "Pop", "Poop", "Loop"};
		//String[] listTeachers = {"Dr.Meep", "Dr.Mep", "Dr.Mop"};

		return "__________\n\n\nDepartment Info:\nDepartment Name: " + this.deptName +
				"\nNumber of Majors: " + this.numMajors

				//prints out student name, based on address specified in array
				+ "\n-----\nStudent Occupants: \n>"
				+ listStudents[0] + "\n> " + listStudents[1] + "\n> " +
				listStudents[2] + "\n> " + listStudents[3] + "\n> " + listStudents[4] +

				//prints out teacher list
				"\n-----\nTeacher Occupants: \n> " + listTeachers[0] + "\n> " + listTeachers[1]
				+ "\n> " + listTeachers[2];

	}
}
