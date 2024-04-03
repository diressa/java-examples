public class Person { 
	
	private String name;
	private boolean alive;
	private int age;
	private String ssn;
 
 
	public Person(String name, boolean alive, int age, String ssn) {
		this.name=name;
		this.alive= alive;
		this.age=age;
		this.ssn=ssn;
	}
	public Person (Person p) {
		if (p==null) {
			System.out.println("Invalid Person! Please try again!");
			System.exit(0);
		}
		this.name=p.name;
		this.alive=p.alive;
		this.age=p.age;
		this.ssn=p.ssn;
	}
	

	public void setName(String name) {
		this.name=name;	
	}
	public String getName() {
		return this.name;
	}
	public void setAlive(boolean alive) {
		this.alive=alive;
	}
	public boolean getAlive () {
		return this.alive;
	}
	public void setAge (int age ) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}	
	public void setSSN (String ssn ) {
		this.ssn=ssn;
	}	
	public String  getSSN() {
		return this.ssn;
	}
	
	public String toString() {
		return "\n\nPersonal Info: \nName: "+ this.name + "\nAlive: "
				+ this.alive + "\nAge: " + this.age + "\nSSN: "+  this.ssn;
	}
}
