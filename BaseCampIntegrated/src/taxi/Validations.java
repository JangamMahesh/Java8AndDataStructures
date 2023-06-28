package taxi;
import java.util.Scanner;
public class Validations {
	// validate string
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

	// validate age
	public static int validateAge(int age) {
		boolean isValid = true;
		while (isValid) {
			if (age < 0 || age >= 120) {
				System.out.println("invalid input:\nit should between 1 to 120:once again enter:");
				age = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return age;
	}

//			validate gender
	public static char validateGender(char gender) {
		boolean isValid = true;
		while (isValid) {
			if (gender == 'F' || gender == 'M' || gender == 'f' || gender == 'm') {
				isValid = false;
			} else {
				System.out.println("invalid input\nit should be 'M' or 'F':once agin enter:");
				gender = sc.next().charAt(0);
			}
		}
		return gender;
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
