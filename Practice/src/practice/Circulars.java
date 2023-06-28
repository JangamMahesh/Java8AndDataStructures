package practice;

import java.util.Scanner;

public class Circulars {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		String str = sc.next();
		System.out.println("enter aother string");
		String anotherString = sc.next();
		if (str.length() == anotherString.length()) {
			boolean circular = areStringsCircular(str, anotherString);
			System.out.println();
			if (circular) {
				System.out.println("they are circlular");
			} else {
				System.out.println("they are not circular");
			}
		}
	}
	private static boolean areStringsCircular(String str, String anotherString) {
		// TODO Auto-generated method stub
		//abcde eabcd 
		String temp = "";
		String circular = "";
		String[] circulars = new String[str.length()];
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(str.length() - 1) + str;
			for (int j = 0; j < temp.length() - 1; j++) {
				circular += temp.charAt(j);	
			}
			circulars[i] = circular;
			str=circular;
			circular = "";
			temp = "";
		}
		for (int l = 0; l < circulars.length; l++) {
			System.out.print(circulars[l] + " ");
		}
		for (int k = 0; k < circulars.length; k++) {
			if (circulars[k].compareToIgnoreCase(anotherString) == 0) {
				return true;
			}
		}
		return false;
	}

}
