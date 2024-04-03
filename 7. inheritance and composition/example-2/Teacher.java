public class Teacher extends Person  {
	
	private String ID;
	private int monthly_salary;
	private int num_yr_prof;

	

	
	public Teacher(String ID, int monthly_salary, int num_yr_prof, String name, boolean alive, int age, String ssn) {
		super(name, alive, age, ssn);
		this.ID=ID;
		this.monthly_salary=monthly_salary;
		this.num_yr_prof=num_yr_prof;
		
	}
	public Teacher (Teacher t) {
		super (t.getName(), t.getAlive(), t.getAge(), t.getSSN());
		  this.ID=t.ID;
		  this.monthly_salary=t.monthly_salary;
		  this.num_yr_prof=t.num_yr_prof;
	}

	
	
	//set/get
	public void setID( String ID) {
		this.ID=ID;
	}
	
	public String getID() {
		return this.ID;
	}

	public void setMonthly_salary(int monthly_salary) {
		this.monthly_salary=monthly_salary;
	}

	public int getMonthly_salary () {
		return this.monthly_salary;
	}
	
	public void setNum_yr_prof(int num_yr_prof) {
		this.num_yr_prof=num_yr_prof;
	}
	public int getNum_yr_prof() {
		return this.num_yr_prof;
	}

	public String toString() {
		String t="";
		t+=super.toString();
		t+="\n\nTeaching Info:" +"\nID: "+ this.ID+ "\nMonthly Salary: "+ this.monthly_salary+"\nYears served as a professor: "+ this.num_yr_prof;
		return t;
	
}

}
