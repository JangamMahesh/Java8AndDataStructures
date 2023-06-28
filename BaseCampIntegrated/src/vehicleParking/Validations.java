package vehicleParking;

import java.util.Scanner;

public class Validations {
	static Scanner sc = new Scanner(System.in);

	public static String vehicleNoValidation(String number) {
		boolean isValid = true;

		while (isValid) {
			int count = 0;
			if ((number.charAt(0) >= 65 && number.charAt(0) <= 90)) {
				count++;
			}
			if (number.charAt(1) >= 65 && number.charAt(1) <= 90) {
				count++;
			}
			for (int i = 2; i < number.length(); i++) {
				if (number.charAt(i) >= 48 && number.charAt(i) <= 57) {
					count++;
				}
			}
			if (count != number.length() || number.length() < 3) {
				System.out.println(
						"invalid input:\nit has first two characters with state code and remaining number\nonce again enter:");
				number = sc.next();
			} else {
				isValid = false;
			}
		}
		return number;
	}

	// validate time
	public static String validateTime(String time) {
		while (!time.matches("([01][0-9]|2[0-3]):(0[0-9]|[1-5][0-9])$")) {
			System.out.println("entered time is invalid.once again enter the time in HH:MM format");
			time = sc.next();
		}
		return time;
	}

//validate number
	public static int validateSize(int size) {
		boolean isValid = true;
		while (isValid) {
			if (size <= 0 || size >= 30) {
				System.out.println("invalid input:\nit should not contain negative numbers:once again enter:");
				size = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return size;
	}

}
