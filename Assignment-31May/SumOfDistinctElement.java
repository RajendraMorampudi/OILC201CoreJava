package Assignment31;
import java.util.Scanner;
public class SumOfDistinctElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of an array");
		int size = scan.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" values into an array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			scan.close();
		}
		
		System.out.println("Sum of Distinct Elements are: " + sumOfDistinctElements(arr));
	}
	public static int sumOfDistinctElements(int[] arr) {
		int sum = 0;
		boolean flag;
		
		for(int i = 0 ; i < arr.length; i++) {
			flag = true;
			for(int j = 0; j < arr.length; j++) {
				if(i != j && arr[i] == arr[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				sum +=arr[i];
			}
		}
		
		return sum;
	}
}
