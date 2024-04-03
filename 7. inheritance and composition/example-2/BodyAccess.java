/**
 *
 * Created By: Beza Nigatu, Kristen Cho, Tral Marly Clersaint
 * Composition & Inheritance
 * October 26, 2021
 *
 **/
public class BodyAccess{
	public static void main (String[] args){
		//Department info:
		Course[] courseRoster = new Course[2];

		Professor[] facRoster = new Professor[3];

		//Course Info:
		College_Student[] studentRoster = new College_Student[4];
		College_Student[] studentRoster2 = new College_Student[4];


		//Course 1
		studentRoster [0] = new College_Student("Bob", true, 12, "111-111-1111", "12345", 3.0, "ECE", "Freshman");
		studentRoster [1] = new College_Student("Pob", true, 20, "112-111-1111", "12346", 4.0, "ECE", "Sophmore");
		studentRoster [2] = new College_Student("Pop", true, 19, "113-111-1111", "12347", 2.0, "CS", "Sophmore");
		studentRoster [3] = new College_Student("Nop", true, 30, "114-111-1111", "12348", 3.0, "CS", "Junior");
		//Course 2
		studentRoster2 [0] = new College_Student("Mep", true, 22, "111-111-1111", "32345", 3.2, "ECE", "Senior");
		studentRoster2 [1] = new College_Student("Mob", true, 22, "122-111-1111", "32346", 4.0, "ECE", "Sophmore");
		studentRoster2 [2] = new College_Student("Moop", true, 19, "213-111-1111", "32347", 3.5, "CS", "Junior");
		studentRoster2 [3] = new College_Student("Meep", true, 30, "214-111-1111", "32348", 3.0, "CS", "Junior");
		//Department
		facRoster [0] = new Professor("Computer Science", "Cybersecurity", "Department Chair", true, "2234", 100000, 5, "Dr.Beep", true, 40, "222-222-2222");
		facRoster [1] = new Professor("Theoretical Physics", "String Theory", "Second Chair", false, "1234", 120000, 17, "Dr. Uhhh", true, 50, "222-222-2222");
		facRoster [2] = new Professor("Electrical", "Environment", "Department Chair", true, "3234", 110000, 10, "Dr.Boop", true, 54, "322-222-2222");
		courseRoster[0] = new Course("Physics", "Dr. Beep", studentRoster);
		courseRoster[1] = new Course("Differential Equations", "Dr. Boop", studentRoster2);

		//Create lists for Course, departments + extra professor
		Course crs1 = new Course("Physics", "Dr. Beep", studentRoster);
		Course crs2 = new Course("Differential Equations", "Dr. Boop", studentRoster2);

		Department d1 = new Department ("Dr.Uhhh for Arts & Sciences", facRoster, courseRoster);
		Department d2 = new Department ("Dr.Oops for Behavioral Science", facRoster, courseRoster);


		Professor pf1 = new Professor("Biology", "Membranes", "Professor", false, "5234", 150000, 16, "Dr. Ummm", true, 60, "722-222-2222");
		Professor pf2 = new Professor("Mechanical Engineering", "Motors", "Professor", false, "5234", 150000, 16, "Dr. Boo", true, 60, "732-222-2222");
		Professor pf3 = new Professor("Computer Science", "Data Analysis", "Professor", false, "5534", 160000, 26, "Dr. AAAH", true, 66, "822-222-2222");


		//Accessors to set list data
		//Course
		crs1.setListStu(studentRoster);
		crs2.setListStu(studentRoster2);
		//Department
		d1.setListFa(facRoster);
		d1.setListCo(courseRoster);
		d2.setListFa(facRoster);
		d2.setListCo(courseRoster);

		crs1.getListStu();
		crs2.getListStu();


		//Print out:
		//courses/class roster:
		System.out.println(crs1.toString());
		System.out.println(crs2.toString());

		//department 1 research/roster:
		System.out.println("\n\nDepartment 1: " + d1.toString());
		System.out.println(pf1.toString()); //Other professors in department

		System.out.println("\n\nDepartment 2: " + d2.toString());
		System.out.println(pf2.toString());
		System.out.println(pf3.toString());


	}
}
