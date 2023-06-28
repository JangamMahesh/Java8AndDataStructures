package ItemApplication;

import java.util.Scanner;

public class Validations {
//	string validation
	static Scanner sc = new Scanner(System.in);
	
	public static String validateString(String s) {
		boolean isValid = true;
		while (isValid) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				//int ch = (int) (s.charAt(i));
				char ch=s.charAt(i);
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
	//dot be accepted
	public static String validateStr(String s) {
		boolean isValid = true;
		while (isValid) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				//int ch = (int) (s.charAt(i));
				char ch=s.charAt(i);
				if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122 || ch==32) {
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
	
	

//	validate id
	public static int validateId(int id) {
		boolean isValid = true;
		while (isValid) {
			if (id <= 0) {
				System.out.println("Invalid input! input should not be negative numbers.Once again enter :");
				id = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return id;
	}

//validate long	
	public static long validateLong(long id) {
		boolean isValid = true;
		while (isValid) {
			if (id <= 0) {
				System.out.println("Invalid input! input should not be negative numbers.Once again enter :");
				id = sc.nextLong();
			} else {
				isValid = false;
			}
		}
		return id;
	}

//validate score
	public static float validateScore(float id) {
		boolean isValid = true;
		while (isValid) {
			if (id <= 0) {
				System.out.println("Invalid input! input should not be negative numbers.Once again enter :");
				id = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return id;
	}
//validate mobilenumber
public static String validatemobileNumber(String mno)
{
	boolean isValid = true;
	while (isValid) {
		int count = 0;
		for (int i = 0; i < mno.length(); i++) {
			//int ch = (int) (s.charAt(i));
			char ch=mno.charAt(i);
			if (ch >= 48 && ch <= 57) {
				count++;
			}
		}
		if (count != mno.length() || mno.length() < 10) {
			System.out.println("invalid input(it shou;d contain 10 digits and no characters):once again enter");
			mno = sc.next();
		} else {
			isValid = false;
		}

	}
	return mno;
}
//	validate mobile number
	public static String validateMno(String mno) {
		boolean isValid = true;
		while (isValid) {
			if (mno.matches("[0-9]+") && mno.length() == 10) {
				isValid = false;
			} else {
				System.out.println("entered mobile number is in valid! so,re enter ur mobie number:");
				mno = sc.next();
			}
		}

		return mno;
	}

//  validate rating
	public static Double validateFeedback(double feedback) {
		boolean isValid = true;
		while (isValid) {
			if (feedback < 1 || feedback > 5) {
				System.out.println("entered feedback must be in between 1 to 5.\n enter feedback:");
				feedback = sc.nextDouble();
			} else
				isValid = false;
		}

		return feedback;

	}

//  validate age
	public static int validateAge(int age) {
		boolean isValid = true;
		while (isValid) {
			if (age < 1 || age > 125) {
				System.out.println("entered age is invalid.age should be in between (1 to 125)\n re enter the age:");
				age = sc.nextInt();
			} else
				isValid = false;
		}

		return age;
	}

//	validate double
	public static double validateDouble(double id) {
		boolean isValid = true;
		while (isValid) {
			if (id <= 0) {
				System.out.println("Invalid input! input should not be negative numbers.Once again enter :");
				id = sc.nextDouble();
			} else {
				isValid = false;
			}
		}
		return id;
	}

	// validate date of birth
	public static String validateDob(String dob) {
		while (!dob.matches("((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$")) {
			System.out.println("It is invalid! re enter the date of birth(YYYY-MM-DD):");
			dob = sc.next();
		}
		return dob;
	}

	// validate time
	public static String validateTime(String time) {
		while (!time.matches("([01][0-9]|2[0-3]):(0[0-9]|[1-5][0-9])$")) {
			System.out.println("entered time is invalid.once again enter the time in HH:MM format");
			time = sc.next();
		}
		return time;
	}

//	validate account number
	public static String validateAcno(String ac_no) {
		// TODO Auto-generated method stub
		boolean isValid = true;
		while (isValid) {
			if (ac_no.matches("[0-9]+") && ac_no.length() == 10 || ac_no.length() == 15) {
				isValid = false;
			} else {
				System.out.println("entered account number is invalid! so,re enter ur account number:");
				System.out.println("account number must be either 10 or 15 digits:");
				ac_no = sc.next();
			}
		}

		return ac_no;
	}

	// validate balance
	public static float validateBalance(float balance) {
		boolean isValid = true;
		while (isValid) {
			if (balance <= 100) {
				System.out.println("balance should not less than 100! please once again enter balance:");
				balance = sc.nextFloat();
			} else {
				isValid = false;
			}
		}

		return balance;
	}

	// validate account type
	public static String validate_accountType(String str) {
		boolean isValid = true;
		while (isValid) {
			if (str.matches("[A-Za-z]+") && (str.equalsIgnoreCase("saving") || str.equalsIgnoreCase("current")
					|| str.equalsIgnoreCase("loan"))) { // System.out.println("hello");
				isValid = false;

			} else {
				System.out.println("invalid account type:please once again enter:");
				str = sc.next();
			}
		}
		return str;
	}
	//validate year
	public static int validateYear(int year)
	{
		boolean isValid=true;
		while(isValid)
		{
			if(year<=1500 || year>=2020)
			{
				System.out.println("Invalid option:year should be in between 1500 to 2020 :once agin enter");
				year=sc.nextInt();
			}
			else
			{
				isValid=false;
			}
		}
		return year;
	}
	//validate the string
	public static String validateStrings(String string) {
		boolean isValid = true;
		while (isValid) {
			int count = 0;
			for (int i = 0; i < string.length(); i++) {
				//int ch = (int) (s.charAt(i));
				char ch=string.charAt(i);
				if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122 || ch==' ') {
					count++;
				}
			}
			if (count != string.length() || string.length() < 3) {
				System.out.println("invalid input:once again enter");
				string = sc.next();
			} else {
				isValid = false;
			}
		}
		return string;
	}


}
