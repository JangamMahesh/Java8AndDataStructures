package realState;

import java.util.Scanner;

public class ValidatingInputs {
	static Scanner sc = new Scanner(System.in);

	public static String validatingBuying(String string) {
		String array[] = { "To Let", "For Sale" };
		boolean isValid = true;
		while (isValid) {
			int found = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i].equalsIgnoreCase(string)) {
					found = 1;
				}
			}
			if (found == 0) {
				System.out.println("invalid input:it must be(to let,for sale):once again enter");
				string = sc.nextLine();
			} else {
				isValid = false;
			}
		}
		return string;
	}

	public static String validatinType(String string) {
		String array[] = { "1BHK", "2BHK", "3BHK" };
		boolean isValid = true;
		while (isValid) {
			int found = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i].equalsIgnoreCase(string)) {
					found = 1;
				}
			}
			if (found == 0) {
				System.out.println("invalid input:it must be(1BHK,2BHK,3BHK):once again enter");
				string = sc.nextLine();
			} else {
				isValid = false;
			}
		}
		return string;
	}

	public static String validatinHouseType(String string) {
		String array[] = { "Apartment flat", "Individual house" };
		boolean isValid = true;
		while (isValid) {
			int found = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i].equalsIgnoreCase(string)) {
					found = 1;
				}
			}
			if (found == 0) {
				System.out.println("invalid input:it must be(Apartment flat,Individual house):once again enter");
				string = sc.nextLine();
			} else {
				isValid = false;
			}
		}
		return string;
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
}
