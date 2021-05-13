package assignment4;

import java.util.Scanner;
public class FindSig {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Number");
		int num = scanner.nextInt();
		System.out.println(FindSign(num));
		scanner.close();
	}

	public static int FindSign(int num) {
		int result = 0;
		if (num > 0) {
			result = 1;
		} else if (num < 0) {
			result = -1;
		} else {
			result = 0;
		}
		return result;
	}

}
 
