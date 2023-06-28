package supermarket;
public class Item {
	private int itemCode;
	private int quantity;
	private double MRP;
	private double discount;
	private int soldQuantity;

	public Item() {
	}

	public Item(int itemCode, int quantity, double MRP, double discount) {
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.MRP = MRP;
		this.discount = discount;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getMRP() {
		return MRP;
	}

	public void setMRP(double mRP) {
		MRP = mRP;
	}
	public int getsoldQuantity() {
		return this.soldQuantity;
	}
	public void setsoldQuantity(int quantity) {
		this.soldQuantity=this.soldQuantity+quantity;
		
	}

	

}
