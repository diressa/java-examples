//inherits Person class "Teacher is a Person"
public class Teacher extends Person{
	//Data:
	private String teacher_id;
	private int salary;
	private int num_yr_prof;

	
	//Constructor:
	Teacher(String name, int age, String ssn, String t_id, int salary, int prof_year, boolean alive){
		super(name, age, ssn, alive); //Derived from Person class

		this.teacher_id = t_id;
		this.salary = salary;
		this.num_yr_prof = prof_year;
	}

	//Copy Constructor:
	Teacher(Teacher same){
		super(same.getName(), same.getAge(), same.getSSN(), same.getAlive());
		
		this.teacher_id = same.teacher_id;
		this.salary = same.salary;
		this.num_yr_prof = same.num_yr_prof;
	}
	
	
	//Set methods:
	public void setT_ID(String t_id){this.teacher_id = t_id;}
	public void setSalary(int salary){this.salary = salary;}
	public void setProfYear(int prof_year){this.num_yr_prof = prof_year;}

	//Get methods:
	public String getT_ID(){return this.teacher_id;}
	public int getSalary(){return this.salary;}
	public int getProfYear(){return this.num_yr_prof;}

	
	//toString method:
	public String toString() {
		return super.toString() + "\nTeacher Info: \nID: " + this.teacher_id 
		+ "\nSalary: " + this.salary + "\nYears of Profession: " + this.num_yr_prof;
	}	
}