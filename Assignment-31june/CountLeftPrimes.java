package Assignment31;
import java.util.Scanner;
public class CountLeftPrimes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range i.e FirstNum and LastNum: ");
		
		System.out.println("Count : " + getCountOfLeftTruncatablePrimes(scan.nextInt(), scan.nextInt()));

	}
	static int getCountOfLeftTruncatablePrimes(int firstNum, int lastNum) {
		int count = 0;
		
		if(firstNum > lastNum) {
			count = -1;
		}
		else if(firstNum == 0 || lastNum == 0) {
			count = -2;
		}
		else if(firstNum < 0 || lastNum < 0) {
			count = -3;
		}
		else {
			System.out.println("The Prime Numbers are: ");
			for(int i = firstNum; i <= lastNum; i++) {
				if(isLeftTruncatablePrime(i)) {
					System.out.println(i);
					count++;
				}
			}
		}
		
		return count;
	}
	
	static boolean isLeftTruncatablePrime(int num) {
		boolean b = true;
		StringBuffer sb = new StringBuffer();
		sb.append(num);
		
		if(sb.charAt(sb.length()-1) == '1') {
			b = false;
		}
		else {
			while(sb.length() != 0) {
				int left = Integer.parseInt(sb.toString());
			
				if(sb.charAt(0) != '0' && isPrime(left)) {
					sb.deleteCharAt(0);
				}
				else {
					b = false;
					break;
				}
			}
		}
		
		return b;
	}
	
	static boolean isPrime(int num){
		boolean b = true;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				b = false;
				break;
			}
		}
		
		return b;
	}

}
