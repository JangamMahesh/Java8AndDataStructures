package bikeShowRoom;

import java.util.Scanner;

public class TestApplication {
	static Scanner sc = new Scanner(System.in);
	static Validations vs = new Validations();
	static int bikeCount = 0;
	public static void main(String[] args) {
		Bike bikes[] = null;
		System.out.println("******WELCOME TO BIKE SHOWROOM****\n");
		int op;
		do {
			displayMenu();
			System.out.println("enter option:");
			op = sc.nextInt();
			switch (op) {
			case 1:
				bikes = createBikes(bikes);
				break;
			case 2:
				if (bikeCount == 0) {
					System.out.println("sorry no records found:");
				} else {
					System.out.println("Display Bikes sorted by make:");
					Bike sortedBikes[] = getSortedBikesBasedOnMake(bikes);
					display(sortedBikes);
					/*
					 * for (int i = 0; i < count; i++) { System.out.println("Bike [make=" +
					 * sortedBikes[i].getMake() + ", model=" + sortedBikes[i].getModel() + ", type="
					 * + sortedBikes[i].getType() + ", engineCC=" + sortedBikes[i].getEngineCC() +
					 * ", price=" + sortedBikes[i].getPrice() + "]"); }
					 */
				}
				break;
			case 3:
				if (bikeCount == 0) {
					System.out.println("sorry no records found:");
				} else {
					System.out.println("Display records based on type and then make");
					Bike sortedBikeByType[] = getSortedBikeBasedOnType(bikes);
					display(sortedBikeByType);
					/*
					 * System.out.println("Display recorrds based on make:"); Bike
					 * sortedBikesbasedmake[] = getSortedBikesBasedOnMake(bikes);
					 * display(sortedBikesbasedmake);
					 */
				}
				break;
			case 4:
				if (bikeCount == 0) {
					System.out.println("sorry no records found:");
				} else {
					System.out.println("least and expensive bike in showroom:");
					Bike maxmin[] = getMaxMinPricesOfBikes(bikes);
					displayBikes(maxmin);
					
				}
				break;
			case 5:
				break;
			default:
				System.out.println("invalid option:");
			}

		} while (op != 5);
	}

	private static void displayBikes(Bike[] maxmin) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < maxmin.length; i++) {
			System.out.println("Bike [make=" + maxmin[i].getMake() + ", model=" + maxmin[i].getModel()
					+ ", type=" + maxmin[i].getType() + ", engineCC=" + maxmin[i].getEngineCC() + ", price="
					+ maxmin[i].getPrice() + "]");
		}
	}
	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("choose an option\n1.ADD NEWBIKE DETAILS\n2.DISPLAY BIKES SORTED BY MAKE\n"
				+ "3.DISPLAY BIKES BASED ON TYPE AND THEN MAKE\n4.LEAST & EXPENSIVE PRICE OF BIKE\n5.EXIT");
	}

//get max and min prices of bike
	private static Bike[] getMaxMinPricesOfBikes(Bike[] bikes) {
		Bike maxMin[] = new Bike[2];
		Bike max = bikes[0];
		Bike min = bikes[0];
		for (int i = 0; i < bikeCount; i++) {
			if (bikes[i].getPrice() > max.getPrice()) {
				max = bikes[i];
			}
			if (bikes[i].getPrice() < min.getPrice()) {
				min = bikes[i];
			}
		}
		maxMin[1] = max;
		maxMin[0] = min;
		return maxMin;
	}

//display function
	private static void display(Bike[] sortedBikeByType) {
		for (int i = 0; i < bikeCount; i++) {
			System.out.println("Bike [make=" + sortedBikeByType[i].getMake() + ", model="
					+ sortedBikeByType[i].getModel() + ", type=" + sortedBikeByType[i].getType() + ", engineCC="
					+ sortedBikeByType[i].getEngineCC() + ", price=" + sortedBikeByType[i].getPrice() + "]");
		}

	}

//get sorting bikes based on type
	private static Bike[] getSortedBikeBasedOnType(Bike[] bike) {

		for (int i = 0; i < bikeCount; i++) {
			for (int j = 0; j < bikeCount - 1 - i; j++) {
				if (bike[j].getType().compareToIgnoreCase(bike[j + 1].getType()) > 0) {
					Bike temp = bike[j];
					bike[j] = bike[j + 1];
					bike[j + 1] = temp;
				} else {
					bike=getSortedBikesBasedOnMake(bike);
				}
			}
		}
		return bike;
	}
//sorting based on make 
//bubble sort
	private static Bike[] getSortedBikesBasedOnMake(Bike[] bike) {
		for (int i = 0; i < bikeCount; i++) {
			for (int j = 0; j < bikeCount - 1 - i; j++) {
				if (bike[j].getMake().compareToIgnoreCase(bike[j + 1].getMake()) > 0) {
					Bike temp = bike[j];
					bike[j] = bike[j + 1];
					bike[j + 1] = temp;
				}
			}

		}
		return bike;
	}
	// create bikes
	private static Bike[] createBikes(Bike[] bikes) {
		if (bikes != null) {
			Bike temp[] = new Bike[bikeCount + 1];
			for (int p = 0; p < bikeCount; p++) {
				temp[p] = bikes[p];
			}
			bikes = temp;
			temp = null;
		} else {
			bikes = new Bike[1];
		}
		System.out.println("enter make of the bike:");
		String make = sc.next();
		String validMake = vs.validateString(make);
		System.out.println("enter model of the bike like(2017,2018, 2019,2020):");		
		int validModel =sc.nextInt();
		System.out.println("enter type of the bike:");
		String type = sc.next();
		String validType = vs.validateType(type);
		System.out.println("enter engineCC:");
		int ecc = sc.nextInt();
		int validEcc = vs.validateECC(ecc);
		System.out.println("enter price of a bike:");
		long price = sc.nextLong();
		long validPrice = vs.validatePrice(price);
		bikes[bikeCount++] = new Bike(validMake, validModel, validType, validEcc, validPrice);
		return bikes;
	}

}
