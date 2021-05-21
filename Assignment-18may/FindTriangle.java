package Assignment10;

import java.util.Scanner;

public class FindTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three sides");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		System.out.println("the triangle is :" + findTriangle(i, j, k));
	}

	public static String findTriangle(int i, int j, int k) {
		if (i == 0 || j == 0 || k == 0) {
			return "-1";
		} else if (i < 0 || j < 0 || k < 0) {
			return "-2";
		} else if ((i + j < k) || (j + k < i) || (k + i < j)) {
			return "-3";
		} else if (i == j && j == k && k == i) {
			return "EQUILATERAL";
		} else if (i == j || j == k || k == i) {
			return "ISOSCELES";
		} else {
			return "SCALENE";
		}
	}
}
