import java.util.Scanner;

public class ReverseString {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("etner a string");
		String str = sc.next();
		String reverseString = getReverseString(str);
		System.out.println(reverseString);
	}

	private static String getReverseString(String str) {
		// TODO Auto-generated method stub
		String reverse = "";
		for (int i = str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

}
