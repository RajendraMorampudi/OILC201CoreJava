package assignment4;

import java.util.Scanner;

public class Multipul 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Number");
		int sum = scanner.nextInt();
		System.out.println(getNextMultipleOf100(sum));
		scanner.close();
	}

	public static int getNextMultipleOf100(int sum) {
		int result = 0;
		if (sum > 0) {
			int mul = sum / 100;
			int output = ((mul + 1) * 100);

			result = output;
		} else {
			result = -1;
		}
		return result;
	}

}


