package com.mindtree.PayMents.App;

import java.util.Iterator;
import java.util.Scanner;

public class ClientApplication {
	static Scanner sc = new Scanner(System.in);
	static boolean customerFound = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number of Cusotmer");
		int size = sc.nextInt();
		PayMent payment[] = new PayMent[size];
		int op = 0;
		do {
			op = displayMenu();
			switch (op) {
			case 1:
				payment = addDetails(payment);
				displayDeatails(payment);
				break;

			case 2:
				System.out.println("enter Customer Id");
				int id = sc.nextInt();
				System.out.println("Enter amount");
				int amount = sc.nextInt();
				payment = addAmountCustomer(id, amount, payment);
				if (!customerFound) {
					System.out.println("Cusotmer Not Found");
				}
				displayDeatails(payment);
				break;
			case 3:
				sc.close();
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		} while (op != 3);
	}
	private static PayMent[] addAmountCustomer(int id, int amount, PayMent[] payment) {
		// TODO Auto-generated method stub

		for (int i = 0; i < payment.length; i++) {
			if (payment[i].getId() == id) {
				payment[i].setAmount(amount);
				customerFound = true;
			}
		}
		return payment;
	}

	private static void displayDeatails(PayMent[] payment) {
		// TODO Auto-generated method stub

		for (int i = 0; i < payment.length; i++) {
			System.out.println(payment[i]);
		}
	}

	private static PayMent[] addDetails(PayMent[] payment) {
		// TODO Auto-generated method stub
		for (int i = 0; i < payment.length; i++) {
			System.out.println("ENter Id");
			int id = sc.nextInt();
			int uniqueId = 0;
			if (i > 0) {
				uniqueId = getUnique(payment, i, id);
			} else {
				uniqueId = id;
			}
			System.out.println("enter Name");
			String customername = sc.next();
			System.out.println("Enter amount");
			double amount = sc.nextDouble();
			System.out.println("enter Card Number");
			int cardNumber = sc.nextInt();
			payment[i] = new PayMent(uniqueId, customername, amount, cardNumber);
		}
		return payment;
	}

	private static int getUnique(PayMent[] payment, int i, int id) {
		// TODO Auto-generated method stub
		boolean isValid = true;
		int idNumber = id;
		int count = 0;
		while (isValid) {
			for (int j = 0; j < i; j++) {
				if (payment[j].getId() == idNumber) {
					System.out.println("Already Exist please Enter new One");
					idNumber = sc.nextInt();
				} else {
					count++;
				}

			}
			if (count == i) {
				isValid = false;
			}
		}
		return idNumber;
	}

	private static int displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. Add Details");
		System.out.println("2.Update Amount of Customer");
		System.out.println("3.Exit");
		return sc.nextInt();
	}

}
