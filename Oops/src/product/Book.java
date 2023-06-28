package product;

public class Book extends Product {
	private String publishedDate;
	private String authorName;
	private boolean discount=true;
	public Book(int producId, int price, String prodcutName, int count, String authorName,String publishedDate) {
		super(producId, price, prodcutName, count);
		this.publishedDate = publishedDate;
		this.authorName = authorName;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public boolean getDiscount() {
		return this.discount;
	}
	@Override
	public String toString() {
		return "Book [publishedDate=" + publishedDate + ", authorName=" + authorName + ", discount=" + discount
				+ ", getPublishedDate()=" + getPublishedDate() + ", getAuthorName()=" + getAuthorName()
				+ ", getDiscount()=" + getDiscount() + ", getProducId()=" + getProducId() + ", getPrice()=" + getPrice()
				+ ", getProdcutName()=" + getProdcutName() + ", getCount()=" + getCount() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
