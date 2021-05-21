package Assignment10;
import java.util.Scanner;
public class GetPrimeNumbers {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the prime two numbers");
		int i =Scan.nextInt();
		int j = Scan.nextInt();
		System.out.println("the prime number is :" + getPrimeNumbers(i,j) );
		Scan.close();
	}
public static String getPrimeNumbers(int m,int n) {
	String result = "";

	if (m < 0 || n < 0) {
		result = "" + -1;
	} else if (m >= n) {
		result = "" + -2;
	} else {
		for (int i = m + 1; i < n; i++) {
			if (prime(i) != 0) {

				result += prime(i)+" ";

			}

		}

	}
	return result;
}

public static int prime(int num) {
	int res = 0;
	int nof = 0;

	for (int i = 1; i <= num; i++) {

		if (num % i == 0) {
			nof++;
		}
	}

	if (nof == 2) {
		res += num;
	}

	return res;

}
}
