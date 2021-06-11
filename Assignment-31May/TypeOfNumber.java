package Assignment31;
import java.util.Scanner;
public class TypeOfNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		
		System.out.println(sumOfProperDivisors(scan.nextInt()));

	}
	public static String sumOfProperDivisors(int num) {
		String res = "";
		int sum = 0;
		
		if(num == 0) {
			res += -1;
		}
		else if(num < 0) {
			res += -2;
		}
		else {
			for(int i = 1; i < num; i++) {
				if(num % i == 0) {
					sum += i;
				}
			}
		
			if(sum == num) {
				res = "Perfect Number";
			}
			else if(sum < num) {
				res = "Deficient Number";
			}
			else {
				res = "Abundant Number";
			}
		}
		
		return res;
	}

}
