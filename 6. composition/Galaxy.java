public class Galaxy {
	//Data:
	public String g_name;
	public int star_num;
	public double g_diameter;
	
	
	//Loaded constructor:
	public Galaxy(String g_name, int star_num, double g_di){
		this.g_name = g_name;
		this.star_num = star_num;
		this.g_diameter = g_di;
	}
	
	//Copy Constructor:
	Galaxy (Galaxy dub){
		//Error checking
		if(dub == null) {
			System.out.println("Error");
			System.exit(0);
		}
		
		this.g_name = dub.g_name;
		this.star_num = dub.star_num;
		this.g_diameter = dub.g_diameter;
	}
	
	
	//Set methods:
	public void setG_Name(String g_name){this.g_name = g_name;}
	public void set(int star_num){this.star_num = star_num;}
	public void set(double g_di){this.g_diameter = g_di;}
	
	//Get methods:
	public String getG_Name(){return new String(g_name);} //Definition to avoid privacy leak
	public int getStarNum(){return star_num;}
	public double getG_Di(){return g_diameter;}
	
	
	//toString Method:
	public String toString(){
		String output = "";
		
		output += "\n\nGalaxy Information:\n\nName: " + this.g_name + "\n# of Stars, in billions: "
				+ this.star_num + "\nDiameter, in lightyears: " + this.g_diameter + 
				"\n\n\nStars within galaxy constellation:";
		
		return output;
	}
}
