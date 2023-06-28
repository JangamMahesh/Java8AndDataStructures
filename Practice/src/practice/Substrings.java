package practice;

import java.util.Scanner;

public class Substrings {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		String string = sc.next();
		String substrings[] = getSubstrings(string);
		display(substrings);

	}
	private static void display(String[] substrings) {
		// TODO Auto-generated method stub
		for (int i = 0; i < substrings.length; i++) {
			if (substrings[i] != null) {
				System.out.print(substrings[i] + "  ");
			}
		}
	}
	private static String[] getSubstrings(String string) {
		// TODO Auto-generated method stub
		String substrings[] = new String[(string.length() * 2) + 2];
		String word = "";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			for (int j = i; j <string.length(); j++) {
				word += string.charAt(j);
				substrings[count++] = word;
			}
			word = "";
		}
		return substrings;
	}

}
