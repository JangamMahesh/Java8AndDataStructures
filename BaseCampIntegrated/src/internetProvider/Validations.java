package internetProvider;

import java.util.Scanner;

public class Validations {
	static Scanner sc = new Scanner(System.in);

	// validate string
	public static String validateString(String s) {
		boolean isValid = true;
		while (isValid) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				// int ch = (int) (s.charAt(i));
				char ch = s.charAt(i);
				if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
					count++;
				}
			}
			if (count != s.length() || s.length() < 3) {
				System.out.println("invalid input:once again enter");
				s = sc.next();
			} else {
				isValid = false;
			}

		}
		return s;
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

	// validate mobilenumber
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

// validate price
	public static float validatePrice(float price) {
		boolean isValid = true;
		while (isValid) {
			if (price < 1000) {
				System.out.println("invalid input:\nit should not be negative number:once again enter:");
				price = sc.nextFloat();
			} else {
				isValid = false;
			}
		}
		
		
		return price;
	}

// validate plan name
	public static String validatePlanName(String s) {
		boolean isValid = true;
		while (isValid) {
			if (s.equalsIgnoreCase("2GB") || s.equalsIgnoreCase("3GB") || s.equalsIgnoreCase("4GB")) {
				isValid = false;
			}
			/*
			 * for (int i = 0; i < s.length(); i++) { // int ch = (int) (s.charAt(i)); char
			 * ch = s.charAt(i); if (ch >= 48 && ch <= 57) { count++; } }
			 */
			else {
				System.out.println("invalid input:once again enter:it must have digits(ex: 4GB ,2GB,3GB)");
				s = sc.nextLine();
			}

		}
		return s;
	}

// validate internet speed
	public static double validateISpeed(double netSpeed) {
		boolean isValid = true;
		while (isValid) {
			if (netSpeed < 0 || netSpeed >= 500) {
				System.out.println(
						"invalid input:\nit should not be negative number and range must be in 0 to 500:once again enter:");
				netSpeed = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return netSpeed;
	}

// validate price plan
	public static float validatePricePlan(float price) {
		boolean isValid = true;
		while (isValid) {
			if (price <= 10 || price >= 5000) {
				System.out.println(
						"invalid input:\nit should not be negative number and range must be in 10 to 5000:once again enter:");
				price = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		
		return price;
	}
}
