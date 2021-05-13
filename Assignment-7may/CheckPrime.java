package assignment5;

import java.util.Scanner;
public class CheckPrime {
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter a positive number");
	        int i = scan.nextInt();

	        System.out.println(checkPrime(i));
	        scan.close();
	       
	    }

	    public static String checkPrime(int n) {
	        if (n < 0) {
	            return "-1";
	        } else if (n == 0 || n == 1) {
	            return "-2";
	        } else {
	            String result = "";
	            boolean flag = false;
	            for (int i = 2; i <= n / 2; ++i) {
	           
	                if (n % i == 0) {
	                    flag = true;
	                    break;
	                }
	            }
	            if(flag) {
	                return "false";
	            } else {
	                return "true";
	            }
	        }
	    }
	}
