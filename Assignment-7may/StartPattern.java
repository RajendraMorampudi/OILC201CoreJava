package assignment5;

import java.util.Scanner;

public class StartPattern {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter a positive number");
	        int i = scan.nextInt();

	        System.out.println(createStarPattern(i));
	        scan.close();
	    }

	    public static String createStarPattern(int n) {
	        if (n < 0) {
	            return "-1";
	        } else if (n == 0) {
	            return "-2";
	        } else {
	            String result = "";
	            for (int i = 1; i <= n; i++) {
	                for(int j=0; j<i; j++) {
	                    result = result + "*";
	                }
	                result = result + "\n";
	            }
	            return result;
	        }
	    }

}
