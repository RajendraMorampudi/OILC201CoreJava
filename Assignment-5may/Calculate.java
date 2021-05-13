package assignment4;
import java.util.Scanner;
public class Calculate {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input integer:");
        int i = scan.nextInt();

        System.out.println("result:" + calculate(i));
        scan.close();
    }

    public static int calculate(int i) {
        if(i <= 0) {
            return -1;
        } else {
            if(i%2 == 0) {
                i = i*i;
            } else {
                i = i*i*i;
            }
        }
        return i;
    }
}

