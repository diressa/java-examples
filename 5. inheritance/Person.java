/**
 *	Created By: Beza Nigatu
 *	Inheritance 101
 *	October 7, 2021
**/
//base class
public class Person{
	//Data:
	public String name;
	public int age;
	protected String ssn;
	protected boolean alive;


	//Loaded constructor:
	Person(String name, int age, String ssn, boolean alive){
		this.name = name;
		this.age = age;
		this.ssn = ssn;
		this.alive = alive;
	}

	//Copy constructor:
	Person(Person twin){
		//Error checking if person copy is null:
		if (twin == null){
			System.out.println("Error, null object");
			System.exit(0);
		}
		
		this.name = twin.name;
		this.age = twin.age;
		this.ssn = twin.ssn;
		this.alive = twin.alive;
	}	

	//Set methods:
	public void setName(String name){this.name = name;}
	public void setAge(int age){this.age = age;}
	public void setSSN(String ssn){this.ssn = ssn;}
	public void setAlive(boolean alive){this.alive = alive;}

	//Get methods:
	public String getName(){return name;}
	public int getAge(){return age;}
	public String getSSN(){return ssn;}
	public boolean getAlive(){return alive;}

	//toString method:
	public String toString(){
		return "\nPerson Info: \nName: " + this.name + 
		"\nAge: " + this.age + "\nSSN: " + this.ssn 
		+ "\nExistence: " +  this.alive;
	}
}
