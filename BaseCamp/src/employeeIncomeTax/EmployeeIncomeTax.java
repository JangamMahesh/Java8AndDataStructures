package employeeIncomeTax;

import java.util.Scanner;

public class EmployeeIncomeTax {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter earnigs of a employee");
		long earnings = sc.nextLong();
		 long incomeTax = (long) getIncomeTax(earnings);
		System.out.println("Income Tax Is " + incomeTax);
	}

	private static double getIncomeTax(long earnings) {
		// TODO Auto-generated method stub
		long amount;
		if (earnings <= 50000) {
			amount = 0;
		} else if (earnings > 50000 && earnings <= 60000) {
			earnings=60000-earnings;
			amount =  (long) (earnings * 0.1) ;
		} else if (earnings > 60000 && earnings <= 150000) {
			earnings=earnings-60000;
			amount =   (long) (earnings * 0.2);
		} else {
			earnings=earnings-150000;
			amount = (long) (earnings *0.3) ;
		}
		return amount;
	}

}
