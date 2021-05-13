package assignment4;
import java.util.Scanner;
public class IsEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.err.println("Enter the Number");
		int num = scanner.nextInt();
		System.out.println(isEven(num));
		scanner.close();
	}

	public static int isEven(int num) {
		int result = 0;
		if (num <= 0) {
			result = -1;
		} else if (num % 2 == 0) {
			result = 1;
		} else {
			result = 0;
		}
		return result;

	}

}

