/**
 *	Created By: Beza Nigatu
 *	Polymorphism
 *	October 21, 2021
**/
public class WorkerAccess{
	//Java should know which method to execute first, according to class hierarchy
	public void getPaid(Person per){
		per.toPay();
	}
	public void getVacation(Person vac){
		vac.toLeave();
	}

	public static void main(String[] args){
		Professor pro1 = new Professor("Dr. Beep", 50, "111-111-1111", true,
										"123qw", "String Theory", 80000, 5);
		Secretary scr1 = new Secretary("Ms. Keisha", 9, "222-222-2222", true,
										"er234", "5 months", 45000, 1);
		Student_worker sw1 = new Student_worker("Icup", 23, "333-333-3333", false,
												"234-1234", "Junior", 15000, 2, "Physics");

		//An object of WorkerAccess, school, is made.
		//This object location will hold the employee's data
		WorkerAccess school = new WorkerAccess();
		school.getPaid(pro1);
		school.getPaid(scr1);
		school.getPaid(sw1);

		school.getVacation(pro1);
		school.getVacation(scr1);
		school.getVacation(sw1);
		//As a result, it executes a print out within the pay & vacation overriden methods

	}
}
