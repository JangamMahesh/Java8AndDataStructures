package product;
public class Product {
	private int producId;
	private int price;
	private String prodcutName;
	private int count;
	public Product(int producId, int price, String prodcutName, int count) {
		//super();
		this.producId = producId;
		this.price = price;
		this.prodcutName = prodcutName;
		this.count = count;
	}

	public int getProducId() {
		return producId;
	}

	public void setProducId(int producId) {
		this.producId = producId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProdcutName() {
		return prodcutName;
	}

	public void setProdcutName(String prodcutName) {
		this.prodcutName = prodcutName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean getDiscount() {
		// TODO Auto-generated method stub
		return false;
	}

}
