package bikeShowRoom;

import java.util.Scanner;

public class Validations {
	// validate string
	static Scanner sc = new Scanner(System.in);

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

	// validate price
	public static long validatePrice(long price) {
		boolean isValid = true;
		while (isValid) {
			if (price < 1000) {
				System.out.println("invalid input:\nit should not be negative number:once again enter:");
				price = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return price;
	}
	// validate bike enginecc

	public static int validateECC(int ecc) {
		boolean isValid = true;
		while (isValid) {
			if (ecc < 0 || ecc >= 1000) {
				System.out.println("invalid input:\nit should between 1 to 1000:once again enter:");
				ecc = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return ecc;
	}

	// validate bike type
	public static String validateType(String type) {
		boolean isValid = true;
		while (isValid) {
			if (type.equalsIgnoreCase("Standard") || type.equalsIgnoreCase("Street") || type.equalsIgnoreCase("Sport")
					|| type.equalsIgnoreCase("Touring") || type.equalsIgnoreCase("SportTouring")
					|| type.equalsIgnoreCase("Cruiser")) {
				isValid = false;
			} else {
				System.out.println("invalid input:once again valid type(standard, street,sport,touring,sportTouring,cruiser):");
				type = sc.next();
			}
		}
		return type;
	}

	// get integer year
	static int getIntYear(String year) {
		char charYear[] = new char[year.length()];
		for (int i = 0; i < year.length(); i++) {
			charYear[i] = year.charAt(i);
			// System.out.println(charYear[i]);
		}
		int sum = 0;
		// ascii value for zero
		int zeroAscii = (int) '0';
		for (char c : charYear) {
			int ascii = (int) c;
			sum = (sum * 10) + (ascii - zeroAscii);
		}
		return sum;
	}

}
