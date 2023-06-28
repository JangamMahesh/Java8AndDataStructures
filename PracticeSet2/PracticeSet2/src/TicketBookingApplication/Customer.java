package TicketBookingApplication;

public class Customer {
	private int customerId;
	private String customerName;
	private int customerAge;
	private String mobileNumber;
	private String dob;
	private String address;
	public Customer(int customerId, String customerName, int customerAge, String mobileNumber, String dob,
			String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.mobileNumber = mobileNumber;
		this.dob = dob;
		this.address = address;
	}
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ ", mobileNumber=" + mobileNumber + ", dob=" + dob + ", address=" + address + "]";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
