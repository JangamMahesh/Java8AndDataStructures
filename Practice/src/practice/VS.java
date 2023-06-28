package practice;

import java.util.Scanner;

public class VS {
	// vehicle number validation
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

	// validate bike type
	public static String validateType(String type) {
		boolean isValid = true;
		while (isValid) {
			if (type.equalsIgnoreCase("Standard") || type.equalsIgnoreCase("Street") || type.equalsIgnoreCase("Sport")
					|| type.equalsIgnoreCase("Touring") || type.equalsIgnoreCase("SportTouring")
					|| type.equalsIgnoreCase("Cruiser")) {
				isValid = false;
			} else {
				System.out.println("invalid input:once again valid type:");
				type = sc.next();
			}
		}
		return type;
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

	// validate plan name
	public static String validatePlanName(String s) {
		boolean isValid = true;
		while (isValid) {
			int count = 0;
			if (s.equalsIgnoreCase("unlimited calls") || s.equalsIgnoreCase("data") || s.equalsIgnoreCase("message")) {
				isValid = false;
			}
			/*
			 * for (int i = 0; i < s.length(); i++) { // int ch = (int) (s.charAt(i)); char
			 * ch = s.charAt(i); if (ch >= 48 && ch <= 57) { count++; } }
			 */
			else {
				System.out.println("invalid input:once again enter:it must have digits(ex:149)");
				s = sc.next();
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
	public static int validatePricePlan(int price) {
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

	// validate weight
	public static double validateWt(double wt) {
		boolean isValid = true;
		while (isValid) {
			if (wt <= 0 || wt >= 10) {
				System.out.println("invalid input:\nit should between 1 to 10:once again enter:");
				wt = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return wt;
	}

	// validate weight
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

	// validate marks
	public static double validateMarks(double wt) {
		boolean isValid = true;
		while (isValid) {
			if (wt <= 0 || wt >= 100) {
				System.out.println("invalid input:\nit should between 1 to 100:once again enter:");
				wt = sc.nextDouble();
			} else {
				isValid = false;
			}
		}
		return wt;
	}

	// date of birth checking using if else
	public static String checkingDob(String validDob) {
		boolean isValid = true;
		while (isValid) {
			String year = "";
			String actualDate = "";
			String currentDate = "2020-12-10";
			String reverseDOb = "";
			// year appending to reverseDob
			for (int i = 6; i < 10; i++) {
				reverseDOb += validDob.charAt(i);
			}
			// adding - to string
			reverseDOb += validDob.charAt(5);
			// adding month to string
			reverseDOb += validDob.charAt(3);
			reverseDOb += validDob.charAt(4);
			// adding date to the string
			reverseDOb += validDob.charAt(2);
			reverseDOb += validDob.charAt(0);
			reverseDOb += validDob.charAt(1);

			if (reverseDOb.compareTo(currentDate) < 0) {
				// int intYear;
				// int intYear1;

				// getting year from date
				// for (int i = 0; i <= 3; i++) {
				// year += currentDate.charAt(i);
				// }
				// intYear = getIntYear(year);
				// System.out.println(intYear);
				// intYear = Integer.parseInt(year);
				// intYear1 = intYear - 1;
				// System.out.println("year:"+intYear1);
				// actualDate += Integer.toString(intYear1);
				// actualDate += intYear1;
				// remaining date mm and dd
				// for (int i = 4; i <10; i++) {
				// actualDate += currentDate.charAt(i);
				// }
				// comparing with actual date
				// if (reverseDOb.compareTo(actualDate) < 0) {
				// System.out.println("yes valid");
				isValid = false;
				// } else {
				// System.out.println("age should be one year:");
				// System.out.println("enter date of birth:(dd-mm-yyyy)");
				// String dob = sc.next();
				// validDob = dateValidation(dob);
				// }
			} else {
				System.out.println("it must be past date:plz once again enter\n");
				System.out.println("enter date of birth:(dd-mm-yyyy)");
				String dob = sc.next();
				validDob = dateValidation(dob);
			}
		}
		// System.out.println("date checking:"+validDob);
		return validDob;
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
				int maxYear = 2020;
				int minYear = 1920;
				if (minYear <= intYear && intYear <= maxYear) {
					if ((intYear % 400 == 0) || (intYear % 4 == 0) && intMM == 2) {
						if (intDD <= 29) {
							isValid = false;
						} else {
							System.out.println("enter valid dateofbirth once again:");
							date = sc.next();
						}
					} else {
						if (intMM == 2) {
							if (intDD <= 28) {
								isValid = false;
							} else {
								System.out.println("enter valid dateofbirth once again MM should be 1 to 12:");
								date = sc.next();
							}
						} else if (intMM == 4 || intMM == 6 || intMM == 9 || intMM == 11) {
							if (intDD <= 30) {
								isValid = false;
							} else {
								System.out.println("enter valid dateofbirth once again:");
								date = sc.next();
							}
						} else if (intMM == 1 || intMM == 3 || intMM == 5 || intMM == 7 || intMM == 8 || intMM == 10
								|| intMM == 12) {
							if (intDD <= 31) {
								isValid = false;
							} else {
								System.out.println("enter valid dateofbirth once again:");
								date = sc.next();
							}

						} else {
							System.out.println("enter valid dateofbirth once again:");
							date = sc.next();
						}
					}
				} else {
					System.out.println("enter valid dateofbirth once again:");
					date = sc.next();
				}
			} else {
				System.out.println("enter valid dateofbirth once again:");
				date = sc.next();
			}
		}
		return date;
	}

	// get integer year
	private static int getIntYear(String year) {
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

	// movie rating validation
	public static double validateRating(double rating) {
		boolean isValid = true;
		while (isValid) {
			if (rating < 0 || rating > 5) {
				System.out.println("invalid input:\nit should between 1 to 5:once again enter:");
				rating = sc.nextDouble();
			} else {
				isValid = false;
			}
		}
		return rating;
	}

	// valiadte service type
	public static String validateServiceType(String service) {
		String array[] = { "Hair Style", "Trim", "Hair cut", "Manicure" };
		boolean isValid = true;
		while (isValid) {
			int found = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i].equalsIgnoreCase(service)) {
					found = 1;
				}
			}
			if (found == 0) {
				System.out.println("invalid input:it must be(hair style,hair cut,manicure,trim):once again enter");
				service = sc.nextLine();
			} else {
				isValid = false;
			}
		}
		return service;
	}
	// valiadte type

	public static String validateType1(String service) {
		String array[] = { "NewsPaper", "Magazine" };
		boolean isValid = true;
		while (isValid) {
			int found = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i].equalsIgnoreCase(service)) {
					found = 1;
				}
			}
			if (found == 0) {
				System.out.println("invalid input:it must be(newspaper,magazine):once again enter");
				service = sc.next();
			} else {
				isValid = false;
			}
		}
		return service;
	}
	// valiadate language

	public static String validateLanguage(String service) {
		String array[] = { "Telugu", "English", "Hindhi", "Marati", "Tamil", "Kannada" };
		boolean isValid = true;
		while (isValid) {
			int found = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i].equalsIgnoreCase(service)) {
					found = 1;
				}
			}
			if (found == 0) {
				System.out.println(
						"invalid input:it must be(telugu,hindhi,english,marati,tamil,kannada):once again enter");
				service = sc.next();
			} else {
				isValid = false;
			}
		}
		return service;
	}

	// validate service cost
	public static int validateServiceCost(int cost) {
		boolean isValid = true;
		while (isValid) {
			if (cost <= 10 || cost >= 5000) {
				System.out.println("invalid input:\nit should not contain negative numbers:once again enter:");
				cost = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return cost;
	}
	// validate time

	public static int validateTime(int time) {
		boolean isValid = true;
		while (isValid) {
			if (time <= 0 || time >= 200) {
				System.out.println("invalid input:\nit should not contain negative numbers:once again enter:");
				time = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return time;
	}

	// validate time
	public static String validateTimings(String time) {
		boolean isValid = true;
		while (isValid) {
			int count = 0;
			for (int i = 0; i < time.length(); i++) {
				if ((time.charAt(i) >= 48 && time.charAt(i) <= 57) || time.charAt(2) == 58) {
					count++;
				}
			}
			if (count == time.length() && time.length() == 5) {
				String HH = "";
				HH += time.charAt(0);
				HH += time.charAt(1);
				String MM = "";
				MM += time.charAt(3);
				MM += time.charAt(4);
				int hour = getIntYear(HH);
				int minute = getIntYear(MM);
				if (hour > 0 && hour <= 24) {
					if (minute >= 0 && minute <= 59) {
						isValid = false;
					} else {
						System.out.println("once again enter:minutes should be in between 0 to 59");
						time = sc.next();
					}
				} else {
					System.out.println("once again enter:hour should be in between 1 to 24");
					time = sc.next();
				}
			} else {
				System.out.println("invalid input:once again enter");
				time = sc.next();
			}
		}
		return time;
	}

	// validate membership type
	public static String validateMemberShip(String service) {
		String array[] = { "Premium", "Gold", "Silver", "other" };
		boolean isValid = true;
		while (isValid) {
			int found = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i].equalsIgnoreCase(service)) {
					found = 1;
				}
			}
			if (found == 0) {
				System.out.println("invalid input:it must be(Premium,Gold,Silver,other):once again enter");
				service = sc.next();
			} else {
				isValid = false;
			}
		}
		return service;
	}
}
