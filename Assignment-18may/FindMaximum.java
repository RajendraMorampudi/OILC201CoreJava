package Assignment10;

public class FindMaximum {
	 public static void main(String[] args) {
	        int arr[] = {25,32,-4,-6,-7};
	        System.out.println("the max is :" + findMax(arr));
	    }
	    public static int findMax(int arr[]) {
	        if(arr == null)
	            return 0;
	        else {
	            int count = 0;
	            int max = arr[0];
	            for(int i = 0; i < arr.length; i++) {
	                if(arr[i] < 0) {
	                    count++;
	                }
	                if(arr[i] > max)
	                    max = arr[i];
	            }
	            if(count < 3)
	                return -1;

	            return max;
	        }
	    }

}
