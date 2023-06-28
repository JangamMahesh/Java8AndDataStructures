package practice;



import java.util.Scanner;

public class Circular {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter fisrst String ");
		String str1 =sc.next();
		String validString1 = validateString(str1);
		System.out.println("length" + validString1.length());
		System.out.println("enter secondString");
		String str2 = sc.next();
		String validString2 = validateString(str2);
		validString1=validString1+validString2;
		System.out.println("cireculars "+ (validString1.indexOf(validString2)));
	
		boolean flag = areStringsCircular(validString1, validString2);
		
		if (flag) {
			System.out.println("they are circular to each other");
		} else {
			System.out.println("they are not circular to each other");
		}

	}

	private static boolean areStringsCircular(String validString1, String validString2) {
		// TODO Auto-generated method stub
		String[] circulars = new String[validString1.length()];
		String temp = "";
		String temp2 = "";
		String clockWise = "";
		for (int i = 0; i < validString1.length(); i++) {
			for (int j = validString1.length() - i; j > i; j--) {
				temp += validString1.charAt(j);
			}
			for (int k = validString1.length(); k < validString1.length() - i; k--) {
				temp2 += validString1.charAt(k);
			}
			clockWise = getReverse(temp2);
			circulars[i] = clockWise + temp;
			temp = "";
			temp2 = "";
		}
		for (int p = 0; p < validString1.length(); p++) {
			if (circulars[p].equals(validString2)) {
				return true;
			}
		}
		return false;
	}

	private static String getReverse(String temp2) {
		// TODO Auto-generated method stub
		String reverse = "";
		for (int r = temp2.length(); r > 0; r++) {
			reverse += temp2.charAt(r);
		}
		return reverse;
	}

	

	private static String validateString(String str) {
		boolean isValid = true;
		while (isValid) {
			int strLength =0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122 || ch == 32) {
					strLength++;
				}
			}
			if (str.length() != strLength) {
				System.out.println("invalid String enter once again");
				str = sc.nextLine();
			} else {
				isValid = false;
			}
		}
		return str;
}
}
