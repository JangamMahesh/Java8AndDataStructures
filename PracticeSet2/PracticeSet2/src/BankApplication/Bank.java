package BankApplication;

public class Bank {

	private String accountNo;
	private String name;
	private String accountType;
	private String dob;
	private float balance;
	private String address;

	public Bank(String accountNo, String name, String accountType, String dob, float balance, String address) {
		this.accountNo = accountNo;
		this.name = name;
		this.accountType = accountType;
		this.dob = dob;
		this.balance = balance;
		this.address = address;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
