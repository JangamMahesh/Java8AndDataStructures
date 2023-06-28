package books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class TestApplication {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> list = new ArrayList<>();
		System.out.println("enter the number of books");
		int size = validateSize(sc.nextInt());
		sc.nextLine();
		for (int i = 0; i < size; i++) {
			System.out.println("enter book name");
			String bookName = validateString(sc.nextLine());
			System.out.println("enter author name");
			String athuorName = validateString(sc.nextLine());
			
			System.out.println("enter price");
			
			float price = validateFloat(sc.nextFloat());
			sc.nextLine();
			list.add(new Book(bookName, athuorName, price));
		}
		/* Comparable<Book> obj=new Book(); */
		Collections.sort(list,Comparator.comparing(Book::getPrice).thenComparing(Book::getBookName));
		System.out.println("The Sorted Cpllection After Insertion is ");
		for (Book b : list) {
			System.out.println("Book [bookName=" + b.getBookName() + ", authorName=" + b.getAuthorName() + ", price=" + b.getPrice() + "]");
		}
	}

	private static float validateFloat(float nextFloat) {
		// TODO Auto-generated method stub
		boolean isValid = true;
		while (isValid) {
			if (nextFloat <= 0) {
				System.out.println("invalid input:\nit should not contain negative numbers:once again enter:");
				nextFloat = sc.nextFloat();
			} else {
				isValid = false;
			}
		}
		return nextFloat;
	}

	// validate number
	public static int validateSize(int size) {
		boolean isValid = true;
		while (isValid) {
			if (size <= 0 || size >= 30) {
				System.out.println("invalid input:\nit should not contain negative numbers:once again enter:");
				size = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return size;
	}

	// validate string
	public static String validateString(String s) {
		boolean isValid = true;
		while (isValid) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				// int ch = (int) (s.charAt(i));
				char ch = s.charAt(i);
				if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
					count++;
				}
			}
			if (count != s.length() || s.length() < 3) {
				System.out.println("invalid input:once again enter");
				s = sc.next();
			} else {
				isValid = false;
			}

		}
		return s;
	}

	/*
	 * @Override public int compareTo(Book arg0) { // TODO Auto-generated method
	 * stub return this.; }
	 */
	
	/*
	 * public int compare(Book o1, Book o2) { // TODO Auto-generated method stub
	 * return (int) (o1.getPrice()-o2.getPrice()) ; }
	 */
	
}
