package Assignment10;

import java.util.Scanner;
public class RussianMultiplication {
	 public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the two numbers");
	        int i = scan.nextInt();
	        int j = scan.nextInt();
	        int product = getProduct(i,j);
	        System.out.print(product);
	    }

	    public static int getProduct(int i, int j)
	    {
	        int sum = 0;
	        while(i != 0)
	        {
	            if(odd(i))
	            {
	                sum=sum+j;
	            }
	            i = i/2;
	            j = j*2;
	        }
	        return sum;
	    }

	    static boolean odd(int number1)
	    {
	        if ((number1%2)!=0)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
	}
