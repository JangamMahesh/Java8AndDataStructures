package books;

public class Book /* implements Comparable<Book> */ {
	private String bookName;
	private String authorName;
	private float price;
	public Book(String bookName, String authorName, float price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	/*
	 * public int compareTo(Book o) { // TODO Auto-generated method stub if
	 * (this.getPrice() > o.getPrice()) return 1;
	 * 
	 * else if (this.getPrice() < o.getPrice()) return -1; return
	 * this.getAuthorName().compareTo(o.getAuthorName()); }
	 */

}
