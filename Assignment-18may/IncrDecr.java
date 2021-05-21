package Assignment10;
import java.util.Scanner;
public class IncrDecr {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = scan.nextInt();
        int[] result = getIncreaseDecrease(i);
        for(int j = 0; j < result.length; j++) {
            System.out.print(result[j] + " ");
            scan.close();
        }
    }
    public static int[] getIncreaseDecrease(int num) {
        if(num <= 1 || num > 20)
            return null;
        else {
            int arr[] = new int[num];
            int j = 0;
            for(int i = 0; i < arr.length; i = i + 2) {
                arr[i] = j + 1;
                if(i+1 < arr.length)
                    arr[i+1] = num - j;
                j++;
            }
            return arr;
        }
    }
}
