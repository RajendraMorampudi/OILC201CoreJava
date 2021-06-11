package Assignment31;
import java.util.Scanner;
public class convertTime {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("ENTER THE TIME");
	String str = scan.next();
	System.out.println("Enter the convert time : " + convertTime12Hrs(str));
	scan.close();

}
public static String convertTime12Hrs(String str) {
	if(str.charAt(2)!= ':' || str.charAt(5)!= ':') {
		return "INVALID TIME";
	}
	String arr[] = str.split(":");
	int hours = Integer.parseInt(arr[0]);
	String time = "";
	
	if(hours >= 12) {
		if(hours > 12) {
		hours = hours - 12;
		}
		time = "PM";
	}else {
		time = "AM";
	}
	String result = String.valueOf(hours) + ":" + arr[1] + ":" + arr[2] + " " + time;
	return result;
 }
}