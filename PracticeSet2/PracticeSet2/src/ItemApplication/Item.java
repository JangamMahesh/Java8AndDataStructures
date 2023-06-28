package ItemApplication;

public class Item {
	private int itemId;
	private double itemPrice;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Item(int itemId, double itemPrice) {
		this.itemId = itemId;
		this.itemPrice = itemPrice;
	}

	public String toString() {
		return "Item [itemId=" + itemId + ", itemPrice=" + itemPrice + "]";
	}	



}
