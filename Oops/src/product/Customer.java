package product;

public class Customer {
	private int productId;
	private int quantity;
	private float bill;
	
	public Customer() {
		
	}
	public Customer(int productId, int quantity) {
		
		this.productId = productId;
		this.quantity = quantity;
		
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity =this.quantity;
	}
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = this.bill+bill;
	}

	

}
