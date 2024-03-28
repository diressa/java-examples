//driver class
public class BodyAccess{
	public static void main(String[] args){
		Student s1 = new Student("Pip", 18, "012-345-6789", "1234567", 4.0, "A", true);
		Student s2 = new Student("Pop", 81, "987-654-3210", "7654321", 0.4, "D", false); //R.I.P Pop </3
		
		Teacher t1 = new Teacher("Beep", 99, "111-111-1111", "12345", 12, 30, true);
		Teacher t2 = new Teacher("Boop", 25, "111-222-3333", "54321", 999999, 1, false);
		
		System.out.println(s1.toString()); System.out.println(s2.toString());
		System.out.println(t1.toString()); System.out.println(t2.toString());
	}
}
