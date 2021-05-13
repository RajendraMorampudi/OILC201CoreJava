package assignment5;

public class Pattern5 
{
		public static void main(String[] args) {
			int n = 1;
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5; j++) {
					if (i >= j) {
						System.out.print(n++ + " ");
					}
				}
				System.out.println();

			}

		}
	}