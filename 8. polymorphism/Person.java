//base class
public class Person{
	//Data:
	private String name;
	private int age;
	private String ssn;
	private boolean alive;


	//Loaded constructor:
	public Person(String name, int age, String ssn, boolean alive){
		this.name = name;
		this.age = age;
		this.ssn = ssn;
		this.alive = alive;
	}

	//Copy constuctor:
	Person(Person twin){
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
	public String getName(){return this.name;}
	public int getAge(){return this.age;}
	public String getSSN(){return this.ssn;}
	public boolean getAlive(){return this.alive;}

	//toString method:
	public String toString(){
		return "\nPerson Info: \nName: " + this.name + 
		"\nAge: " + this.age + "\nSSN: " + this.ssn 
		+ "\nExistence: " +  this.alive;
	}
	
	//Abstract method for polymorphism:
	void toPay(){
		System.out.println("\nUnknown pay amount");
	}

	void toLeave(){
		System.out.println("\nUnknown vacation time");
	}
}