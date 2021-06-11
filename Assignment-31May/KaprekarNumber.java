package Assignment31;
import java.util.Scanner;
public class KaprekarNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int i =scan.nextInt();
}
public static String isKaprekarNumber(int i) {
	String res = "";
	
	if (i < 0) {
		res += -1;
	}
	else if (i == 0) {
		res += -2;
	} 
	else {
		int square = i * i;

		String str = Integer.toString(square);
		int len = str.length();
		int quo = len / 2;
		String first = str.substring(0, quo);
		String second = str.substring(quo);

		int total = Integer.parseInt(first) + Integer.parseInt(second);
		if (i == total) {
			res = "True";
		} else {
			res = "False";
		}
	}

	return res;
}
}
