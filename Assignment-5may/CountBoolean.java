package assignment4;

import java.util.Scanner;

public class CountBoolean {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three boolean values");
        boolean i = scan.nextBoolean();
        boolean j = scan.nextBoolean();
        boolean k = scan.nextBoolean();

        System.out.println("result:" + countBoolean(i, j, k));
        scan.close();
    }

    public static boolean countBoolean(boolean i, boolean j, boolean k) {
        if(i) {
            if(j) {
                return true;
            } else if(k) {
                return true;
            } else {
                return false;
            }
        } else if(j) {
            if(k) {
                return true;
            } else {
                return false;
            }
        } else{
            return false;
        }
    }
}

