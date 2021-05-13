package assignment5;
import java.util.Scanner;
public class FourPerLine {
	
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a positive number");
    int i = scan.nextInt();

    System.out.println(getFourPerLine(i));
    scan.close();
}

public static String getFourPerLine(int i) {
    if(i < 0) {
        return "-1";
    } else if(i == 0) {
        return "-2";
    } else if(i > 99) {
        return "-3";
    } else {
        String result = "";
        for(int j=1; j<=i; j++) {
            result = result + j + " ";
            if(j%4 == 0)
                result = result + "\n";
        }
        return result;
    }
}
}

