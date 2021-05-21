package Assignment10;
import java.util.Scanner;
public class FileMultiples {
	 public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the number");
	        int number = scan.nextInt();
	        int[] multiples = getMultiplesArray(number);
	        for(int i=0; i<multiples.length; i++) {
	            System.out.print(multiples[i] + " ");
	            scan.close();
	        }
	    }

	    public static int[] getMultiplesArray(int number)
	    {
	        int[] multiples = new int[10];

	        if(number <= 0)
	            return null;

	        for (int i = 1; i <= 10; i++)
	        {
	            multiples[i-1] = number * i;
	        }
	        return multiples;
	    }
	}

