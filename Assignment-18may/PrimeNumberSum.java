package Assignment10;
import java.util.Scanner;
public class PrimeNumberSum {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the integers");
		int i = sc.nextInt();
		int j =sc.nextInt();
		System.out.println(getPrimeNumbersSum(i, j));
		sc.close();
    }
 static boolean checkPrime(int numberToCheck)
    {
        if(numberToCheck == 1) {
            return false;
        }
        for (int i = 2; i*i <= numberToCheck; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int getPrimeNumbersSum(int l, int r)
    {
        int sum = 0;
        if(l == 0 || r == 0)
            return -2;
        else if(l < 0 || r < 0)
            return -1;
        else if(l >= r)
            return -3;
        else {
            for (int i = r; i >= l; i--) {
                // Check for prime
                boolean isPrime = checkPrime(i);
                if (isPrime) {
                    // Sum the prime number
                    sum = sum + i;
                }
            }
        }
        return sum;
    }

}
