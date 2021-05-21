package Assignment10;
import java.util.Scanner;
public class CollatzSequence {
	public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = scan.nextInt();
        String sequence = getCollatzSequence(i);
        System.out.print(sequence);
        scan.close();
    }

    public static String getCollatzSequence(int num)
    {
        if(num <= 0)
            return "ERROR";
        else {
            String s = "";
            int count = 0;
            while(num != 1) {
                if(count >= 100) {
                    s = "Does not Converge";
                    break;
                }
                s = s + num + " ";
                if(num % 2 == 0) {
                    num = num/2;
                } else if(num % 2 != 0) {
                    num = (num * 3) + 1;
                }
                count++;
            }
            if(num == 1)
                s = s + num;
            return s;
        }
    }
}

