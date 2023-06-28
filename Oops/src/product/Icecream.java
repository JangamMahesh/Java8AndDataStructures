package product;

public class Icecream extends Product {
	private String type;
	private boolean discount = false;

	public Icecream(int producId, int price, String prodcutName, int count, String type) {
		super(producId, price, prodcutName, count);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getDiscount() {
		return this.discount;
	}


	
}
