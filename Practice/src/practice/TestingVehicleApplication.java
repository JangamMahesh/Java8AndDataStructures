package practice;
import java.util.Scanner;
public class TestingVehicleApplication {
	static Scanner sc = new Scanner(System.in);
	static VS vs = new VS();
	static int count = 0;

	public static void main(String[] args) {
		int op;
		int index = 0;
		String uniqueVno = null;
		String validVET = null;
		String validET = null;
		Vehicle parking[] = new Vehicle[100];

		do {
			System.out.println(
					"choose an option\n1.Check Available parking\n2.Enter vehicle number for parking\n3.entry time of vehicle\n"
							+ "4.Allocate the slot for vehicle\n5.Parking fee\n6.program exit\n");
			System.out.println("enter an option:");
			op = sc.nextInt();

			switch (op) {
			case 1:

				boolean result = checkAvailableParking(parking);
				if (result == false) {
					System.out.println("No parking slots are available:");
				}
				break;
			case 2:
				System.out.println("enter vehicle Number:");
				String validNumber = VS.vehicleNoValidation(sc.next());
				System.out.println(count);
				if (count > 0) {
					System.out.println(count);
					uniqueVno = getUniqueVehicleNumber(validNumber, parking);
				} else {
					uniqueVno = validNumber;
				}
				break;
			case 3:
				System.out.println("enter entry time of vehicle");
				validVET = vs.validateTime(sc.next());
			case 4:
				Vehicle parkings = new Vehicle();
				parkings.setEntryTime(validVET);
				parkings.setVid(uniqueVno);
				parking[count] = parkings;
				count++;
				System.out.println("[ vehicle id:" + parkings.getVid() + ", vehicle entry time:"
						+ parkings.getEntryTime() + ", vehicle exit time:" + parkings.getExitTime() + "]");
				System.out.println("Allocated successfully:");
				break;
			case 5:
				int result1 = checkVehicleNumber(parking);
				if (result1 >= 0) {
					int fee = getParkingFee(parking, result1);
					if (fee > 0) {
						System.out.println("parking fee:  " + fee);
						System.out.println(parking[result1].getVid() + " " + parking[result1].getEntryTime() + " "
								+ parking[result1].getExitTime());
						// delete record

						/*
						 * for (int j = result1; j < count - 1; j++) { parking[j].setVid(parking[j +
						 * 1].getVid()); parking[j].setEntryTime(parking[j + 1].getEntryTime());
						 * parking[j].setExitTime(parking[j + 1].getExitTime());
						 * 
						 * }
						 */
						parking[result1].setVid("0");
						parking[result1].setEntryTime("NA");
						parking[result1].setExitTime("NA");

					}
				} else {
					System.err.println("vehicle number is not found");
				}
				break;
			case 6:
				break;
			default:
				System.out.println("Invalid option:");
			}
		} while (op != 6);

	}

	private static String getUniqueVehicleNumber(String validId, Vehicle[] parking) {
		boolean isValid = true;
		while (isValid) {
			int flag = 0;
			for (int j = 0; j < count; j++) {
				if (parking[j].getVid().equalsIgnoreCase(validId)) {
					flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println("vehicle number is already exist:once again enter:");
				validId = sc.next();
			} else {
				isValid = false;
			}
		}
		return validId;
	}

//display vehicles
	private static void displayVehicles(Vehicle[] parking) {
		for (int i = 0; i < count; i++) {
			System.out.println("[ vehicle id:" + parking[i].getVid() + ", vehicle entry time:"
					+ parking[i].getEntryTime() + ", vehicle exit time:" + parking[i].getExitTime() + "]");
		}

	}

	private static int checkVehicleNumber(Vehicle[] parking) {
		System.out.println("enter vehicle number:");
		String vno = vs.vehicleNoValidation(sc.next());
		int index = -1;
		for (int i = 0; i < count; i++) {
			if (parking[i].getVid().equalsIgnoreCase(vno)) {
				System.out.println("enter exit time of vehicle:");
				String validET = vs.validateTime(sc.next());
				parking[i].setExitTime(validET);
				index = i;
			}
		}
		return index;
	}

//getparking fee
	private static int getParkingFee(Vehicle[] parking, int result1) {
		// int counts = count - 1;
		int hrs = 0;
		int min = 0;
		int fee = 0;
		int flag = 0;
		String entry = parking[result1].getEntryTime();
		String exit = parking[result1].getExitTime();
		String entryHH = "";
		String exitHH = "";
		entryHH += entry.charAt(0);
		entryHH += entry.charAt(1);
		exitHH += exit.charAt(0);
		exitHH += exit.charAt(1);
		String entryMin = "";
		String exitMin = "";
		entryMin += entry.charAt(3);
		entryMin += entry.charAt(4);
		exitMin += exit.charAt(3);
		exitMin += exit.charAt(4);
		int enHH = getInt(entryHH);
		int enMM = getInt(entryMin);
		int exHH = getInt(exitHH);
		int exMM = getInt(exitMin);
		if (enHH <= exHH) {
			// checking for minutes
			if (enMM <= exMM) {
				hrs = exHH - enHH;
				min = exMM - enMM;
			} else {
				hrs = exHH - enHH;
				min = enMM - exMM;
			}
		} else {
			flag = 1;
		}
		if (flag == 0) {
			if (hrs <= 2) {
				fee = 50;
			} else {
				fee = 50 + ((hrs - 2) * 30);
			}
		}
		if (flag == 1) {
			System.out.println("exit time must be greater than entry time:");
		}
		return fee;
	}

	// check available parking
	private static boolean checkAvailableParking(Vehicle[] parking) {
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if (parking[i] == null) {
				count++;
			} else if (parking[i].getVid().equals("0")) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("yes,available parking slots are:" + count);
			return true;
		}
		return false;
	}

	// convert strings into int
	private static int getInt(String hour) {
		char charArray[] = new char[hour.length()];
		for (int i = 0; i < hour.length(); i++) {
			charArray[i] = hour.charAt(i);
		}
		int sum = 0;
		// ascii value for zero
		int zeroAscii = (int) '0';
		for (char c : charArray) {
			int ascii = (int) c;
			sum = (sum * 10) + (ascii - zeroAscii);
		}
		return sum;
	}
}
