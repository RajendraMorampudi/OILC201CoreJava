package Assignment31;
import java.util.Scanner;
public class SumOfEvenNum {
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter values  range:");
			int size = scan.nextInt();
			int[] arr = new int[size];
			
			System.out.println("Enter Values into an array");
			for(int i = 0; i < size; i++) {
				arr[i] = scan.nextInt();
				scan.close();
			}
			
			System.out.println("Sum Of Even Numbers is : " + getSumOfEvenNumbers(arr));
		}

public static int getSumOfEvenNumbers(int[] arr) {
			int result = 0;
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 == 0) {
					result += arr[i];
				}
			}
			
			return result;
		}
		
		
}