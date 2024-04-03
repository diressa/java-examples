public class DepartmentAccess {
	public static void main (String[] args) {
		//5 total students for elements 0-4; 3 professors for elements 0-2
		Student[] studentRoster = new Student [5];
		Teacher[] teacherRoster = new Teacher [3];
		 
		studentRoster[0] = new Student ("Peep", 14, "111-111-1111", "4", 5, "a", false);
		studentRoster[1] = new Student ("Pep", 124, "112-112-1112", "48", 5, "a", false);
		studentRoster[2] = new Student ("Pop", 142, "122-122-1222", "44", 5, "a", false);
		studentRoster[3] = new Student ("Poop", 11, "222-222-2222", "43", 5, "a", false);
		studentRoster[4] = new Student ("Loop", 14, "223-223-2223", "42", 5, "a", false);
		
		
		teacherRoster[0] = new Teacher ("Dr.Meep", 50, "333-333-3333", "001", 50000, 3, true);
		teacherRoster[1] = new Teacher ("Dr.Mep", 40, "444-444-4444", "002", 270000, 8, true);
		teacherRoster[2] = new Teacher ("Dr.Mop", 70, "555-555-5555", "003", 500000, 19, true);


		Department d1 = new Department ("Arts & Sciences", 30, studentRoster, teacherRoster);
		Department d2 = new Department ("Behavioral Science", 12, studentRoster, teacherRoster);
		
		
		//Accessors to set information about each department's list of students and teachers
		d1.setListStu(studentRoster);
		d2.setListStu(studentRoster);
		
		d1.setListTe(teacherRoster);
		d2.setListTe(teacherRoster);
		
		//Print lists after the information has been set
		System.out.println(d1.toString());
		System.out.println(d2.toString());
	}
}
