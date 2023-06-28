package furniture;

public class Furniture {
	private String category;
	private double price;
	private String itemName;

	public Furniture(String itemName, String category, double price) {
		this.itemName = itemName;
		this.category = category;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
