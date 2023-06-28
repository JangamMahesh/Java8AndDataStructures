package internetProvider;

import java.util.Scanner;

public class TestApplication {
	static Scanner sc = new Scanner(System.in);
	static Validations vs = new Validations();
	static int count = 0;
	static int userCount = 0;

	public static void main(String[] args) {
		Plan plan[] = null;
		User user[] = null;
		int op;
		do {
			displayMenu();
			System.out.println("enter an option:\n");
			op = sc.nextInt();
			switch (op) {
			case 1:
				plan = createPlans(plan);
				break;
			case 2:
				if (count == 0) {
					System.out.println("sorry,no plans!! so add plans:");
				} else {
					user = createUsers(user, plan);
				}
				break;
			case 3:
				if (userCount == 0) {
					System.out.println("sorry,no users!!");
				} else {
					System.out.println("Display all users:");
					display(user);
				}
				break;
			case 4:
				if (count == 0) {
					System.out.println("sorry,no plans!! so add plans:");
				} else {
					displayPlans(plan);
				}
				break;
			case 5:
				if (count == 0) {
					System.out.println("sorry,no plans!! so add plans:");
				} else {
					System.out.println("enter plan name:");
					String planName = sc.next();
					String validPlan = vs.validatePlanName(planName);
					displayUserBasedOnPlan(user, validPlan);
				}
				break;
			case 6:
				if (count == 0) {
					System.out.println("sorry,no plans!! so add plans:");
				} else {
					String reverseOrderOfCities[] = getReverseOrderCities(user);
					for (int i = 0; i < reverseOrderOfCities.length; i++) {
						System.out.println(reverseOrderOfCities[i]);
					}
				}
				break;
			case 7:
				if (count == 0) {
					System.out.println("sorry,no plans!! so add plans");
				} else {
					Plan sortedPlans[] = sortPlansBasedOnPrice(plan);
					displayPlans(sortedPlans);
				}
				break;
			case 8:
				break;
			default:
				System.out.println("default option\n");
			}
		} while (op != 8);
	}

	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out
				.println("choose an option\n1.Add new plan details\n2.Add new user\n3.Display users\n4.dispaly plans\n"
						+ "5.display users subscribed to particular plan\n6.Display the city in reverse order\n"
						+ "7.Sort the plans based on price\n8.EXIT\n");
	}

//sort the plans based on price
	// bubble sort
	private static Plan[] sortPlansBasedOnPrice(Plan[] plan) {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count - i - 1; j++) {
				if (plan[j].getPrice() > plan[j + 1].getPrice()) {
					Plan temp = plan[j];
					plan[j] = plan[j + 1];
					plan[j + 1] = temp;
				}
			}
		}
		return plan;
	}

//get reverse order of cities
	private static String[] getReverseOrderCities(User[] user) {
		String cities[] = new String[userCount];
		for (int i = 0; i < userCount; i++) {
			cities[i] = user[i].getAddress();
		}
		// result array
		String resultArray[] = new String[userCount];
		// reverse characters of cities
		for (int i = 0; i < userCount; i++) {
			String reverseCity = "";
			String city = cities[i];
			for (int j = city.length() - 1; j >= 0; j--) {
				reverseCity += city.charAt(j);
			}
			resultArray[i] = reverseCity;
		}

		return resultArray;
	}

	// display user based on planName
	private static void displayUserBasedOnPlan(User[] user, String validPlan) {
		int flag = 0;
		for (int i = 0; i < userCount; i++) {
			if (user[i].getInternetPlan().equalsIgnoreCase(validPlan)) {
				flag++;
				System.out.println("User [name=" + user[i].getName() + ", userId=" + user[i].getUserId() + ", mNo="
						+ user[i].getmNo() + ", address=" + user[i].getAddress() + ", internetPlan="
						+ user[i].getInternetPlan() + "]");
			}
		}
		if (flag == 0) {
			System.out.println("sorry, no plan is found");
		}
	}

	// display plans
	private static void displayPlans(Plan[] plan) {
		for (int i = 0; i < count; i++) {
			System.out
					.println("Plan [planName=" + plan[i].getPlanName() + ", internetSpeed=" + plan[i].getInternetSpeed()
							+ ", downloadGB=" + plan[i].getDownloadGB() + ", price=" + plan[i].getPrice() + "]");
		}

	}

	// display users
	private static void display(User[] user) {
		for (int i = 0; i < userCount; i++) {
			System.out.println("User [name=" + user[i].getName() + ", userId=" + user[i].getUserId() + ", mNo="
					+ user[i].getmNo() + ", address=" + user[i].getAddress() + ", internetPlan="
					+ user[i].getInternetPlan() + "]");
		}

	}

	// create user
	private static User[] createUsers(User[] users, Plan[] plan) {
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
		String name = sc.next();
		String validName = vs.validateString(name);
		System.out.println("enter user id:");
		int uid = sc.nextInt();
		int validUid = vs.validateInt(uid);

		System.out.println("enter user mobilenumber");
		String mno = sc.next();
		String validMno = vs.validatemobileNumber(mno);

		System.out.println("enter user address:");
		String address = sc.next();
		String validAdd = vs.validateString(address);

		System.out.println("enter plan name:");
		String planName = sc.next();
		String validPlanName = vs.validatePlanName(planName);
		String validPlan = checkValidPlans(plan, validPlanName);
		User user = new User(validName, validUid, validMno, validAdd, validPlan);
		users[userCount] = user;
		userCount++;
		return users;
	}

	// checkvalidPlans
	private static String checkValidPlans(Plan[] plan, String validPlanName) {
		boolean isValid = true;
		while (isValid) {
			int flag = 0;
			for (int i = 0; i < count; i++) {
				if (plan[i].getPlanName().equals(validPlanName)) {
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println("plan is not found\nonce again enter:");
				validPlanName = sc.next();
			} else {
				isValid = false;
			}
		}
		return validPlanName;
	}

	// create plans
	private static Plan[] createPlans(Plan[] plans) {
		if (plans != null) {
			Plan temp[] = new Plan[count + 1];
			for (int k = 0; k < count; k++) {
				temp[k] = plans[k];

			}
			plans = temp;
			temp = null;
		} else {
			plans = new Plan[1];
		}
		System.out.println("enter data plan per day like(2gb,3gb,4gb):");
		String name = sc.next();
		String validName = vs.validatePlanName(name);
		System.out.println("enter internet speed (Mbps)");
		double netSpeed = sc.nextDouble();
		double validNetSpeed = vs.validateISpeed(netSpeed);
		System.out.println("enter monthly download limit(GB)");
		double gb = sc.nextDouble();
		double validGb = vs.validateISpeed(gb);
		System.out.println("enter price for plan:");
		float price = sc.nextFloat();
		float validPrice = vs.validatePricePlan(price);
		plans[count++] = new Plan(validName, validNetSpeed, validGb, validPrice);

		return plans;

	}
}
