package Assignment10;
import java.util.Scanner;
public class FizzBizz {
	 public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the number");
	        int i = scan.nextInt();
	        String sequence = getFizzBizz(i);
	        System.out.print(sequence);
	        scan.close();
	    }

	    public static String getFizzBizz(int num)
	    {
	        if(num <= 0)
	            return "Error";
	        else {
	            if(num%3 == 0 && num%5 == 0)
	                return "FIZZBIZZ";
	            else if(num%3 == 0)
	                return "FIZZ";
	            else if(num%5 == 0)
	                return "BIZZ";
	            else
	                return String.valueOf(num);
	        }
	    }
	}
	

