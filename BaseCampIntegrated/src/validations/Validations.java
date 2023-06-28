package validations;


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
					wt = sc.nextInt();
				} else {
					isValid = false;
				}
			}
			return wt;
		}
		// validate number
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
//		validate gender
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
	// validate infant age
		public static double validateInfant(double age) {
			boolean isValid = true;
			while (isValid) {
				if (age < 0 || age >= 25) {
					System.out.println("invalid input:\nit should between 1 to 25:once again enter:");
					age = sc.nextInt();
				} else {
					isValid = false;
				}
			}
			return age;
		}
}
