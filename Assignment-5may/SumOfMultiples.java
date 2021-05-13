package assignment4;

import java.util.Scanner;

public class SumOfMultiples {
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter three input integers");
	        int i = scan.nextInt();
	        int j = scan.nextInt();
	        int k = scan.nextInt();

	        System.out.println("result:" + sumOfMultiples(i, j, k));
	        scan.close();
	    }

	    public static int sumOfMultiples(int i, int j, int k) {
	        if(i <= 0 || j <= 0 || k <= 0) {
	            return -1;
	        } else {
	            if(i%10 > 0) {
	                i = ((i/10) * 10) + 10;
	            }

	            if(j%10 > 0) {
	                j = ((j/10) * 10) + 10;
	            }

	            if(k%10 > 0) {
	                k = ((k/10) * 10) + 10;
	            }
	        }
	        return i + j + k;
	    }
	}
