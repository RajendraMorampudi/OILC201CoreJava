package assignment5;
import java.util.Scanner;

public class CreateBox
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int i = scan.nextInt();
        int j = scan.nextInt();

        System.out.println(createBox(i, j));
        scan.close();
    }

    public static String createBox(int n, int m) {
        if (n < 0 || m < 0) {
            return "-1";
        } else if (n == 0 || m == 0) {
            return "-2";
        } else {
            String result = "";
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (i == 1 || i == n ||
                            j == 1 || j == m)
                        result = result + "*";
                    else
                        result = result + " ";
                }
                result = result + "\n";
            }
            return result;
        }
    }
}

