//base class
public class Person{
	//Data:
	private String name;
	private int age;
	private String ssn;
	private boolean alive;


	//Loaded constructor:
	Person(String name, int age, String ssn, boolean alive){
		this.name = name;
		this.age = age;
		this.ssn = ssn;
		this.alive = alive;
	}

	//Copy constructor:
	Person(Person twin){
		//Error check:
		if (twin == null){
			System.out.println("Error");
			System.exit(0);
		}
		
		this.name = twin.name;
		this.age = twin.age;
		this.ssn = twin.ssn;
		this.alive = twin.alive;
	}	
	
	//No arg constructor
	Person(){}

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
		String ot = "";
		
		ot = "\nPerson Info: \nName: " + this.name + 
		"\nAge: " + this.age + "\nSSN: " + this.ssn 
		+ "\nExistence: " +  this.alive;
		
		return ot;
	}
}