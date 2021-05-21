package Assignment10;
import java.util.Scanner;
public class GetSum {
	public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers");
        int l = scan.nextInt();
        int r = scan.nextInt();
        System.out.println(getSum(l, r));
        scan.close();
    }

    static String getSum(int l, int r)
    {
        Integer sum = 0;
        if(l <= 0 || r <= 0)
            return "ERROR";
        else {
            sum = l + r;
            return sum.toString();
        }
    }
}

