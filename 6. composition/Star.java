public class Star {
	//Data:
	public String name;
	public double diameter;
	public double age;
	public int surface_temp;
	
	
	//Loaded constructor:
	public Star(String name, double di, double age, int surf_temp){
		this.name = name;
		this.diameter = di;
		this.age = age;
		this.surface_temp = surf_temp;
	}
	
	//Copy constructor:
	Star(Star other){
		//Error checking
		if(other == null) {
			System.out.println("Error");
			System.exit(0);
		}
		
		this.name = new String(other.name); //Privacy leakage prevention
		this.diameter = other.diameter;
		this.age = other.age;
		this.surface_temp = other.surface_temp;
	}
	
	
	//Set method:
	public void setName(String name){this.name = name;}
	public void setDi(double di){this.diameter = di;}
	public void setAge(double age){this.age = age;}
	public void setSurfTemp(int surf_temp){this.surface_temp = surf_temp;}
	
	//Get method:
	public String getName(){return new String(name);}
	public double getDi(){return diameter;}
	public double getAge(){return age;}
	public int getSurfTemp(){return surface_temp;}
	
	
	//toString Method:
	public String toString(){
		String output = "";
		
		output += "\nName: " + this.name + "\nDiameter, in kilometres: " 
				+ this.diameter + "\nAge, in billions: " + this.age +
				"\nSurface Temperature in kelvins: " + this.surface_temp;
		
		return output;
	}
}
