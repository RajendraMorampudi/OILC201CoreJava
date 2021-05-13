package assignment4;

import java.util.Scanner;

public class GrestNumber {
	

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the two  numbers");
			int m1 = scanner.nextInt();
			int m2 = scanner.nextInt();
			System.out.println(getGreatest(m1, m2));
			scanner.close();
		}

		public static int getGreatest(int sum1, int sum2) {
			int result = 0;
			if (sum1 < 0 || sum2 < 0) {
				result = -1;
			} else if (sum1 == 0 || sum2 == 0) {
				result = -2;
			} else if (sum1 > sum2) {
				result = sum1;
			} else {
				result = sum2;
			}
			return result;
		}

	}


