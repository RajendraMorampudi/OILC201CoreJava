package Assignment31;

public class SumOfModifiedElements {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8}; 
		System.out.println("Enter the Even number : " + getSumOfModifiedElements(arr)); 
}

public static int getSumOfModifiedElements(int arr[])
{
	int sum=0;
	
	for(int i =0 ;i< arr.length; i++)
	{
		if(arr[i]%2 == 0) { 
			sum = sum + arr[i]*2;
		} else {
			sum = sum + arr[i]/2;
		}
		}
	return sum;
		
	}
}