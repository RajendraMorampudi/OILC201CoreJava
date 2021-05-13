package assignment4;

import java.util.Scanner;
public class OddRound {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scanner.nextInt();
		System.out.println(getOddNumber(num));
		scanner.close();

	}

	public static int getOddNumber(int num) {
		int result = 0;

		if (num < 0) {
			result = -1;
		} else if (num == 0) {
			result = -2;
		} else if (num % 2 == 0) {
			result = num;
		} else {
			int odd = num / 10;
			result = ((odd + 1) * 10);
		}

		return result;

	}

}
