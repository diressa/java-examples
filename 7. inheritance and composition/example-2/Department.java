public class Department{
	//Data fields:
	private String chair;
	private Professor[] listFaculty;
	private Course[] listCourses;

	
	//Loaded constructor:
	Department(String chair, Professor[] listFaculty, Course[] listCourses){
		this.chair = chair;
		this.listFaculty = new Professor[listFaculty.length]; 
		for(int i = 0; i < listFaculty.length; i++) {
			this.listFaculty[i] = new Professor (listFaculty[i]);
		}
		this.listCourses = new Course[listCourses.length];
		for(int j = 0; j < listCourses.length; j++) {
			this.listCourses[j] = new Course (listCourses[j]);
		}
	}

	//Copy constructor:
	public Department(Department dp){
		this.chair = dp.chair;
		this.listFaculty = dp.listFaculty;
		this.listCourses = dp.listCourses;
	}

	
	//Mutators (set method)
	public void setChair(String chair){this.chair = chair;}
	public void setListFa(Professor[] listFa){this.listFaculty = listFa;}
	public void setListCo(Course[] listCo){this.listCourses = listCo;}
	
	//Accessors (get method)
	public String getChair(){return this.chair;}
	public Professor[] getListFa(){
		Professor[] temp = new Professor[listFaculty.length];
		for(int i = 0; i < listFaculty.length; i++){
			temp[i]= listFaculty[i];
		}
		return temp;
	}
	public Course[] getListCo() {
		Course[] pmet = new Course[listCourses.length];
		for(int j = 0; j < listCourses.length; j++) {
			pmet[j] = listCourses[j];
		}
		return pmet;	
	}


	//toString
	public String toString(){
		String output = "";
		
		for(int i = 0; i<listFaculty.length; i++) {
			output += listFaculty[i].toString();
		}
		for(int j = 0; j<listCourses.length; j++) {
			output += listCourses[j].toString();
		}
		return output;
	}

}
