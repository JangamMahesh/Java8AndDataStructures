package Palindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("enter the choice:\n1.number palindrome\n 2.string palindrome\n3.exit");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("enter the number:");
				int number = sc.nextInt();
				boolean numberResult = numberPalindrome(number);
				System.out.println(numberResult);
				break;
			case 2:
				System.out.println("enter string:");
				String string = sc.next();
				boolean stringResult = stringPalindrome(string);
				System.out.println(stringResult);
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid option");

			}
		} while (op != 3);

	}

//string palindrome
	private static boolean stringPalindrome(String string) {
		int length = string.length();
		// String b = s;
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse += string.charAt(i);
		}
		System.out.println(reverse);
		if (reverse.equalsIgnoreCase(string)) {
			// System.out.println("palindrome:");
			return true;
		} else {
			// System.out.println("not palindrome:");
			return false;
		}
	}

//number palindrome
	private static boolean numberPalindrome(int number) {
		int temp = number;
		int reverse = 0;
		while (number != 0) {
			int rem = number % 10;
			reverse = reverse * 10 + rem;
			number = number / 10;
		}
		if (temp == reverse) {
			// System.out.println("palindrome");
			return true;
		} else {
			// System.out.println("not palindrome:");
			return false;
		}
	}

}
