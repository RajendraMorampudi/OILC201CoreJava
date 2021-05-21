package Assignment10;
import java.util.Scanner;
public class RevPalindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");

		int inputNumber = sc.nextInt();

		reverseAndAdd(inputNumber);
		sc.close();
	}

	public static int reverseNumber(int number) {
		int reverse = 0;

		int rem = 0;

		while (number != 0) {
			rem = number % 10;

			reverse = (reverse * 10) + rem;

			number = number / 10;
		}

		return reverse;
	}

	public static boolean checkPalindrome(int number) {
		int reverse = reverseNumber(number);

		if (reverse == number) {
			return true;
		} else {
			return false;
		}
	}

	public static void reverseAndAdd(int number) {
		int sum = 0;
		if (checkPalindrome(number)) {
			System.out.println("Given Number is already a palindrome");
		} else {
			while (!checkPalindrome(number)) {
				int reverse = reverseNumber(number);

				sum = number + reverse;

				System.out.print(number + "," + reverse + ",");

				number = sum;

			}
			System.out.print(sum);
		}
	}


}
