package Assignment10;

public class OddCount {
	 public static void main(String[] args) {
	        int arr[] = {25,32,4,6,7};
	        System.out.println("the odd sum is :" + getOddCount(arr));
	    }
	    public static int getOddCount(int arr[]) {
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
	                    sum = sum + 1;
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
