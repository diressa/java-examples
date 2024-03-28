public class StudentAccess {
	public static void main(String[] arg){
			Student stu1 = new Student(); //default constructor
			Student stu2 = new Student("Pip", "1234567", 4.0, 18);
			Student stu3 = new Student("Pop", "7654321", 0.4, 81); //school is rough for Pop :-(

			//using get method
			System.out.println("First student's information: \n\n" + "Name: " + stu1.getName() +
					"\nID: " + stu1.getStu_id() + "\nGPA: " + stu1.getGPA() + "\nAge: " + stu1.getAge());

			//utilizing set methods
			stu1.setName("Moop");
			stu1.setStu_id("1212121");
			stu1.setGPA(2.1);
			stu1.setAge(21);
			
			System.out.println("\n\n\nFirst student's altered information: \n\n" + "Name: " + stu1.getName() +
					"\nID: " + stu1.getStu_id() + "\nGPA: " + stu1.getGPA() + "\nAge: " + stu1.getAge());
	}  
}
