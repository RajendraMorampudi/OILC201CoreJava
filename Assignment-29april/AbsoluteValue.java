package assignment3;

public class AbsoluteValue {
	public static void main(String[] args) {
        String number = args[0];
        try {
            int input = Integer.parseInt(number);
            if (input < 0) {
                System.out.println(-(input));
            } else {
                System.out.println(input);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }
}

