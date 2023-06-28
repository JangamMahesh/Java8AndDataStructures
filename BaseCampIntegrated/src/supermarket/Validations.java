package supermarket;

import java.util.Scanner;

public class Validations {
	static Scanner sc = new Scanner(System.in);

//validate mobilenumber
	public static String validatemobileNumber(String mno) {
		boolean isValid = true;
		while (isValid) {
			int count = 0;
			for (int i = 0; i < mno.length(); i++) {
				// int ch = (int) (s.charAt(i));
				char ch = mno.charAt(i);
				if (ch >= 48 && ch <= 57) {
					count++;
				}
			}
			if (count != mno.length() || mno.length() < 10) {
				System.out.println("invalid input(it should contain 10 digits and no characters):once again enter");
				mno = sc.next();
			} else {
				isValid = false;
			}

		}
		return mno;
	}

	public static double validateDiscount(double nextInt) {
		boolean isValid = true;
		while (isValid) {
			if (nextInt <= 0) {
				System.out.println("invalid input:\nit should be positive :once again enter:");
				nextInt = sc.nextDouble();
			} else {
				isValid = false;
			}
		}
		return nextInt;
	}

	// validate integer
	public static int validateInt(int number) {
		boolean isValid = true;
		while (isValid) {
			if (number <= 0) {
				System.out.println("invalid input:\nit should not contain negative numbers:once again enter:");
				number = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return number;
	}
	// validate double
		public static double validateDouble(double wt) {
			boolean isValid = true;
			while (isValid) {
				if (wt <= 0) {
					System.out.println("invalid input:\nit should not be negative number:once again enter:");
					wt = sc.nextDouble();
				} else {
					isValid = false;
				}
			}
			return wt;
		}
}
