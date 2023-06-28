package BookStoreApplication;
import java.util.Scanner;

import ItemApplication.Validations;

public class BookStoreApplication {
	static Scanner sc = new Scanner(System.in);
	static Validations validations = new Validations();

	public static void main(String[] args) {
//		create book objects
//		search for book ..and if is there in book store then print details of the book

		Book books[] = createBooks();

		int op;
		do {
			System.out.println("Choose an option\n1.find book\n2.display\n3.exit");
			System.out.println("enter an option:");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("enter the book_store employee id:");
				int eid = sc.nextInt();
				int validEid = validations.validateId(eid);
				System.out.println("enter book:");
				String bookName = sc.next()+sc.nextLine();
				// System.out.println(bookName);
				boolean result = findBook(books, bookName);
				if (result == false) {
					System.out.println("\nNO BOOK IS FOUND");
				}
				break;
			case 2:
				for (int i = 0; i < books.length; i++) {
					System.out.println(books[i]);
				}
				break;
			case 3:
				break;
			default:
				System.out.println("in valid option:\n");

			}
		} while (op != 3);
	}
	//finding book

	public static boolean findBook(Book[] books, String bookName) {
		// String validBook = validateStrings(bookName);
		for (int i = 0; i < books.length; i++) {
			if (bookName.equalsIgnoreCase(books[i].getBookTitle())) {
				//System.out.println("hello");
				System.out.println(books[i]);
				// flag = 1;
				return true;

			}
		}
		return false;
	}

	// create books

	private static Book[] createBooks() {
		System.out.println("enter no of books:");
		int number = sc.nextInt();
		int validNumber = validations.validateId(number);
		Book books[] = new Book[validNumber];
		for (int i = 0; i < validNumber; i++) {
			System.out.println("enter book author name:");
			// sc.next();
			String author = sc.next()+sc.nextLine();
			// System.out.println(author);
			String validAuthor = validateStrings(author);

			System.out.println("enter book title:");
			String title = sc.nextLine();
			String validTitle = validateStrings(title);

			System.out.println("enter book price:");
			double price = sc.nextDouble();
			double validPrice = validations.validateDouble(price);

			// String validtitler=validateStrings(title);

			System.out.println("enter book published year:");
			int year = sc.nextInt();
			int validYear = validations.validateYear(year);
			Book book = new Book(validAuthor, validTitle, validPrice, validYear);
			books[i] = book;

		}
		return books;
	}

	// validate the string
	public static String validateStrings(String string) {
		boolean isValid = true;
		while (isValid) {
			//System.out.println("hello");
			int count = 0;
			for (int i = 0; i < string.length(); i++) {
				// int ch = (int) (s.charAt(i));
				char ch = string.charAt(i);
				if (ch == 32 || ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
					count++;
				}
			}
			if (count != string.length() || string.length() < 3) {
				System.out.println("invalid input:once again enter");
				string = sc.nextLine();
			} else {
				isValid = false;
			}
		}
		return string;
	}
}

/*
 * Book b1 = new Book("DanielDefoe", "RobinsonCrusoe", 15.50, 1719); Book b2 =
 * new Book("JosephConrad", "HeartOfDarkness", 12.80, 1902); Book b3 = new
 * Book("PatConroy", "BeachMusic", 9.50, 1996);
 */

/*
 * System.out.println("enter book author name:"); String author=sc.nextLine();
 * System.out.println(author.length()); String
 * validAuthor=validateStrings(author);
 * System.out.println("enter book title name:"); String title=sc.nextLine();
 * String validTitle=validateStrings(title);
 */
/*
 * System.out.println("enter book title:"); String title=sc.nextLine();
 */

/*
 * if(validBook.equalsIgnoreCase(b1.getBookTitle())) { System.out.println(b1); }
 * else if((validBook.equalsIgnoreCase(b2.getBookTitle()))) {
 * System.out.println(b2); } else
 * if((validBook.equalsIgnoreCase(b3.getBookTitle()))) { //
 * System.out.println("author_name:"+b3.getAuthorName()+"\n book_title:"+b3.
 * getBookTitle()+"\n book_price:"+b3.getPrice()+"\n book_published_year:"+b3.
 * getYear()); System.out.println(b3); } else {
 * System.out.println("\n no book found"); }
 */


