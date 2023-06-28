package BookStoreApplication;

public class Book {
	private String authorName;
	private String bookTitle;
	private Double bookPrice;
	private int bookPublishedYear;
	
	
	public Book(String authorName, String bookTitle, Double bookPrice, int bookPublishedYear) {
		this.authorName = authorName;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.bookPublishedYear = bookPublishedYear;
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public int getBookPublishedYear() {
		return bookPublishedYear;
	}
	public String toString() {
		return "Book [authorName=" + authorName + ", bookTitle=" + bookTitle + ", bookPrice=" + bookPrice
				+ ", bookPublishedYear=" + bookPublishedYear + "]";
	}

}
