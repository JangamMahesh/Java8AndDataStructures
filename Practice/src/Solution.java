import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = Solution.getCorrectString(str);
		System.out.println(result);
		
	
	}

	public static String getCorrectString(String str) {

		char one = str.charAt(0);
		char two = str.charAt(2);
		String result = "";

		if (str.charAt(0) == 'S' && str.charAt(2) == 'M') {

			str = str.substring(4, str.length() - 2);

			System.out.println(str);
			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
					char c = Character.toLowerCase(str.charAt(i));
					result+=" " + Character.toString(c);
					result += str.substring(i+1);
					break;
				} else {
					result += str.charAt(i);
				}
			}
		}
		return result;
	}
}