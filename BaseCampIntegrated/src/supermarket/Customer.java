package supermarket;

public class Customer {
	private String mno;
	/* private int quantity; */
	private double price;
	private String name;
	/*
	 * private double discount; private double priceAfterDiscount;
	 */

	/*
	 * public int getItemid() { return itemid; }
	 * 
	 * public void setItemid(int itemid) { this.itemid = itemid; }
	 */
	public Customer() {
		
	}

	public Customer(double price,String name) {
		/* this.itemid = itemid; */
		this.price = price;
		this.name=name;
		/* this.discount = discount; */
	}

	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	/*
	 * public int getQuantity() { return quantity; }
	 * 
	 * public void setQuantity(int quantity) { this.quantity = quantity; }
	 */

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * public double getDiscount() { return discount; }
	 * 
	 * public void setDiscount(double discount) { this.discount = discount; }
	 * 
	 * public double getPriceAfterDiscount() { return priceAfterDiscount; }
	 * 
	 * public void setPriceAfterDiscount(double priceAfterDiscount) {
	 * this.priceAfterDiscount = priceAfterDiscount; }
	 */

}
