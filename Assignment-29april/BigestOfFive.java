package assignment3;

public class BigestOfFive {

	public static void main(String[] args) {

		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		if (number1 > number2)
			number2 = Integer.parseInt(args[2]);
		else {
			number1 = number2;
			number2 = Integer.parseInt(args[2]);
		}

		if (number1 > number2)
			number2 = Integer.parseInt(args[3]);
		else {
			number1 = number2;
			number2 = Integer.parseInt(args[3]);
		}

		if (number1 > number2)
			number2 = Integer.parseInt(args[4]);
		else {
			number1 = number2;
			number2 = Integer.parseInt(args[4]);
		}

		if (number1 > number2) {
			System.out.println(number1);
		} else
			System.out.println(number2);
	}
}
