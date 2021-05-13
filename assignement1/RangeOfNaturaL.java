package assignement1;
import java.util.Scanner;
public class RangeOfNaturaL {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two positive number");
		scan.getClass();
		int i=scan.nextInt();
		int j=scan.nextInt();
		System.out.println(getNumbersInRange(i,j));
	}
	public static String getNumbersInRange(int i,int j) {
		if(i<0 || j<0) {
			return "1";
		}else if(i==j) {
			return "-2";
		}else if(i>j) {
			return "-3";
		}else {
			String result="";
			for(int k=i+1; k<j;k++) {
				result = result + k+"";
			}
			return result;
			}
		}
		
	}
