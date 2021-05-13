package assignment3;

public class StudentMarks {
	public static void main(String[] args) 
	{
		int total = 0, average = 0;
		boolean flag = true;
		try {
			for (int i = 0; i < 5; i++) {
				total = total + Integer.parseInt(args[i]);
				if (Integer.parseInt(args[i]) < 35)
					flag = false;
			}
			average = total / 5;
			if (!flag) {
				System.out.println("Failed");
			} else {
				if (average >= 75) {
					System.out.println("A");
				} else if (average >= 50 && average < 75) {
					System.out.println("B");
				} else if (average >= 35 && average < 50) {
					System.out.println("C");
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Error");
		}
	}

}
