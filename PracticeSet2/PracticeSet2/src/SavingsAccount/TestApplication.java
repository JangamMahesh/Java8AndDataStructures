package SavingsAccount;

import java.util.Scanner;

import ItemApplication.Validations;



import java.util.Scanner;

import ItemApplication.Validations;


public class TestApplication {
	static SavingsAccount savingaccount =  new SavingsAccount();
	public static void main(String[] args) {
		// create savingsAccount object
		// create withdraw method and calculate interest method if balance >given amount
		Validations validations = new Validations();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount");
		int amount = sc.nextInt();
		int validAmount = validations.validateId(amount);
		/// default constructor
		/*
		 * savings_account s1 = new savings_account(); s1.withdraw(amount);
		 * s1.calculateInterest();
		 */
		//parameterized constructor
		System.out.println("enter the balance");
		double balance=sc.nextDouble();
		double validBalance=validations.validateDouble(balance);
		
		System.out.println("enter the interest rate:");
		int rate = sc.nextInt();
		int validRate=validations.validateId(rate);
		
		System.out.println("enter the account no:");
		int acno= sc.nextInt();
		int validAcno=validations.validateId(acno);
		
		
		savingaccount.setBalance(validBalance);
		savingaccount.setInterestRate(validRate);
		savingaccount.setAccountNo(validAcno);
		
		
		
		withdraw(validAmount);
		
		calculateInterest();

	}
	//withdraw method
		public static  void withdraw(int validAmount) {
			// TODO Auto-generated method stub
			if(savingaccount.getBalance()>validAmount)
			{
				double bal=savingaccount.getBalance()-validAmount;
				savingaccount.setBalance(bal);
				System.out.println("Successfully withdraw!!!\n");
				System.out.print("balance is :"+bal);
			}
			else
			{
				System.out.println("balance is smaller then amount that withdraw");
			}
			
		}
		//calculate interest
		public static  void calculateInterest()
		{
			if(savingaccount.getBalance()<100)
			{
				System.out.println("no interest found:");
			}
			else
			{
				int t=1;
				System.out.println("\nsimple interest is:");
				double si= (savingaccount.getBalance()*t*savingaccount.getInterestRate())/100;
				System.out.println(si);
			}
		}
}
