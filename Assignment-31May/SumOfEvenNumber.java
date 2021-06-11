package Assignment31;

public class SumOfEvenNumber {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Enter the Even number : " +getSumOfEvenNumber(arr));
	}
public static int getSumOfEvenNumber(int arr[]) {
	int sum =0;
	
	for(int i =0; i < arr.length;i++)
	{
		if(arr[i]%2 == 0)
			sum =sum + arr[i];
	}
	return sum;		
		
		
	}
	
}

