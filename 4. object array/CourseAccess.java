public class CourseAccess{
	public static void main(String[] args){
		Student[] studentRoster = new Student [3];//Each element inside the array is installed 
												  //as a student object (3 elements —> 3 objects)
		studentRoster[0] = new Student ("Peep");
		studentRoster[1] = new Student ("Pep");
		studentRoster[2] = new Student ("Pop");
		
	
		Course c1 = new Course ("Art 101","Professor Beep","1234", studentRoster);
		Course c2 = new Course ("Writing 250","Professor Boop","2134", studentRoster);
		Course c3 = new Course ("Math 310","Professor Bop","4321", studentRoster);	

		//Accessors
		c1.setListStu(studentRoster);
		c2.setListStu(studentRoster);
		c3.setListStu(studentRoster);
	
		//Prints out list of students
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);	
	}
}
