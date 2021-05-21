package Assignment10;

import java.util.HashSet;

public class SumOfArray {
	 public static void main(String[] args)
	    {
	        int arr[] = {1, 2, 3, 2, 4, 1};
	        System.out.println(sumOfArray(arr));
	    }

	    static int sumOfArray(int[] arr)
	    {
	        int sum = 0;

	        HashSet<Integer> s = new HashSet<Integer>();
	        for (int i = 0; i < arr.length; i++)
	        {
	            if (!s.contains(arr[i]))
	            {
	                sum += arr[i];
	                s.add(arr[i]);
	            }
	        }
	        return sum;
	    }
	}

