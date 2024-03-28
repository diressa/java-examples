public class ProfessorAccess {
	public static void main(String[] args) {
		//Main method:
		Professor profsr1 = new Professor("Beep", "Engineering & Computing Sciences", 0.12, 30);
		Professor profsr2 = new Professor("Boop", "Arts & Sciences", 999999, 1);
		Professor profsr3 = new Professor("Bop", "Health Professions", 160000, 12);
		
		//Use of copy constructor:
		Professor profsr4 = new Professor(profsr2); //A scenario where a professor is registered twice, 
													//the copy constructor would useful.
		
		//Accessed & mutated object data field:
		profsr1.setName("Dr. Beep");
		profsr1.setSalary(0.24); //Dr. Beep got their salary doubled with a doctorate degree!
		
		//toString method:
		System.out.println("Professor Profiles:\n\n");
		System.out.println(profsr1.toString());
		System.out.println(profsr2.toString());
		System.out.println(profsr3.toString());
	}
}
/**
 * In a separate class named ProfessorAccess, 
 * [x]create a main method that instantiates three professor objects 
 * [x] using the above two constructors separately. 
 *In addition, you should show how to 
 * [x] access 
 * [x] and mutate the object data field 
 *by calling the access/mutator methods. 
 * [x]Also use the toString method to print out the content of each professor object.
 **/