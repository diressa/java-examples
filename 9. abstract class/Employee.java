import java.util.Date;

abstract class Employee {
	//Data fields:
	private String name;
	private Date hireDate;
	private String ssn;
	
	//Fully loaded constructor
	Employee(String n, Date hd, String ssn){
		this.name = n;
		this.hireDate = hd;
		this.ssn = ssn;
	}
	
	//Copy constructor
	Employee(Employee other){
		//Error Checking:
		if(other == null) {
			System.out.println("Error");
			System.exit(0);
		}
		
		this.name = other.name;
		this.hireDate = other.hireDate;
		this.ssn = other.ssn;
	}
	
	//Set methods:
	public void setName(String n){this.name = n;}
	public void setHireDate(Date hd2) {this.hireDate = hd2;} //set different location from hd
	public void setSSN(String ssn) {this.ssn = ssn;}
	
	//Get methods 
	public String getName(){return this.name;}
	public Date getHireDate(){return this.hireDate;}
	public String getSSN() {return this.ssn;}
	
	//toString
	public String toString() {
		return "\nEmployee Info: \nName:" + this.name + "\nHire Date: "
				+ this.hireDate + "\nSSN: " + this.ssn;
	}
	
	//Abstract methods:
	public abstract double getPay(); //abstract postpones the definition of method
	public abstract int getDaysOff();//body of method is defined in derived classes
	
	//Concrete methods:
	//samePay method:
	public boolean samePay(Employee other){
		return (this.getPay() == other.getPay());
	}
	//sameDaysOff method:
	public boolean sameDaysOff(Employee other){
		return (this.getDaysOff() == other.getDaysOff());
	}
}
