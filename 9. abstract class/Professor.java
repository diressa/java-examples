import java.util.Date;

public class Professor extends Employee {
	//Data fields:
	private double wage;
	private int hours; //24 hrs in a day; 
		
	//Constructor
	Professor(String n, Date hd, String ssn, double wg, int hr){
		super(n,hd,ssn);
			
		this.wage = wg;
		this.hours = hr;
	}
		
	//Copy constructor:
	Professor(Professor dummy){
		super(dummy.getName(), dummy.getHireDate(), dummy.getSSN());
		
		this.wage = dummy.wage;
		this.hours = dummy.hours;		
	}
		
	//set/get method
	public void setWage(double wg){this.wage = wg;}
	public void setHours(int hr) {this.hours = hr;}
		
	public double getWage(){return this.wage;}
	public int getHours(){return this.hours;}
		
	//toString
	public String toString() {
		return super.toString() + "\nTeaching Assistant Info: \nWage: "
				+ this.wage + "\nHours worked: " + this.hours;
	}		
	
	//Concrete methods:
	public boolean samePay(Professor dummy) {
		return(this.getPay() == dummy.getPay());
	}

	public boolean sameDaysOff(Professor dummy) {
		return(this.getDaysOff() == dummy.getDaysOff());
	}
	//Concrete methods defined from inherited abstract:
	public double getPay() {
		return (this.wage * this.hours); //returns double
	}

	public int getDaysOff() {	//returns int
		return(this.hours / 24); 
	}	
}
