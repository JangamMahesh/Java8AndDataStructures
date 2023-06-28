package museum;

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

// checking entrydate
	public static String checkingDoE(String doE) {
		boolean isValid = true;
		while (isValid) {
			/*
			 * String year = ""; String actualDate = "";
			 */
			String currentDate = "12-01-2021";

			/*
			 * DoE += doE.charAt(0); DoE += doE.charAt(1); // adding date to the string DoE
			 * += doE.charAt(2); // adding month to string DoE += doE.charAt(3); DoE +=
			 * doE.charAt(4); // adding - to string DoE += doE.charAt(5); // year appending
			 * to reverseDob for (int i = 0; i < 10; i++) { DoE += doE.charAt(i); }
			 */
			if (doE.compareTo(currentDate) < 0) {
				isValid = false;
			} else {
				System.out.println("it must be past date:plz once again enter\n");
				System.out.println("enter date in :(dd-mm-yyyy) format");
				doE = sc.next();

			}

		}
		return doE;

	}

	// date validations

	public static String dateValidation(String date) {
		boolean isValid = true;
		while (isValid) {
			int count = 0;
			for (int i = 0; i < date.length(); i++) {
				if ((date.charAt(i) >= 48 && date.charAt(i) <= 57) || (date.charAt(2) == 45)
						|| (date.charAt(5) == 45)) {
					count++;
				}
			}
			/* System.out.println(count); */
			if (count == 10) {
				String dd = "";
				dd += date.charAt(0);
				dd += date.charAt(1);
				int intDD = Integer.parseInt(dd);
				String mm = "";
				mm += date.charAt(3);
				mm += date.charAt(4);
				int intMM = Integer.parseInt(mm);
				String yyyy = "";
				for (int i = 6; i < date.length(); i++) {
					yyyy += date.charAt(i);
				}
				int intYear = Integer.parseInt(yyyy);
				int maxYear = 2021;
				int minYear = 1920;
				if (minYear <= intYear && intYear <= maxYear) {
					if ((intYear % 400 == 0) || (intYear % 4 == 0) && intMM == 2) {
						if (intDD <= 29) {
							isValid = false;
						} else {
							System.out.println("enter valid date once again:");
							date = sc.next();
						}
					} else {
						if (intMM == 2) {
							if (intDD <= 28) {
								isValid = false;
							} else {
								System.out.println("enter valid date  once again MM should be 1 to 12:");
								date = sc.next();
							}
						} else if (intMM == 4 || intMM == 6 || intMM == 9 || intMM == 11) {
							if (intDD <= 30) {
								isValid = false;
							} else {
								System.out.println("enter valid date once again:");
								date = sc.next();
							}
						} else if (intMM == 1 || intMM == 3 || intMM == 5 || intMM == 7 || intMM == 8 || intMM == 10
								|| intMM == 12) {
							if (intDD <= 31) {
								isValid = false;
							} else {
								System.out.println("enter valid date once again:");
								date = sc.next();
							}

						} else {
							System.out.println("enter valid date once again:");
							date = sc.next();
						}
					}
				} else {
					System.out.println("enter valid date once again:");
					date = sc.next();
				}
			} else {
				System.out.println("enter valid date once again:");
				date = sc.next();
			}
		}
		return date;
	}

}
