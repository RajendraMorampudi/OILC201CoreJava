package assignment5;

public class Pattern6 {
	
	public static void main(String[] args) {

		int x = 1, y = 1;
		for (int i = 1; i <= 5; i++) {
			x = y++;
			for (int j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.print(x + " ");
					x++;
				}
			}
			System.out.println();
		}

	}
}
