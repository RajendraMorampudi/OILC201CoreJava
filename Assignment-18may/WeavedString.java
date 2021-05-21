package Assignment10;

import java.util.Scanner;
public class WeavedString {
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter two strings");
	        String s1 = scan.next();
	        String s2 = scan.next();
	        System.out.println(getWeavedString(s1, s2));
	        scan.close();
	    }

	    public static String getWeavedString(String value1,String value2)
	    {
	        String total="";

	        int l1=value1.length();
	        int l2=value2.length();
	        if(l1 == 0 || l2 == 0)
	            return "-1";
	        else if(l1 > l2)
	            return value2+value1+value2;
	        else if(l1 < l2)
	            return value1+value2+value1;
	        else if(l1 == l2) {
	            for(int i = 0; i < l1; i++) {
	                total = total + value1.charAt(i) + value2.charAt(i);
	            }
	            return total;
	        } else {
	            return total;
	        }
	    }

}
