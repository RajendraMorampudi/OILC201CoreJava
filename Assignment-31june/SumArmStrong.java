package Assignment31;
import java.util.Scanner;
public class SumArmStrong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Starting and Ending Numbers");
		System.out.println("The Sum Of Odd ArmStrong number is : " + getRange(scan.nextInt(), scan.nextInt()));
		scan.close();
	}

	public static int getRange(int num1, int num2) {

		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			if (getArm(i)) {

				if (i % 2 != 0) {
					System.out.println(i);
					sum += i;

				}
			}

		}
		return sum;
	}

	public static boolean getArm(int num) {
		boolean b = false;
		int temp = num;
		int num2 = 0;

		while (num != 0) {
			int a = num % 10;
			num = num / 10;
			num2 = num2 + (a * a * a);
		}
		if (temp == num2) {
			b = true;
		}
		return b;
	}


}
