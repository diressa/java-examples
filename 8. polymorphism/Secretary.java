public class Secretary extends Person{
	//Data:
	private String fac_id;
	private String num_service;
	private int salary;
	private int num_vacation; 


	//Loaded constructor:
	Secretary(String name, int age, String ssn, boolean alive,
		      String s_id, String srvNum, int sal, int vacNum){
		super(name, age, ssn, alive); //Derived from Person base class
		
		this.fac_id = s_id;
		this.num_service = srvNum;
		this.salary = sal;
		this.num_vacation = vacNum;
	}

	//Copy constructor:
	Secretary(Secretary sec){
		super(sec.getName(), sec.getAge(), sec.getSSN(), sec.getAlive());
	
		this.fac_id = sec.fac_id;
		this.num_service = sec.num_service;
		this.salary = sec.salary;
		this.num_vacation = sec.num_vacation;
	}


	//Set/get method:
	public void setS_id(String s_id){this.fac_id = s_id;}
	public void setSrvNum(String srvNum){this.num_service = srvNum;}
	public void setSal(int sal){this.salary = sal;}
	public void setVacNum(int vacNum){this.num_vacation = vacNum;}

	public String getS_id(){return this.fac_id;}
	public String getSrvNum(){return this.num_service;}
	public int getPaid(){return this.salary;}
	public int getVacation(){return this.num_vacation;}


	//toString method:
	public String toString(){
		return super.toString() + "\nSecretary Info: \nID: " + this.fac_id 
		+ "\nYears of service: " + this.num_service; 
	}

	//Polymorphism: Overriding on previously abstract method:
	void toPay(){
		System.out.println("\nSecretary salary: Bi-Weekly");
	}
	
	void toLeave(){
		System.out.println("\nSecretary vacation: 1 Month");
	}
	
}