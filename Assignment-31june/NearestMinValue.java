package Assignment31;

public class NearestMinValue {
	public static void main(String args[]) {

int arr[] = {1,4,5,-23,24};
		System.out.println("enter the minimum value :" + getNearestMinValue(arr));
	}
	
	public static int getNearestMinValue(int arr[]) 
	{ 
		
		int min = arr[0];
		for(int i =0; i <arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		return (min - 1);
	}
}

