package assignment4;
import java.util.Scanner;
public class TwoDigits {
		public int getSumOfDigits(int n)
		{
			int sum=0;
			if(n>=10 && n<=99)
			{
				while (n != 0)
		        {
		            sum = sum + n % 10;
		            n = n/10;
		        }
				}
			else if(n>99)
			{
				return -2;
			}else if(n>=0 && n<=9)
			{
				return -1;
			}else 
			{
				return -3;
			}
			return sum;
		}
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			int n=s.nextInt();
				
			TwoDigits obj=new TwoDigits();
			System.out.println(obj.getSumOfDigits(n));
		}
			
		
	}

