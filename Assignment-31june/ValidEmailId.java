package Assignment31;
import java.util.Scanner;
public class ValidEmailId {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Email Id");
		String email = scan.next();
		System.out.println(isValidEmailId(email));
		scan.close();
	}

	public static String isValidEmailId(String email) {

		String result = "";
		int count = 0;
		int b = 0;
		String end2 = "";

		int firstChar = (int) email.charAt(0);

		int dot1 = email.length() - 4;
		String end1 = email.substring(dot1, email.length());

		for (int i = 0; i < email.length(); i++) {

			int lowerCase = (int) email.charAt(i);

			if (email.charAt(i) == '@') {
				count++;

			} else if (((lowerCase < 97 || lowerCase > 122) || lowerCase < 0)
					&& (email.charAt(i) != '_' && email.charAt(i) != '.') && email.charAt(i) != '@') {
				b++;
			}
		}
		if (firstChar < 97 || firstChar > 122) {
			result += -1;
		} else if (count == 0) {

			result += -2;
		} else if (count > 1) {

			result += -3;
		} else if (end1.equals(".com") == false) {
			result += -4;
		} else if (b > 0) {
			result += -5;
		} else {

			result += "valid";
		}
		return result;
	}
}
