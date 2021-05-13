package assignment4;
import java.util.Scanner;
public class NaturalNumber {
	 public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	        System.out.println("Enter two positive numbers");
	        int i = scan.nextInt();
	        int j = scan.nextInt();

	        System.out.println(getNaturalNumbers(i,j));
	        scan.close();
	    }

	    public static String getNaturalNumbers(int i, int j) {
	        if(i < 0 || j < 0) {
	            return "-1";
	        } else if(i == 0 || j ==0) {
	            return "-2";
	        } else {
	            String result = "";
	            while(i < j) {
	                result = result + i + " ";
	                i++;
	            }
	            result = result + j;
	            return result;
	        }
	    }
	}

