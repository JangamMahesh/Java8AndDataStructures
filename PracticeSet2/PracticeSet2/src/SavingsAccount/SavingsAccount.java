package SavingsAccount;

public class SavingsAccount {
	private double balance;
	private int interestRate;
	private int accountNo;

	/*SavingsAccount() {
		balance = 1000.0;
		interestRate = 2;
		accountNo = 12345;
	}*/
	/*public SavingsAccount(double balance, int interestRate, int accountNo) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNo = accountNo;
	}*/

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

}
