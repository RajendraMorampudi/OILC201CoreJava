package Assignment31;

import java.util.Scanner;

public class MorseCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.next();
		System.out.println("More code is :" +getMoreCode(str));
	}
	public static String getMoreCode(String str) {
	char arr[] = str.toCharArray();
	String str1 = "";
	for(int i =0; i < arr.length; i++) {
		switch(arr[i]) {
		case 'a'  :
			str1 = str1 + ".-";
			break;
		case 'b' :
			str1 = str1 + "-...";
			break;
		case 'c' :
			str1 = str1 + "-.-.";
			break;
		case 'd' :
			str1 = str1 + "-..";
			break;
		case 'e' :
			str1 = str1 + ".";
			break;
		case 'f' :
			str1 = str1 + "..-.";
			break;
		case 'g' :
			str1 = str1 + "..-.";
			break;
		case 'h' :
			str1 = str1 + "....";
			break;
		case 'i' :
			str1 = str1 + "..";
			break;
		case 'j' :
			str1 = str1 + ".---";
			break;
		case 'k' :
			str1 = str1 + "-.-";
			break;
		case 'l' :
			str1 = str1 + ".-..";
			break;
		case 'm' :
			str1 = str1 + "--";
			break;
		case 'n' :
			str1 = str1 + "-.";
			break;
		case 'o' :
			str1 = str1 + "---";
			break;
		case 'p' :
			str1 = str1 + ".--.";
			break;
		case 'q' :
			str1 = str1 + "--.- ";
			break;
		case 'r' :
			str1 = str1 + ".-.";
			break;
		case 's' :
			str1 = str1 + "..-.";
			break;
		case 't' :
			str1 = str1 + "-";
			break;
		case 'u' :
			str1 = str1 + "..-";
			break;
		case 'v' :
				str1 = str1 + "...-";
				break;
		case 'w' :
			str1 = str1 + ".--";
			break;
			
		case 'x' :
			str1 = str1 + "-..-";
			break;
		case 'y' :
			str1 = str1 + "-.--";
			break;
		case 'z' :
			str1 = str1 + "--..";
			break;
		}	
	}
		return str1;
		
	}

}
