public class Student_worker extends Person{
	//Data:
	private String ta_id;
	private String year;
	private int salary;
	private int num_vacation;
	private String course_taught;

	//Loaded constructor:
	Student_worker(String name, int age, String ssn, boolean alive,
			     String ta_id, String yr, int sal, int vacNum, String crs_ta){
		super(name, age, ssn, alive); //Derived from Person base class
	
		this.ta_id = ta_id;
		this.year = yr;
		this.salary = sal;
		this.num_vacation = vacNum;
		this.course_taught = crs_ta;
	}

	//Copy constructor:
	Student_worker(Student_worker sw){
		super(sw.getName(), sw.getAge(), sw.getSSN(), sw.getAlive());

		this.ta_id = sw.ta_id;
		this.year = sw.year;
		this.salary = sw.salary;
		this.num_vacation = sw.num_vacation;
		this.course_taught = sw.course_taught;
	}
	

	//Set/get method:
	public void setTa_id(String ta_id){this.ta_id = ta_id;}
	public void setYr(String yr){this.year = yr;}
	public void setSal(int sal){this.salary = sal;}
	public void setVacNum(int vacNum){this.num_vacation = vacNum;}
	public void setCrs_ta(String crs_ta){this.course_taught = crs_ta;}

	public String getTa_id(){return this.ta_id;}
	public String getYr(){return this.year;}
	public int getPaid(){return this.salary;}
	public int getVacation(){return this.num_vacation;}
	public String getCrs_ta(){return this.course_taught;}

	//toString method:
	public String toString(){
		return super.toString() + "\nStudent Worker Info: \nID: " + this.ta_id 
		+ "\nYear of Study: " + this.year + "\nCourse Taught: " + this.course_taught;
	}

	//Polymorphism: Overriding on previously abstract method for pay & vacation:
	void toPay(){
		System.out.println("\nStudent worker salary: Hourly");
	}
	
	void toLeave(){
		System.out.println("\nStudent worker vacation: Weekend");
	}
}