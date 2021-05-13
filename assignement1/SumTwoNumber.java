package assignement1;
import java.util.Scanner;
public class SumTwoNumber
{
	public static void main(String args[])
	{
		int num1=5, num2=10, sum;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		num1=s.nextInt();
		
		System.out.println("Enter the second number");
		num2=s.nextInt();
		
		System.out.println();
		s.close();
		
		sum=num1 + num2;
		System.out.println(sum );
		
		
	}

}
