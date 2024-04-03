class Student extends Person {
	private String stu_id;
	private double gpa;
	
	//constructor
	public Student(String name, boolean alive, int age, String SSN, String stu_id, double gpa) {
		super(name, alive, age, SSN);
		this.stu_id = stu_id;
		this.gpa = gpa;
	}
	public Student(Student s){
	    super(s.getName(), s.getAlive(), s.getAge(), s.getSSN());
	    this.stu_id = s.stu_id;
	    this.gpa = s.gpa;
	    }

	//set/get
	public void setStu_id(String stu_id){
	    this.stu_id = stu_id;
	}
	public String getStu_id(){
    	return this.stu_id;
    }
	public void setGPA(double gpa){
    	this.gpa = gpa;
    }
	public double getGPA(){
    	return this.gpa;
    }
	//toString
	public String toString(){
	    String s = "";
	   	s += super.toString();
	   	s += "\nStudent ID:" + this.stu_id + "\nGPA:" + this.gpa;
	   	return s;
    }

}
