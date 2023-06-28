package museum;

import java.util.Scanner;

public class TestApplication {
	static int count = 0;
	static Scanner sc = new Scanner(System.in);
	static Validations vs = new Validations();

	public static void main(String[] args) {
		System.out.println("*********WELCOME TO MUSEUM***********");
		Visitor visitors[] = null;
		/* int feeArray[] = new int[100]; */
		int op;
		do {
			displayMenu();
			System.out.println("enter an option:");
			op = sc.nextInt();

			switch (op) {
			case 1:
				visitors = createVisitors(visitors);
				break;
			case 2:
				if (count == 0) {

					System.out.println("Sorry,first u need to enter the details of the visitors:");
				} else {
					System.out.println("fee calculation based on age:");
					int age = visitors[count - 1].getAge();
					int fee = getFeebasedOnAge(age);
					visitors[count - 1].setFee(fee);
					/* System.out.println("fee:" + fee); */
				}
				break;
			case 3:
				if (count == 0) {
					System.out.println("Sorry,first u need to enter the details of the visitors:");
				} else {
					System.out.println("number of visitors:  " + count);
					System.out.println("details of the visitors:");
					for (int i = 0; i < count; i++) {
						System.out.println("[name:" + visitors[i].getName() + ",age:" + visitors[i].getAge()
								+ ",gender:" + visitors[i].getGender() + ",fee:" + visitors[i].getFee() + "]");
					}
				}
				break;
			case 4:
				if (count == 0) {
					System.out.println("Sorry,first u need to enter the details of the visitors:");
				} else {
					System.out.println("Fetch the number of visitors of a range of age:");
					int number = getRangebasedOnAge(visitors);
					System.out.println(number);
				}
				break;
			case 5:
				if (count == 0) {
					System.out.println("Sorry,first u need to enter the details of the visitors:");
				} else {
					System.out.println("fetch the ratio of female vs male visitors");
					float femaleCount = getFemaleRatio(visitors);
					float maleCount = getMaleRatio(visitors);
					// int result=femaleRatio/maleRatio;
					/*
					 * if (femaleCount < 10 || maleCount < 10) { System.out.println(femaleCount /
					 * maleCount + ":" + "1");
					 * 
					 * }
					 */
					System.out.println(femaleCount);
					System.out.println(maleCount);
					if (femaleCount == 0) {
						System.out.println("only male people are visited today " + maleCount);
					} else if (maleCount == 0) {
						System.out.println("only female are visited today " + femaleCount);
					} else {
						float femaleRatio = ((femaleCount) / (femaleCount + maleCount)) * 100;
						float maleRatio = ((maleCount) / (femaleCount + maleCount)) * 100;
						System.out.println("female vs male ration " + femaleRatio + ":" + maleRatio);
					}
				}
				break;
			case 6:
				if (count == 0) {
					System.out.println("Sorry,first u need to enter the details of the visitors:");
				} else {
					int totalIncomeOfTheDay = getIncomeOfTheDay(visitors);
					System.out.println("total income of the day is " + totalIncomeOfTheDay);
				}
				break;
			case 7:
				break;
			default:
				System.out.println("invalid option:");
			}

		} while (op != 7);

	}

	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("choose an option\n1.Enter details\n2.fee caluculation based on Age\n"
				+ "3.Fetching number of visitors today\n4.fetch the number of visitors of a range of age\n"
				+ "5.fetch the ratio of female vs male visitors\n6.fetch the total earning per day from the museum fee\n"
				+ "\n7.EXIT\n");
	}

	private static int getIncomeOfTheDay(Visitor[] visitors) {
		// TODO Auto-generated method stub
		System.out.println("enter date of the day to get the income");
		String validDate = vs.checkingDoE(sc.next());
		int totalIncome = 0;
		System.out.println("fetch the total earning per day from the museum fee:");
		for (int i = 0; i < count; i++) {
			if (visitors[i].getDate().compareTo(validDate) == 0) {
				totalIncome += visitors[i].getFee();
			}
		}
		return totalIncome;
	}

	// getmaleRatio
	private static float getMaleRatio(Visitor[] visitors) {
		float maleCount = 0;
		for (int i = 0; i < count; i++) {
			if (visitors[i].getGender() == 'M' || visitors[i].getGender() == 'm') {
				maleCount++;
			}
		}

		return maleCount;
	}

//getFemaleRatio
	private static float getFemaleRatio(Visitor[] visitors) {

		float femaleCount = 0;
		for (int i = 0; i < count; i++) {
			if (visitors[i].getGender() == 'F' || visitors[i].getGender() == 'f') {
				femaleCount++;
			}
		}

		return femaleCount;
	}

//getRangeBasedOnAge
	private static int getRangebasedOnAge(Visitor[] visitors) {
		int rangeCount = 0;
		System.out.println("enter the first age:");
		int age = sc.nextInt();
		int validAge = vs.validateAge(age);
		System.out.println("enter last age:");
		int age1 = sc.nextInt();
		int validAge1 = vs.validateAge(age1);
		if (validAge > validAge1) {
			System.out.println("first age must be less than second age:");
		} else {
			for (int i = 0; i < count; i++) {
				if (visitors[i].getAge() >= validAge && visitors[i].getAge() <= validAge1) {
					rangeCount++;
				}
			}
		}
		return rangeCount;
	}

//getFeebased on age
	private static int getFeebasedOnAge(int age) {
		int fee = 0;
		if (age < 5) {
			fee = 0;
		} else if (age >= 5 && age < 18) {
			fee = 10;
		} else if (age >= 18 && age < 60) {
			fee = 20;
		} else {
			fee = 5;
		}
		return fee;
	}

	// create visitors
	private static Visitor[] createVisitors(Visitor[] visitors) {
		/*
		 * System.out.println("enter number of visitos:"); int number = sc.nextInt();
		 * int validNumber = vs.validateSize(number);
		 */
		if (visitors != null) {
			Visitor temp[] = new Visitor[count + 1];
			for (int i = 0; i < count; i++) {
				temp[i] = visitors[i];
			}
			visitors = temp;
			temp = null;
		} else {
			visitors = new Visitor[1];
		}
		System.out.println("enter the date of ur entry in DD-MM-YYYY format");
		String date = vs.dateValidation(sc.next());
		String validDate = vs.checkingDoE(date);
		System.out.println("enter name of visitor:");

		String name = sc.next();
		String validName = vs.validateString(name);
		System.out.println("enter age of the visitor:");
		int age = sc.nextInt();
		int validAge = vs.validateAge(age);
		System.out.println("enter gender of the visitor:");
		char gender = sc.next().charAt(0);
		char validGender = vs.validateGender(gender);

		// String Dob = vs.checkingDob(validDob);
		visitors[count++] = new Visitor(validName, validAge, validGender, validDate);
		return visitors;

	}
}
