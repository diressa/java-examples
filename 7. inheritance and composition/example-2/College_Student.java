public class College_Student extends Student{
	private String major;
    private String grade;
    
    //constructor
 	public College_Student(String name, boolean alive, int age, String ssn, String stu_id, double gpa, String m, String g){
 		super(name, alive, age, ssn, stu_id, gpa);
 		this.major = m;
 		this.grade = g;
    }
	public College_Student(College_Student cs){
		super(cs.getName(), cs.getAlive(), cs.getAge(), cs.getSSN(), cs.getStu_id(), cs.getGPA());
		this.major = cs.major;
		this.grade = cs.grade;
    }  
    
	//set/get
    public void setMajord(String m1){
    	this.major = m1;
    }
    public String getMajor(){
    	return this.major;
    }
    public String getGrade(){
    	return this.grade;
    }
    //toString
    public String toString(){
    	String cs = "";
    	cs += super.toString();
    	cs += "\nMajor:" + this.major + "\nGrade:" + this.grade;
    	return cs;
    }
}

