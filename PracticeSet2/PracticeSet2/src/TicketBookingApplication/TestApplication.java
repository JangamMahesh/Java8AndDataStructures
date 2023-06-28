package TicketBookingApplication;

import java.text.DecimalFormat;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import ItemApplication.Validations;

public class TestApplication {

	static Scanner sc = new Scanner(System.in);
	static Validations validation = new Validations();

	public static void main(String[] args) {
//		1. Add customer details
//		2. Book a ticket
//		3. Display Customers
//		4. exit
		int op;
//		1.Add customer details
		Customer customer[] = createCustomer();
		do {
			System.out.println("\nChoose an option:\n1.Display Customers\n2.Book Ticket\n3.EXIT\n");
			System.out.println("enter option:");
			op = sc.nextInt();
			switch (op) {
//			 Display Customers
			case 1:
				display(customer);
				break;
//			 Book a ticket
			case 2:
				boolean result = bookTicket(customer);
				if (result == true) {
					System.out.println("****congratulations****\n$$$$TICKET CONFIRMED$$$$$$\n");
				} else {
					System.out.println("##SORRY,FAIL TO BOOK TICKET###\n");
				}
				break;
			case 3:
				break;
			default:
				System.out.println("INVALID OPTION\n");
			}
		} while (op != 3);

	}

	// display customers
	private static void display(Customer[] customer) {
		int op;
		do {
			System.out.println(
					"\nChoose an option\n1.Display customer based on city names\n2.Display customers based on ID\n3.Display customer Names in sorted order\n4.EXIT\n");
			System.out.println("enter an option:");
			op = sc.nextInt();
			switch (op) {
			case 1:
				displayCustomersByCityName(customer);
				break;
			case 2:
				displayCustomersByID(customer);
				break;
			case 3:
				displayCustomerNamesBySortedOrder(customer);
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid option:\n");

			}
		} while (op != 4);

	}

//display customer names by sorted order
	private static void displayCustomerNamesBySortedOrder(Customer[] customer) {
		// bubble sort
		for (int i = 0; i < customer.length; i++) {
			for (int j = 0; j < customer.length - i - 1; j++) {
				if (customer[j].getCustomerName().compareToIgnoreCase(customer[j + 1].getCustomerName()) > 0) {
					Customer temp = customer[j];
					customer[j] = customer[j + 1];
					customer[j + 1] = temp;
				}
			}
		}
		// printing customers
		for (int i = 0; i < customer.length; i++) {
			System.out.println(customer[i]);
		}
	}

//display customer by id
	private static void displayCustomersByID(Customer[] customer) {
		System.out.println("enter customer ID:");
		int customerId = sc.nextInt();
		int flag = 0;
		for (int i = 0; i < customer.length; i++) {
			if (customerId == customer[i].getCustomerId()) {
				System.out.println(customer[i]);
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("customer id is not found:\n");
		}
	}

//display customers based on city
	private static void displayCustomersByCityName(Customer[] customer) {
		System.out.println("enter customer name:");
		String customerCity = sc.next();
		int flag = 0;
		for (int i = 0; i < customer.length; i++) {
			if (customer[i].getAddress().equalsIgnoreCase(customerCity)) {
				System.out.println(customer[i]);
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("customer city is not found\n");
		}
	}

//book ticket
	private static boolean bookTicket(Customer[] customer) {
//		a. Accept following input: customer id, mobile number, source, destination, date and time
//		b. Upon successful validations, print â€œticket confirmedâ€ message on console, otherwise
//		print failure message
		System.out.println("******BOOKING TICKET******");

		int flag = 0;
		System.out.println("enter customer id");
		int cId = sc.nextInt();
		int validId = validation.validateId(cId);

		System.out.println("enter mobile number:");
		String mno = sc.next();
		String validMno = validation.validateMno(mno);
		if (customer == null) {
			System.out.println("customers list is empty:");
		} else {
			for (int i = 0; i < customer.length; i++) {
				if (customer[i].getCustomerId() == validId) {
					if (customer[i].getMobileNumber().equals(validMno)) {
						flag = 1;
					}
				}
			}
		}
		if (flag == 1) {
			System.out.println("enter source :");
			String source = sc.next();
			String validSource = validation.validateString(source);

			System.out.println("enter  destination :");
			String destination = sc.next();
			String validDestination = validation.validateString(destination);

			System.out.println("enter travelling date:format(YYYY-MM-DD)");
			String dot = sc.next();
			String validDot = validation.validateDob(dot);

			System.out.println("enter the travelling time in HH:MM format");
			String time = sc.next();
			String valid_time = validation.validateTime(time);

			boolean placeResult = placeChecking(validSource, validDestination);
			boolean dateResult = dateChecking(validDot);
			if (placeResult == true && dateResult == true) {
				// System.out.println("****congratulations****\n$$$$TICKET CONFIRMED$$$$$$\n");

				System.out.println("With details:\n ID   :" + validId + "\nMOBILENUMBER :" + validMno + "\nSOURCE :"
						+ validSource + "\nDESTINATION :" + validDestination + "\nTravelling date :" + validDot
						+ "\nTravelling time:" + valid_time + "\n");
				return true;
			} else {
				// System.out.println("##SORRY,FAIL TO BOOK TICKET###\n");
				return false;
			}
		} else {
			System.out.println("sorry! first you need to create an account:");
			return false;
		}
	}

	// date checking for one month validity
	private static boolean dateChecking(String validDot) {
		String mm = "";
		String additionalDate = "";
		/*
		 * System.out.println("enter ur travelling date"); String dob = sc.next();
		 * String validDob = validateDob(dob); /// System.out.println(validDob);
		 */ // System.out.println("enter current date:");
			// String current=sc.next();
			// setting current date and compare with travelling date .if travelling date is
			/// less than current date..then it wont accept that date.else it is valid.
			// once it is future date then it must be check with in the range of one month
		String validCurrent = "2020-09-01";
		if (validCurrent.compareTo(validDot) < 0) {
//			DecimalFormat df = new DecimalFormat("00");
			String validIntMonth;
			System.out.println("ok valid");
			String date = validCurrent;
			char month = date.charAt(5);
			char month1 = date.charAt(6);
			/*
			 * mm += month; mm += month1; System.out.println(mm);
			 */
			// int intMonth = Integer.parseInt(mm);
			// if (mm.compareTo("01")>=0 && mm.compareTo("11") <= 0)
			if (month == 48 && month1 >= 49 && month1 < 57) {
				System.out.println("hello");
				mm += month;
				mm += (char)(month1 + 1);
				System.out.println("month:" + mm);
				validIntMonth = mm;
				// validIntMonth = df.format(intMonth + 1);
				// validIntMonth = df.format(mm + 1);
				// System.out.println("validIntmonth:"+validIntMonth);
			} else if (month == 48 && month1 == 57) {

				validIntMonth = "10";
			} else if (month == 49 && month1 == 48 || month1 == 49) {
				mm += month;
				mm += (char) (month1 + 1);
				System.out.println("month:" + mm);
				validIntMonth = mm;
			} else {
				validIntMonth = "01";
			}
			for (int i = 0; i <= 4; i++) {
				additionalDate += validCurrent.charAt(i);
			}
			additionalDate += validIntMonth;
			for (int i = 7; i <= 9; i++) {
				additionalDate += validCurrent.charAt(i);
			}
			System.out.println("valid month:" + additionalDate);
			if (validDot.compareTo(additionalDate) < 0) {
				// System.out.println("yes Valid:\n");
				return true;
			} else {
				System.out.println("travelling date must be with in 30 days:\n");
			}

		} else {
			System.out.println("it must be future date");
		}
		return false;
	}

	/*
	 * //date checking for one month validity private static boolean
	 * dateChecking(String validDot) { SimpleDateFormat sdf = new
	 * SimpleDateFormat("yyyy-MM-dd"); // Getting current date Calendar cal =
	 * Calendar.getInstance(); // Displaying current date in the desired format
	 * 
	 * System.out.println("Current Date: " + sdf.format(cal.getTime())); String
	 * current_date = sdf.format(cal.getTime()); cal.add(Calendar.DAY_OF_MONTH, 30);
	 * // Date after adding the days to the current date String newDate =
	 * sdf.format(cal.getTime()); // Displaying the new Date after addition of Days
	 * to current date // System.out.println("Date after Addition: "+newDate);
	 * 
	 * System.out.println("enter the date format"); String oldDate=sc.next();
	 * 
	 * //first if is used to get the future date //second if is used to get the date
	 * up to one month if (current_date.compareTo(validDot) < 0) { if
	 * (validDot.compareTo(newDate) <= 0) { System.out.println("ok valid"); return
	 * true; } else { System.out.
	 * println("##In ordered to book the ticket date must be exist in with in one month##"
	 * ); } } else { System.out.println("##The given date must be future date##"); }
	 * return false; }
	 */
//place checking validation (source and destination must be different)
	private static boolean placeChecking(String validSource, String validDestination) {
		if (validSource.equalsIgnoreCase(validDestination)) {
			System.out.println("###sorry, source and destination must be different places###");
			return false;
		} else {
			return true;
		}
	}

//	1.Add customer details
	private static Customer[] createCustomer() {
		System.out.println("enter no of customers:");
		int number = sc.nextInt();
		int validNumber = validation.validateId(number);
		Customer customers[] = new Customer[validNumber];
		for (int i = 0; i < customers.length; i++) {
			System.out.println("=====Customer====" + (i + 1));

			System.out.println("enter cutomer ID:");
			int ID = sc.nextInt();
			int validId = validation.validateId(ID);

			System.out.println("enter cutomer name:");
			String name = sc.next();
			String validName = validation.validateStr(name);

			/*
			 * System.out.println("enter cutomer age:"); int age = sc.nextInt(); int
			 * validAge = validation.validateAge(age);
			 */

			System.out.println("enter cutomer mobile number:");
			String mno = sc.next();
			String validMno = validation.validateMno(mno);

			System.out.println("enter customer date of birth:format(YYYY-MM-DD)");
			String dob = sc.next();
			String validDob = validation.validateDob(dob);
			//System.out.println(validDob);

			String dobirth = checkingDob(validDob);

			System.out.println("enter customer address:");
			String address = sc.next();
			String validAddress = validation.validateStr(address);

			int validAge = AgeValidation(dobirth);

			Customer customer = new Customer(validId, validName, validAge, validMno, dobirth, validAddress);
			customers[i] = customer;
			System.out.println("!!!ADDED SUCCESSFULLY!!!\n");
		}
		return customers;
	}

	// age validation
	private static int AgeValidation(String validDob) {
		int age = 0;
		String currentDate = "2020-09-01";
		String year = "";
		String year1 = "";
		for (int i = 0; i <= 3; i++) {
			year += currentDate.charAt(i);
			year1 += validDob.charAt(i);
		}
		age = getIntYear(year) - getIntYear(year1);
		System.out.println("age:" + age);
		return age;
	}

	// date of birth checking
	/*
	 * private static String checkingDob(String validDob) { boolean isValid = true;
	 * while (isValid) { SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	 * // Getting current date Calendar cal = Calendar.getInstance(); //
	 * System.out.println(cal); // Displaying current date in the desired format
	 * System.out.println("Current Date: " + sdf.format(cal.getTime())); String
	 * currentDate = sdf.format(cal.getTime()); cal.add(Calendar.DAY_OF_MONTH,
	 * -365); // Date after deleting the days to the current date String newDate =
	 * sdf.format(cal.getTime()); // Displaying the new Date after deleting of Days
	 * to current date System.out.println("Date after deletion: " + newDate); if
	 * (validDob.compareTo(newDate) < 0) { isValid = false; } else { System.out.
	 * println("date of birth must be past date...so again enter the date of birth:"
	 * ); validDob = sc.next(); } } return validDob; }
	 */
//date of birth checking using if else
	private static String checkingDob(String validDob) {
		boolean isValid = true;
		while (isValid) {
			String year = "";
			String actualDate = "";
			String currentDate = "2020-09-01";

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
		//System.out.println("date checking:"+validDob);
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
}
