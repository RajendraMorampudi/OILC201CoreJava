package assignment4;

import java.util.Scanner;

public class RingAlarm {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Day and vacation status");
        int i = scan.nextInt();
        boolean j = scan.nextBoolean();

        System.out.println("result:" + ringAlarm(i, j));
        scan.close();
    }

    public static String ringAlarm(int i, boolean j) {
        if(i < 0 || i > 6) {
            return "Invalid Inputs";
        } else if(j != true && j != false) {
            return "Invalid Inputs";
        } else {
            if(i >= 1 && i <= 5 && j) {
                return "10:00";
            } else if(i >= 1 && i <= 5 && j == false) {
                return "07:00";
            } else if((i == 0 || i == 6) && j == true) {
                return "OFF";
            } else if((i == 0 || i == 6) && j == false) {
                return "10:00";
            } else {
                return "OFF";
            }
        }
    }
}
