/**
 * 
 * Created By: Beza Nigatu
 * Module 1: toString and Copy Constructor Lab
 * October 2, 2021
 *
 **/
public class Professor {

	//Data fields:
	private String name;
	private String department;
	private double annual_salary;
	private int year_in_profession;
	
	//Set methods:
	public void setName(String name){this.name = name;}
	public void setDep(String dep){this.department = dep;}
	public void setSalary(double salary){this.annual_salary = salary;}
	public void setProf_year(int prof_year){this.year_in_profession = prof_year;}
	
	//Get methods:
	public String getName(){return this.name;}
	public String getDep(){return this.department;}
	public double getSalary(){return this.annual_salary;}
	public int getProf_year(){return this.year_in_profession;}
	
	//Fully loaded constructor:
	Professor(String name, String dep, double salary, int prof_year){
		this.name = name;
		this.department = dep;
		this.annual_salary = salary;
		this.year_in_profession = prof_year;
	}
	
	//Copy constructor:
	Professor(Professor twin){
		this.name = twin.name;
		this.department = twin.department;
		this.annual_salary = twin.annual_salary;
		this.year_in_profession = twin.year_in_profession;
	}
	
	//toString method 
	public String toString() {
		return  "\n\n" + "Name: " + this.name + 
				"\nDepartment: " + this.department +
				"\nAnnual Salary: $" + this.annual_salary + 
				"\nYears served in profession: " + this.year_in_profession;
	}
}

/**
 * Design a Java class named Professor to represent a professor. 
 * The class contains the following data fields: 
 * [x]		name (private, String), 
 * [x]		department (private, String), 
 * [x]		annual_salary (private, double), 
 * [x]		and year_in_profession (private, int). 
 * You should define the set/get methods for each field. 
 * Also define two constructors, 
 * [x]		one fully loaded constructor 
 * [x]		and one copy constructor. 
 * Also define the toString method for it.
 **/
