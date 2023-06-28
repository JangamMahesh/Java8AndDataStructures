package com.mindtree.PayMents.App;

public class PayMent {

	private int id;
	private String customerName;
	private double amount;
	private int cardNumber;

	public PayMent() {
		
		// TODO Auto-generated constructor stub
	}

	public PayMent(int id, String customerName, double amount, int cardNumber) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.amount = amount;
		this.cardNumber = cardNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	
	

}
