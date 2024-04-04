public class Professor extends Person{
	//Data:
	private String fac_id;
	private String research_area;
	private int salary;
	private int num_vacation;


	//Loaded constructor:
	Professor(String name, int age, String ssn, boolean alive, 
		      String p_id, String research, int sal, int vacNum){	
		super(name, age, ssn, alive); //Derived fields from Person base class
	
		this.fac_id = p_id;
		this.research_area = research;
		this.salary = sal;
		this.num_vacation = vacNum;
	}
	
	//Copy constructor:
	Professor(Professor pro){
		super(pro.getName(), pro.getAge(), pro.getSSN(), pro.getAlive());

		this.fac_id = pro.fac_id;
		this.research_area = pro.research_area;
		this.salary = pro.salary;
		this.num_vacation = pro.num_vacation;
	}


	//Set/get method:
	public void setP_id(String p_id){this.fac_id = p_id;}
	public void setResearch(String research){this.research_area = research;}
	public void setSal(int sal){this.salary = sal;}
	public void setVacNum(int vacNum){this.num_vacation = vacNum;}

	public String getP_id(){return this.fac_id;}
	public String getResearch(){return this.research_area;}
	public int getPaid(){return this.salary;}
	public int getVacation(){return this.num_vacation;}


	//toString method:
	public String toString(){
		return super.toString() + "\nProfessor Info: \nID: " + this.fac_id 
		+ "\nArea of Research: " + this.research_area; 
	}

	//Polymorphism: Overriding on previously abstract method:
	void toPay(){
		System.out.println("\nProfessor salary: Monthly");	
	}
	
	void toLeave(){
		System.out.println("\nProfessor vacation: 3 Months");
	}
	
}
