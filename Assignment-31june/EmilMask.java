package Assignment31;
import java.util.Scanner;
public class EmilMask {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter MAIL ID");
		
		System.out.println("Mask mail is: \n" +maskMailID(scan.nextLine()));
	}

	static String maskMailID(String mail) {
		StringBuffer mask = new StringBuffer(mail);
		
		for(int i = 2;mask.charAt(i) != '@';i++) {
			mask.setCharAt(i, 'X');
		}
		
		return mask.toString();
	}
}
	
	