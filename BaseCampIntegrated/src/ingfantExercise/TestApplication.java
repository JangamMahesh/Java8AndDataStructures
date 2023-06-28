package ingfantExercise;

import java.util.Scanner;

import validations.Validations;

public class TestApplication {
	static Scanner sc = new Scanner(System.in);
	static Validations vs = new Validations();
	static int count;

	public static void main(String[] args) {
		/*
		 * System.out.println("enter number of infants:"); int size = sc.nextInt(); int
		 * validSize = vs.validateSize(size);
		 */
		Infant infants[] = {};
		int op = 0;
		// create infants based on numbers

		do {
			System.out.println("1.add Infant details \n2. exit");
			System.out.println("choose option");
			op = vs.validateInt(sc.nextInt());
			
			switch (op) {
			case 1:
				createInfants(infants);
				break;
			case 2:
				break;
			default:
				System.out.println("invalid option");
				break;
			}

		} while (op != 2);
		// getVacination details
		/*
		 * System.out.println("enter age for vaccination details:"); double age =
		 * sc.nextDouble(); double validAge = vs.validateInfant(age);
		 */

	}

	public static void pendingVaccinations(int count) {
		if (count == 1) {
			System.out.println("pending vaccinations:vac3,vac4,vac5,vac6");
		}
		if (count == 2) {
			System.out.println("pending vaccinations:vac5,vac6");
		}
		if (count == 3) {
			System.out.println("No pendings:");
		}
	}

//infant details
	private static int getVaccinationDetails(double validAge) {

		if (validAge >= 0 && validAge < 6) {
			System.out.println("vac1,vac2 are required");
			count = 1;
		}
		if (validAge >= 6 && validAge < 12) {
			System.out.println("vac3,vac4 are requrired:");
			count = 2;
		}
		if (validAge >= 12 && validAge <= 24) {
			System.out.println("vac5,vac6 are required");
			count = 3;
		}
		return count;
	}

	// create infants
	private static Infant[] createInfants(Infant[] infants) {
		if (infants != null) {
			Infant temp[] = new Infant[count + 1];
			for (int p = 0; p < count; p++) {
				temp[p] = infants[p];
			}
			infants = temp;
			temp = null;
		} else {
			infants = new Infant[1];
		}
		int validId = 0;
		int uniqueId = 0;
		System.out.println("infant:");
		System.out.println("enter infant id:");
		int id = sc.nextInt();
		validId = vs.validateInt(id);
		if (count > 0) {
			uniqueId = getUniqueId(validId, infants, count);
		} else {
			uniqueId = validId;
		}
		System.out.println("enter name of the infant:");
		String name = sc.next();
		String validName = vs.validateString(name);

		System.out.println("enter gender:");
		char ch = sc.next().charAt(0);
		char validGender = vs.validateGender(ch);

		System.out.println("enter weight:");
		double weight = sc.nextDouble();
		double validWt = vs.validateDouble(weight);

		System.out.println("enter age:");
		double age = sc.nextDouble();
		double validAge = vs.validateInfant(age);

		infants[count] =new Infant();
		infants[count].setName(name);
		infants[count].setAge(validAge);
		infants[count].setGender(ch);
		infants[count].setId(uniqueId);
		infants[count].setWeight(validWt);
		
		System.out.println("Infant [id=" + infants[count].getId() + ", name=" + infants[count].getName() + ", age="
				+ infants[count].getAge() + ", gender=" + infants[count].getGender() + ", weight="
				+ infants[count].getWeight() + "]");
		int count = getVaccinationDetails(validAge);
		pendingVaccinations(count);

		return infants;
	}

	// checking unique id
	private static int getUniqueId(int validId, Infant[] infants, int i) {
		boolean isValid = true;
		while (isValid) {
			int flag = 0;
			for (int j = 0; j < i; j++) {
				if (infants[j].getId() == validId) {
					flag = 1;
				}
				if (flag == 1) {
					System.out.println("userid is already exist:once again enter:");
					validId = sc.nextInt();
				} else {
					isValid = false;
				}
			}
		}
		return validId;
	}

}
