package Assignment10;
import java.util.Scanner;
public class FibonacciSeries{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println("Enter the elements" + getFibonacciSeries(num));
		
		
	}
		public static String getFibonacciSeries(int num) {
			if(num < 1 || num > 90) {
				return null;
			}
			else {
				int m=0;
				int n=1;
				int p=0;
				String result = "";
				result = result + m + "," + n;
				for(int i=2; i < num; i++) {
					p = m + n;
					result = result + "," + p;
					m = n;
					n = p;
					
				}
				return result;
			}
		}
}
		