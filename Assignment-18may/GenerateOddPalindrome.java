package Assignment10;
import java.util.Scanner;
public class GenerateOddPalindrome {
	   public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the two numbers");
	        int i = scan.nextInt();
	        int j = scan.nextInt();
	        String palindrome = getOddPalindromeList(i,j);
	        System.out.print(palindrome);
	        scan.close();
	    }

	    public static String getOddPalindromeList(int i, int j)
	    {
	        int rev_num = 0;
	        String result = "";
	        if(i <= 0 || j <= 0)
	            return "Error";
	        else if(i < 100 || i > 999 || j < 100 || j > 999)
	            return "Error";
	        else if(i >= j)
	            return "Error";
	        else {
	            for(int k = i; k <= j; k++) {
	                if(k%2 != 0) {
	                    if(isPalindrome(k)) {
	                        if(result.equals(""))
	                            result = result + k;
	                        else
	                            result = result + "," + k;
	                    }
	                }
	            }
	            return result;
	        }
	    }

	    static int reversDigits(int num)
	    {
	        int rev_num = 0;
	        while (num > 0)
	        {
	            rev_num = rev_num*10 + num%10;
	            num = num/10;
	        }
	        return rev_num;
	    }

	    static boolean isPalindrome(int num)
	    {
	        return (reversDigits(num) == num);
	    }

}
