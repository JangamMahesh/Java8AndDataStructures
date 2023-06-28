package Customer29;

import java.util.Scanner;

import ItemApplication.Validations;

public class TestApplication {
	static Scanner sc = new Scanner(System.in);
	static Validations validations = new Validations();

	public static void main(String[] args) {

		System.out.println("enter customer id:");
		int cid = sc.nextInt();
		int validId = validations.validateId(cid);

		System.out.println("enter customer name:");
		String name = sc.next();
		String validName = validations.validateString(name);

		Customer c3 = new Customer(validId, validName);
		System.out.println(c3);

		System.out.println("enter address:");
		String address = sc.next() + sc.nextLine();
		String validAddress = validateStrings(address);

		Customer c2 = new Customer(validId, validName, validAddress);
		System.out.println(c2);

		System.out.println("enter branch of bank:");
		String branch = sc.next();
		String validBranch = validations.validateString(branch);

		System.out.println("enter balance:");
		double balance = sc.nextDouble();
		double validBalance = validations.validateDouble(balance);

		Customer c1 = new Customer(validId, validName, validAddress, validBranch, validBalance);
		System.out.println(c1);

		/*
		 * Customer c1 = new Customer(1001,"Kumar","Rajajinagar,Bangalore-10"); Customer
		 * c2 = new Customer(1002,"Raja"); Customer c3 = new
		 * Customer(1003,"Shanthi","Jayanager,Bangalore-20","SBI",1500.0);
		 * System.out.println(c1+"\n"+c2+"\n"+c3);
		 */
	}

	// validate the string
	public static String validateStrings(String string) {
		boolean isValid = true;
		while (isValid) {
			// System.out.println("hello");
			int count = 0;
			for (int i = 0; i < string.length(); i++) {
				// int ch = (int) (s.charAt(i));
				char ch = string.charAt(i);
				if (ch == 32 || ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122 || ch >= 44 && ch <= 46
						|| ch >= 48 && ch <= 57) {
					count++;
				}
			}
			if (count != string.length() || string.length() < 3) {
				System.out.println("invalid input:once again enter");
				string = sc.nextLine();
			} else {
				isValid = false;
			}
		}
		return string;
	}

}
