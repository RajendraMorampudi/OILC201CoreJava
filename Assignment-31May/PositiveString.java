package Assignment31;
import java.util.Scanner;
public class PositiveString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = scan.next();
		System.out.println("Enter string  positive or not:" + isPositiveString(str));
		scan.close();
	}
public static boolean isPositiveString(String str) {
	str = str.toUpperCase();
	boolean result = true;
	char arr[] = str.toCharArray();
	for(int i=0; i < arr.length - 1; i++) {
		if(arr[i] > arr[i+1]) {
			result = false;
		}
		
	}
	return result;
	
	
}
}


