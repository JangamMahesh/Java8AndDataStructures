package realState;

import java.util.Scanner;

public class TestApplication {
	static Scanner sc = new Scanner(System.in);
	static ValidatingInputs vs = new ValidatingInputs();
	static int recordCount = 0;

	public static void main(String[] args) {
		Building realStates[] = null;
		realStates = createRecords(realStates);
		for (int i = 0; i < recordCount; i++) {
			System.out.println(realStates[i]);
		}
		display(realStates);
	}

	// display real states
	private static void display(Building[] realStates) {
		int op;
		do {
			displayMenu();

			System.out.println("enter an option:");
			op = sc.nextInt();
			switch (op) {
			case 1:
				boolean result = getListBasedOnType(realStates);
				if (result == false) {
					System.err.println("no record found");
				}
				break;
			case 2:
				boolean result1 = getListBasedOnSaleORRent(realStates);
				if (result1 == false) {
					System.err.println("no record found");
				}
				break;
			case 3:
				boolean result2 = getListBasedOnTypeAndSaleOrRent(realStates);
				if (result2 == false) {
					System.err.println("no record found");
				}
				break;
			case 4:
				break;
			default:
				System.out.println("In valid option:");
			}
		} while (op != 4);
	}

	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("choose an option\n1.Search based on type\n2.Search based on rent or sale\n"
				+ "3.First based on Type and then based on Rent or Sale\n4.EXIT\n");
	}

	private static boolean getListBasedOnTypeAndSaleOrRent(Building[] realStates) {
		System.out.println("enter type (1bhk,2bhk,3bhk)");
		String type = sc.next();
		int flag = 0;
		int count = 0;
		for (int j = 0; j < recordCount; j++) {
			if (realStates[j].getType().equalsIgnoreCase(type)) {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println("enter for sale or to let");
			String buying = sc.next() + sc.nextLine();
			for (int i = 0; i < recordCount; i++) {
				if (realStates[i].getHouseStatus().equalsIgnoreCase(buying)
						&& realStates[i].getType().equalsIgnoreCase(type)) {
					count++;
					System.out.println("RealState [buyingHouse=" + realStates[i].getHouseStatus() + ", type="
							+ realStates[i].getType() + ", houseType=" + realStates[i].getHouseSize() + "]");
				}
			}
		}
		if (count > 0) {
			return true;
		}

		return false;
	}

	private static boolean getListBasedOnSaleORRent(Building[] realStates) {
		System.out.println("enter for sale or to let");
		String type = sc.next() + sc.nextLine();
		int count = 0;
		for (int i = 0; i < recordCount; i++) {
			if (realStates[i].getHouseStatus().equalsIgnoreCase(type)) {
				count++;
				System.out.println("RealState [buyingHouse=" + realStates[i].getHouseStatus() + ", type="
						+ realStates[i].getType() + ", houseType=" + realStates[i].getHouseSize() + "]");
			}
		}
		if (count > 0) {
			System.out.println("total count:" + count);
			return true;
		}
		return false;
	}

	// get list based on type
	private static boolean getListBasedOnType(Building[] realStates) {
		System.out.println("enter type (1bhk,2bhk,3bhk)");
		String type = sc.next();
		int count = 0;
		for (int i = 0; i < recordCount; i++) {
			if (realStates[i].getType().equalsIgnoreCase(type)) {
				count++;
				System.out.println("RealState [buyingHouse=" + realStates[i].getHouseStatus() + ", type="
						+ realStates[i].getType() + ", houseType=" + realStates[i].getHouseSize() + "]");
			}
		}
		if (count > 0) {
			System.out.println("total count:" + count);
			return true;
		}

		return false;
	}

	// create records in real state
	private static Building[] createRecords(Building[] realStates) {
		if (realStates != null) {
			Building temp[] = new Building[recordCount + 1];
			for (int k = 0; k < recordCount; k++) {
				temp[k] = realStates[k];
			}
			realStates = temp;
			temp = null;
		} else {
			realStates = new Building[1];
		}

		System.out.println("enter no of records:");
		int size = vs.validateInt(sc.nextInt());
		for (int i = 0; i < size; i++) {
			System.out.println("record " + (i + 1));
			System.out.println("enter house for sale or rent:");
			String buying = ValidatingInputs.validatingBuying(sc.next() + sc.nextLine());
			System.out.println("enter type of house (1Bhk,2BHK,3BHK):");
			String type = ValidatingInputs.validatinType(sc.next());
			System.out.println("enter house size:");
			String houseSize = ValidatingInputs.validatinHouseType(sc.next() + sc.nextLine());
			realStates[recordCount++] = new Building(buying, type, houseSize);

		}
		return realStates;
	}

}
