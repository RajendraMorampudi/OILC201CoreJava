package assignment4;

import java.util.Scanner;

public class EvenOrOdd
{
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter input integer:");
	        int i = scan.nextInt();

	        System.out.println("result:" + isEvenOrOdd(i));
	        scan.close();
	    }

	    public static String isEvenOrOdd(int i)
	    {
	        if(i <= 0)
	        {
	            return "Invalid Input";
	        }
	        else {
	            if(i%2 == 0) {
	                return "Even";
	            } else {
	                return "Odd";
	            }
	        }
	    }
	}

		