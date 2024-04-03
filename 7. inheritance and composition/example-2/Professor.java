public class Professor extends Teacher {

	private String specialty;
	private String research_area;
	private String rank;
	private boolean tentured; 
	
	//constructor
	public Professor(String s, String r_a, String rank, boolean t, String ID, int monthly_salary, int num_yr_prof,String n, boolean a, int age, String ssn) {
		super(ID, monthly_salary,num_yr_prof,n, a, age, ssn );
		this.specialty=s;
		this.research_area=r_a;
		this.rank=rank;
		this.tentured=t;	
	}
	//copy constructor
	public Professor(Professor p) {
		super (p.getID(), p.getMonthly_salary(), p.getNum_yr_prof(), p.getName(), p.getAlive(), p.getAge(), p.getSSN());
		this.specialty=p.specialty;
		this.research_area=p.research_area;
		this.rank=p.rank;
		this.tentured=p.tentured;	
	}
	
	//set/get
	public void setSpecialty(String specialty) {
		this.specialty=specialty;	
	}	
	public String getSpecialty() {
		return this.specialty;
	}
	public void setResearch_area(String research_area) {
		this.research_area=research_area;
	}
	public String getReserch_area() {
		return this.research_area;
	}
	public void setRank(String rank) {
		this.rank=rank;
	}	
	public String getRank () {
		return this.rank;
	}
	public void setTentured(boolean tentured ) {
		this.tentured=tentured;
	}
	public boolean getTentured () {
		return this.tentured;
	}
	
	//toString
	public String toString() {
		String p="";
		p+= "\n\nProfessor Research Info: "+ "\nSpecialty: "+ this.specialty+"\nResearch_area: "+this.research_area+"\nRank: "+this.rank+ "\nTentured: "+this.tentured;
		p+=super.toString();
		return p;
	}
}
