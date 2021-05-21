package Assignment10;

public class OddSum {
	public static void main(String[] args) {
		int arr[] = {25,32,4,6,7};
		System.out.println("the odd sum is :" + getOddSum(arr));
	}
	public static int getOddSum(int arr[]) {
		if(arr.length != 5)
			return -1;
		else {
			boolean flag = true;
		int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] <= 0) {
					return -2;
				}
				if(arr[i] %  2 != 0) {
					flag = false;
					sum = sum + arr[i];
				}
			}
				if(flag == true)				
					return -3;
				
				if(arr == null)
					return -4;
				
				return sum;
		}
	}		
}		