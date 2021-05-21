package Assignment10;
import java.util.Scanner;
public class TwinPrimes {
	  public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the two numbers");
	        int i = scan.nextInt();
	        int j = scan.nextInt();
	        String twinPrimes = getTwinPrimes(i,j);
	        System.out.print(twinPrimes);
	        scan.close();
	    }

	    public static String getTwinPrimes(int i, int j)
	    {
	        String result = "";
	        if(i <= 0 || j <= 0)
	            return "Error";
	        else if(i > 100 || j > 100)
	            return "Error";
	        else if(i >= j)
	            return "Error";
	        else {
	            for(int k = i; k <= j; k++) {
	                if(isPrime(k) && isPrime(k+2)) {
	                    result = result + k + "," + (k+2) + ";";
	                }
	            }
	            return result;
	        }
	    }

	    public static boolean isPrime(int n)
	    {
	        boolean f = true;
	        for (int i = 2; i <= n / 2; i++) {
	            if (n % i == 0) {
	                f = false;
	                break;
	            }
	        }

	        return f;
	    }

}
