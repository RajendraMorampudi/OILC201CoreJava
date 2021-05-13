package assignment2;

public class Wish {

	public static void main(String[] args) {

		String wishZone = args[0];
		String name = args[1];

		if (wishZone.equalsIgnoreCase("am")) {

			System.out.println("Good Morning " + name);
		}
		else if (wishZone.equalsIgnoreCase("pm"))
		{
			System.out.println("Good Evening " + name);
		} else {
			System.out.println("First argument should be either 'AM' or 'PM'");
		}
	}
}