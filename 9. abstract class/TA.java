import java.util.Date;

public class TA extends Employee{
	//Data fields:
	private double wage;
	private int hours; //24 hrs in a day; 
	
	//Constructor
	TA(String n, Date hd, String ssn, double wg, int hr){
		super(n,hd,ssn);
		
		this.wage = wg;
		this.hours = hr;
	}
	
	//Copy constructor:
	TA(TA twin){
		super(twin.getName(), twin.getHireDate(), twin.getSSN());
		
		this.wage = twin.wage;
		this.hours = twin.hours;
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
		//samePay() and 
	public boolean samePay(TA twin) {
		return(this.getPay() == twin.getPay());
	}
		//sameDaysOff()
	public boolean sameDaysOff(TA twin) {
		return(this.getDaysOff() == twin.getDaysOff());
	}
	
	//Concrete methods defined for subclasses
		//getPay()
	public double getPay() {
		return (this.wage * this.hours); //returns a double
	}
		//getDaysOff()
	public int getDaysOff() {	//returns as int
		return(this.hours / 24); //for every 24 hours worked, earns 1 day off
	}
}
