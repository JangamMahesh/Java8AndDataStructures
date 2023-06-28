package taxi;

import java.util.Scanner;

public class TestApplication {
	static int taxiCount = 0;
	static int userCount = 0;
	static Scanner sc = new Scanner(System.in);
	static Validations vs = new Validations();

	public static void main(String[] args) {
		// creating taxi array
		TaxiDriver taxi[] = new TaxiDriver[10];

		// creating users array
		User users[] = null;
		int op;
		do {
			displayMenu();
		
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("ADD TAXI DETAILS:");
				taxi = createTaxiDetails(taxi);
				displayTaxes(taxi);
				break;
			case 2:
				if (taxiCount == 0) {
					System.out.println("sorry,no taxes are available:");
				} else {
					System.out.println("ADD USER DETAILS:");
					users = createUserDetails(users, taxi);
					display(users);
					/*
					 * System.out.println("details:"); System.out.println("User [name=" +
					 * user[userCount].getName() + ", age=" + user[userCount].getAge() + ", gender="
					 * + user[userCount].getGender() + ", number=" + user[userCount].getNumber() +
					 * ", uDistance=" + user[userCount].getuDistance() + ", userId=" +
					 * user[userCount].getId() + "]");
					 */
				}
				break;
			case 3:
				if (taxiCount == 0 || userCount == 0) {
					System.out.println("sorry,no taxes and no users also available!!!!");
				} else {
					System.out.println("BOOK A TAXI");
					System.out.println("enter user id:");
					int id = sc.nextInt();
					int validInt = vs.validateInt(id);
					boolean result = bookingTaxi(validInt, users, taxi);
					if (result == true) {
						System.out.println("Successfully booked!!");
					} else {
						System.out.println("ur name is not registered:");
					}
				}
				break;
			case 4:
				System.out.println("display taxes:");
				displayTaxes(taxi);
				System.out.println("display users:");
				display(users);
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid option:");
			}
		} while (op != 5);

	}

	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println(
				"choose an option\n1.Add taxi details\n2.Add user details\n3.Book a taxi\n4.display\n5.exit\n");
		System.out.println("enter an option:");
		
	}

	private static void displayTaxes(TaxiDriver[] taxes) {
		for (int i = 0; i < taxiCount; i++) {
			System.out.println(taxes[i]);
		}
	}

	private static void display(User[] user) {
		for (int i = 0; i < userCount; i++) {
			System.out.println(user[i]);
		}
	}

//book a ticket
	private static boolean bookingTaxi(int userCount2, User[] users, TaxiDriver[] taxes) {
		int flag = 0;
		int l = 0;
		int differenceArray[] = new int[taxiCount];
		TaxiDriver min = taxes[0];
		for (int j = 0; j < userCount; j++) {
			if (users[j].getId() == userCount2) {
				flag = 1;
				l = j;
				for (int i = 0; i < taxiCount; i++) {
					int differnce = getAbsDiffernceOfDistances(users[j].getuDistance(), taxes[i].gettDistance());
					differenceArray[i] = differnce;
				}
			}
		}
		if (flag == 1) {
			int minIndex = 0;
			int minEle = differenceArray[0];
			for (int i = 0; i < taxiCount; i++) {
				if (differenceArray[i] < minEle) {
					minEle = differenceArray[i];
					minIndex = i;
				}
			}
			System.out.println("User detalils:username:" + users[l].getName() + " TaxiDriver [taxiNumber="
					+ taxes[minIndex].getTaxiNumber() + ", driverName=" + taxes[minIndex].getDriverName()
					+ ", driverId=" + taxes[minIndex].getDriverId() + ", tDistance=" + taxes[minIndex].gettDistance()
					+ "]");
			for (int i = 0; i < taxiCount; i++) {
				if (taxes[i].gettDistance() == min.gettDistance()) {
					for (int j = i; j < taxiCount - 1; j++) {
						taxes[j].setDriverId(taxes[j + 1].getDriverId());
						taxes[j].setDriverName(taxes[j + 1].getDriverName());
						taxes[j].setTaxiNumber(taxes[j + 1].getTaxiNumber());
						taxes[j].settDistance(taxes[j + 1].gettDistance());
					}
					taxiCount--;
				}

			}
			// this is for deleting an userAccount;
			for (int i = 0; i < userCount; i++) {
				if (users[i].getId() == userCount2) {
					for (int j = i; j < userCount - 1; j++) {
						users[j].setAge(users[j + 1].getAge());
						users[j].setGender(users[j + 1].getGender());
						users[j].setId(users[j + 1].getId());
						users[j].setName(users[j + 1].getName());
						users[j].setNumber(users[j + 1].getNumber());
						users[j].setuDistance(users[j + 1].getuDistance());
					}
					userCount--;
				}
			}
			return true;
		}
		return false;
	}

	private static int getAbsDiffernceOfDistances(int getuDistance, int gettDistance) {

		int result = (getuDistance > gettDistance) ? getuDistance - gettDistance : gettDistance - getuDistance;
		return result;
	}

//get absolute difference

	// create user details
	private static User[] createUserDetails(User[] users, TaxiDriver[] taxes) {

		if (users != null) {
			User temp[] = new User[userCount + 1];
			for (int i = 0; i < userCount; i++) {
				temp[i] = users[i];

			}
			users = temp;
			temp = null;
		} else {
			users = new User[1];
		}
		System.out.println("enter user name:");
		String validName = vs.validateString(sc.next());
		System.out.println("enter gender:");
		char ch = sc.next().charAt(0);
		char validGender = vs.validateGender(ch);
		System.out.println("enter age:");
		int validAge = vs.validateAge(sc.nextInt());
		System.out.println("enter mobile number:");
		String validMno = vs.validatemobileNumber(sc.next());
		System.out.println("enter distance from point A: in km");
		int validDt = vs.validateInt(sc.nextInt());
		int uniqueUd = getUniqueDt(validDt, taxes, users);
		int userId = userCount;
		User user = new User(userId + 1, validName, validAge, validGender, validMno, uniqueUd);
		users[userCount] = user;
		userCount++;
		return users;
	}

//get unique user distance which is not equal to taxi
	private static int getUniqueDt(int validDt, TaxiDriver[] taxes, User[] user) {

		boolean isValid = true;
		while (isValid) {
			int flag = 0;
			for (int j = 0; j < taxiCount; j++) {
				if (taxes[j].gettDistance() == validDt) {
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("already taxi position and ur position is same:once again enter:");
					validDt = sc.nextInt();
				} else {
					isValid = false;
				}
			}
		}
		return validDt;
	}

	// create taxi details
	private static TaxiDriver[] createTaxiDetails(TaxiDriver[] taxi) {

		System.out.println("enter taxi number:");
		String number = sc.next();
		String validNumber = vs.vehicleNoValidation(number);
		String uniqueTid = null;
		int uniqueKm = 0;
		int uniqueDid = 0;
		int uniqueDt = 0;
		if (taxiCount > 0) {
			uniqueTid = getUniqueTId(validNumber, taxi, taxiCount);
		} else {
			uniqueTid = validNumber;
		}
		System.out.println("enter driver name:");
		String name = sc.next();
		String validName = vs.validateString(name);

		System.out.println("enter driver id:");
		int dID = sc.nextInt();
		int validdID = vs.validateInt(dID);
		if (taxiCount > 0) {
			uniqueDid = getUniqueDId(validdID, taxi, taxiCount);
		} else {
			uniqueDid = validdID;
		}

		System.out.println("enter distance from point A: in km");
		int distance = sc.nextInt();
		int validDt = vs.validateInt(distance);
		if (taxiCount > 0) {
			uniqueDt = getUniqueDT(validDt, taxi, taxiCount);
		} else {
			uniqueDt = validDt;
		}
		// create a object
		taxi[taxiCount++] = new TaxiDriver(uniqueTid, validName, uniqueDid, uniqueDt);

		return taxi;
	}

	// unique driver id
	private static int getUniqueDT(int validdID, TaxiDriver[] taxi, int taxiCount2) {
		boolean isValid = true;
		while (isValid) {
			int flag = 0;
			for (int j = 0; j < taxiCount2; j++) {
				if (taxi[j].gettDistance() == validdID) {
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("already one taxi is existed here:once again enter:");
					validdID = sc.nextInt();
				} else {
					isValid = false;
				}
			}
		}
		return validdID;
	}

	// unique driver id
	private static int getUniqueDId(int validdID, TaxiDriver[] taxi, int taxiCount2) {
		boolean isValid = true;
		while (isValid) {
			int flag = 0;
			for (int j = 0; j < taxiCount2; j++) {
				if (taxi[j].getDriverId() == validdID) {
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("driver number is already exist:once again enter:");
					validdID = sc.nextInt();
				} else {
					isValid = false;
				}
			}
		}
		return validdID;
	}

	// uniquetaxiId
	private static String getUniqueTId(String validNumber, TaxiDriver[] taxi, int taxiCount2) {
		boolean isValid = true;
		while (isValid) {
			int flag = 0;
			for (int j = 0; j < taxiCount2; j++) {
				if (taxi[j].getTaxiNumber().equalsIgnoreCase(validNumber)) {
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("taxi number is already exist:once again enter:");
					validNumber = sc.next();
				} else {
					isValid = false;
				}
			}
		}
		return validNumber;

	}

}
