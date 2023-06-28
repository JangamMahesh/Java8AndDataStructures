package com.mindtree.utilities;

import java.util.Scanner;

public class Validations {
	static Scanner sc = new Scanner(System.in);

	public static float validateFloat(float nextFloat) {
		// TODO Auto-generated method stub
		boolean isValid = true;
		while (isValid) {
			if (nextFloat <= 0) {
				System.out.println("invalid input:\nit should not contain negative numbers:once again enter:");
				nextFloat = sc.nextFloat();
			} else {
				isValid = false;
			}
		}
		return nextFloat;
	}

	// validate number
	public static int validateSize(int size) {
		boolean isValid = true;
		while (isValid) {
			if (size <= 0 ) {
				System.out.println("invalid input:\nit should not contain negative numbers:once again enter:");
				size = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return size;
	}

	// validate string
	public static String validateString(String s) {
		boolean isValid = true;
		while (isValid) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				// int ch = (int) (s.charAt(i));
				char ch = s.charAt(i);
				if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122 ||ch==32) {
					count++;
				}
			}
			if (count != s.length() || s.length() < 3) {
				System.out.println("invalid input:once again enter");
				s = sc.nextLine();
			} else {
				isValid = false;
			}

		}
		return s;
	}
}
