package Assignment31;
import java.util.Scanner;
public class SumOfDigit {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Double Number:");
		double num=scan.nextDouble();
		
		System.out.println(getSumOfDigits(num));
		scan.close();
	}

	private static String getSumOfDigits(double num) 
	{
		String number=Double.toString(num);
		String arr[]=number.split("[.]");
		int value=Integer.parseInt(arr[0]);
		int decvalue=Integer.parseInt(arr[1]);
		
		int valsum=sum(value);
		int decsum=sum(decvalue);
		
		
		return valsum+":"+decsum;
	}

	private static int sum(int num) 
	{
		int sum = 0;
		int temp = 0;
		while(num > 0) {
			temp = num%10;
			sum += temp;
			num = num/10;
		}
		return sum;
	}
}
