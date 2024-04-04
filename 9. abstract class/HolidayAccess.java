/**
 * Created By: Beza Nigatu
 * Abstract Class
 * November 2, 2021
 **/
public class HolidayAccess { //driver class

	public static void main(String[] args) {
		Professor dr1 = new Professor("Dr. AAA", null, "111-111-1111", 50.0, 2880); //120 days worked
		Professor dr2 = new Professor("Dr. EEE", null, "222-222-2222", 65.0, 1920); //80 days worked
		Professor dr3 = new Professor("Dr. OOO", null, "333-333-3333", 55.0, 2880);

		TA ta1 = new TA("Ms. Sniffles", null, "444-444-4444", 15.0, 240);
		TA ta2 = new TA("Mr. Hiccup", null, "555-555-5555", 15.0, 120);
		TA ta3 = new TA("Mrs. Sigh", null, "666-666-6666", 20.0, 480);


		//Print comparison checks:
		System.out.println("The statement 'Dr.AAA and TA Sigh have the same pay' is " +
						dr1.samePay(ta3));
		System.out.println("The statement 'TA Hiccup and Dr. EEE have the same pay' is " +
				ta2.samePay(dr2));
		System.out.println("The statement 'Dr. OOO and TA Sniffles have the same days off' is " +
				dr3.sameDaysOff(ta1));
		System.out.println("The statement 'Dr. AAA and Dr. OOO have the same days off' is " +
				dr1.sameDaysOff(dr3));
	}
}
