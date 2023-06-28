package BankApplication;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import ItemApplication.Validations;

public class MainMethod {
	static Scanner sc = new Scanner(System.in);
	static Validations validation = new Validations();

	public static void main(String[] args) {
		System.out.println("********WELCOME TO BANKING APPLICATION**********\n");
		System.out.println("enter no of customers:");
		int number = sc.nextInt();
		int validNumber = validation.validateId(number);
		Bank[] bank = new Bank[validNumber];

		int op;
		do {
			// System.out.println("choose option:\n1.add user
			// details\n2.Display\n3.Update\n4.Delete\n5.exit\n");
			System.out.println("choose option:\n1.add User Details\n2.Update\n3.Delete\n4.display details\n5.exit\n");
			System.out.println("enter an option:");
			op = sc.nextInt();

			switch (op) {
			/*
			 * case 1: System.out.println("enter no of customers:"); int number =
			 * sc.nextInt(); int validNumber = validation.validateId(number); bank = new
			 * Bank[validNumber]; createBankUser(bank); break;
			 */
			case 1:
				createBankUser(bank);
				/* displayUserDetails(bank); */
				break;
			case 2:
				if (bank == null) {
					System.out.println("Sorry ,List is empty!!\n");
				} else {
					updateDetails(bank);
				}
				break;
			case 3:
				if (bank == null) {
					System.out.println("No records!!\n");
				} else {
					deleteDetails(bank);
				}
				break;
			case 4:
			displayUserDetails(bank);
			break;
			case 5:
				break;
			default:
				System.out.println("Invalid option");
			}

		} while (op != 4);
	}

//	delete user details
	private static void deleteDetails(Bank[] bank) {
		int flag = 0;
		System.out.println("enter the account number that u delete the details:");
		String ac_no = sc.next();
		String valid_acno = validation.validateAcno(ac_no);
		for (int i = 0; i < bank.length; i++) {
			if (bank[i].getBalance() != 0) {
				if (bank[i].getAccountNo().equals(valid_acno)) {
					flag = 1;
					bank[i].setAccountNo(null);
					bank[i].setAccountType(null);
					bank[i].setAddress(null);
					bank[i].setName(null);
					bank[i].setDob(null);
					bank[i].setBalance(0);
					// bank[i]=null;
					System.out.println("===DELETED SUCCESSFULLY!!==\n");
				}
			}
		}
		if (flag == 0) {
			System.out.println("No matching record found!!\n");
		}
	}

	// update details
	private static void updateDetails(Bank[] bank) {
		int op;
		int flag = 0;
		System.out.println("enter the account number that u update the details:");
		String ac_no = sc.next();
		String valid_acno = validation.validateAcno(ac_no);
		for (int i = 0; i < bank.length; i++) {
			if (bank[i].getBalance() != 0) {
				if (bank[i].getAccountNo().equals(valid_acno)) {
					flag = 1;
					System.out.println(
							"\n choose an option\n1.Update the name\n2.update the address\n3.update name and address\n4.exit\n");
					System.out.println("enter an option:");
					op = sc.nextInt();
					switch (op) {
					case 1:
						System.out.println("enter user name");
						String name = sc.next();
						String valid_name = validation.validateString(name);
						bank[i].setName(valid_name);
						System.out.println("====UPDATE SUCCESSFULLY===\n");
						break;
					case 2:
						System.out.println("enter new address of user:");
						String address = sc.next();
						String valid_address = validation.validateString(address);
						bank[i].setAddress(valid_address);
						System.out.println("====UPDATE SUCCESSFULLY===\n");
						break;
					case 3:
						System.out.println("enter user name");
						String name1 = sc.next();
						String valid_name1 = validation.validateString(name1);
						bank[i].setName(valid_name1);
						System.out.println("enter new address of user:");
						String address1 = sc.next();
						String valid_address1 = validation.validateString(address1);
						bank[i].setAddress(valid_address1);
						System.out.println("====UPDATE SUCCESSFULLY===\n");
						break;
					case 4:
						break;
					default:
						System.out.println("invalid option");
					}
				}
			}
		}
		if (flag == 0) {
			System.out.println("no records found\n");
		}

	}

	// display details
	// a. Display user details based on ID
	// b. Display user details based on Name
	// c. Display all users who have non-zero balance
	// d. Display user sorted based on address (location wise)
	// e. Display users sorted based on account id
	private static void displayUserDetails(Bank[] bank) {
		int op;
		do {
			System.out.println(
					"\nChoose an option:\n1.display user details based on ID:\n2.Display user details based on Name\n3.Display all users who have non-zero balance\n4.Display users sorted based on account id\n5.Display user sorted based on address\n6.exit\n");
			System.out.println("enter the option");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("===DISPLAY USER DETAILS BASED ON ID===\n");
				System.out.println("enter your account number");
				String acno = sc.next();
				String validAcno = validation.validateAcno(acno);
				accountnumberSearching(bank, validAcno);
				break;
			case 2:
				System.out.println("===DISPLAY USER DETAILS BASED ON NAME===\n");
				System.out.println("enter name of the user:\n");
				String name = sc.next();
				String validName = validation.validateString(name);
				userBasedOnName(bank, validName);
				break;
			case 3:
				System.out.println("===DISPLAY USER DETAILS BASED WHO HAS NON-ZERO BALANCE==\n");
				checkNonZeroBalance(bank);
				// System.out.println("===THANK YOU===\n");
				break;
			case 4:
				System.out.println("====DISPLAY USERS SORTED BASED ON ACCOUNT ID===\n");
//				System.out.println("["+"Account_number"+","+"Username"+","+"Account_type"+","+"date of birth"+","+"Balance"+","+"Address"+"]");
				Bank acnoSorting[] = accountNumberSorting(bank);
				for (int i = 0; i < acnoSorting.length; i++) {
					// System.out.println(acnoSorting[i]);
					System.out.println("Bank [accountNo=" + acnoSorting[i].getAccountNo() + ", name="
							+ acnoSorting[i].getName() + ", accountType=" + acnoSorting[i].getAccountType() + ", dob="
							+ acnoSorting[i].getDob() + ", balance=" + acnoSorting[i].getBalance() + ", address="
							+ acnoSorting[i].getAddress() + "]");
				}
				break;
			case 5:
				System.out.println("===DISPLAY USER SORTED BASED ON ADDRESS===\n");
				Bank addressSort[] = AddressSorting(bank);
				for (int i = 0; i < addressSort.length; i++) {
					// System.out.println(addressSort[i]);
					System.out.println("Bank [accountNo=" + addressSort[i].getAccountNo() + ", name="
							+ addressSort[i].getName() + ", accountType=" + addressSort[i].getAccountType() + ", dob="
							+ addressSort[i].getDob() + ", balance=" + addressSort[i].getBalance() + ", address="
							+ addressSort[i].getAddress() + "]");

				}
				break;
			case 6:
				break;
			default:
				System.out.println("Invalid option");
			}
		} while (op != 6);

	}

	// d. Display user sorted based on address (location wise)
	private static Bank[] AddressSorting(Bank[] bank) {
		// bubble sort
		for (int i = 0; i < bank.length; i++) {
			for (int j = 0; j < bank.length - i - 1; j++) {
				if (bank[j].getAddress().compareTo(bank[j + 1].getAddress()) > 0) {
					Bank temp = bank[j];
					bank[j] = bank[j + 1];
					bank[j + 1] = temp;
				}
			}
		}
		return bank;
	}

	// e. Display users sorted based on account id
	private static Bank[] accountNumberSorting(Bank[] bank) {
		// bubble sort
		for (int i = 0; i < bank.length; i++) {
			for (int j = 0; j < bank.length - i - 1; j++) {
				if (bank[j].getAccountNo().compareTo(bank[j + 1].getAccountNo()) > 0) {
					Bank temp = bank[j];
					bank[j] = bank[j + 1];
					bank[j + 1] = temp;
				}
			}
		}
		return bank;
	}

	// c. Display all users who have non-zero balance
	private static void checkNonZeroBalance(Bank[] bank) {
		int flag = 0;
		for (int i = 0; i < bank.length; i++) {
			if (bank[i].getBalance() != 0) {
				System.out.println(bank[i]);
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("No Zero balance accounts:");
		}

	}

	// b. Display user details based on Name
	private static void userBasedOnName(Bank[] bank, String validName) {
		int flag = 0;
		for (int i = 0; i < bank.length; i++) {
			if (bank[i].getName().equals(validName)) {
				System.out.println(bank[i]);
				flag = 1;
			}

		}
		if (flag == 0) {
			System.out.println("No user name is found!!!\n");
		}

	}

	// a. Display user details based on ID
	private static void accountnumberSearching(Bank[] bank, String validAcno) {
		int flag = 0;
		for (int i = 0; i < bank.length; i++) {
			// if (bank[i].getAccountNo().equals(validAcno)) {
			if (bank[i].getAccountNo().compareTo(validAcno) == 0) {

				System.out.println(bank[i]);
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("No account number is found!!!\n");
		}

	}

	// date of birth checking using if else
	private static String checkingDob(String validDob) {
		boolean isValid = true;
		while (isValid) {
			String year = "";
			String actualDate = "";
			String currentDate = "2020-09-02";
			if (validDob.compareTo(currentDate) < 0) {
				int intYear;
				int intYear1;
				// getting year from date
				for (int i = 0; i <= 3; i++) {
					year += currentDate.charAt(i);
				}
				intYear = getIntYear(year);
				System.out.println(intYear);
				// intYear = Integer.parseInt(year);
				intYear1 = intYear - 1;
				// System.out.println("year:"+intYear1);
				// actualDate += Integer.toString(intYear1);
				actualDate += intYear1;
				// remaining date mm and dd
				for (int i = 4; i <= 9; i++) {
					actualDate += currentDate.charAt(i);
				}
				// comparing with actual date
				if (validDob.compareTo(actualDate) < 0) {
					System.out.println("yes valid");
					isValid = false;
				} else {
					System.out.println("age should be one year:");
					System.out.println("enter date of birth:(yyyy-mm-dd)");
					String dob = sc.next();
					validDob = validation.validateDob(dob);

				}
			} else {
				System.out.println("it must be past date:plz once again enter\n");
				System.out.println("enter date of birth:(yyyy-mm-dd)");
				String dob = sc.next();
				validDob = validation.validateDob(dob);
			}
		}
		return validDob;
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

	/*
	 * //checking date of birth (it must be past date) private static String
	 * checkingDob(String validDob) { boolean isValid = true; while (isValid) {
	 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Getting current
	 * date Calendar cal = Calendar.getInstance(); // System.out.println(cal); //
	 * Displaying current date in the desired format
	 * System.out.println("Current Date: " + sdf.format(cal.getTime())); String
	 * currentDate = sdf.format(cal.getTime()); cal.add(Calendar.DAY_OF_MONTH,
	 * -365); // Date after deleting the days to the current date String newDate =
	 * sdf.format(cal.getTime()); // Displaying the new Date after deleting of Days
	 * to current date System.out.println("Date after deletion: " + newDate); if
	 * (validDob.compareTo(newDate) < 0) { isValid = false; } else { System.out.
	 * println("date of birth must be past date...so again enter the date of birth:"
	 * ); validDob = sc.next(); } } return validDob; }
	 */
//		1. Create bank user
	private static void createBankUser(Bank banks[]) {

		for (int i = 0; i < banks.length; i++) {
			System.out.println("=====User====" + (i + 1));

			System.out.println("enter your account number");
			String accountNo = sc.next();
			String validAcno = validation.validateAcno(accountNo);

			System.out.println("enter your name:");
			String name = sc.next();
			String validName = validation.validateString(name);

			System.out.println("enter the account type");
			String accType = sc.next();
			String validAtype = validation.validate_accountType(accType);

			System.out.println("enter the date of birth");
			String dob = sc.next();
			String validDob = validation.validateDob(dob);
			String dobirth = checkingDob(validDob);

			System.out.println("enter your account balance:");
			float balance = sc.nextFloat();
			float validBalance = validation.validateBalance(balance);

			System.out.println("enter your address(city name):");
			String address = sc.next();
			String validAddress = validation.validateString(address);

			Bank bank = new Bank(validAcno, validName, validAtype, dobirth, validBalance, validAddress);
			banks[i] = bank;
		}

	}

}
