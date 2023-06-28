package wordCounting;
import java.util.Scanner;
public class CountOfWords {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		int count = 0;
		String validString = "";
		do {
			System.out.println(
					"enter your option \n 1.Enter a string \n 2.count the number of words in given string \n 3.Count number of vowels in string \n 4. Return array of words of a given strings \n 5.exit");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("enter a sentence");
				String str = sc.nextLine()+sc.nextLine();
				validString = validateString(str);
				System.out.println("sentence Length is  " + validString.length());
				break;
			case 2:
				count = countOfWords(validString);

				System.out.println("Number of words in given string is " + count);
				break;
			case 3:
				int countOfVowels = countingOfVowels(validString);
				System.out.println("number of vowels " + countOfVowels);
				break;
			case 4:
				String[] words = arrayOfWords(validString, count);
				print(words);
				break;
			case 5:
				break;
			default:
				System.out.println("invalid option");

			}

		} while (op != 5);
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

	private static String[] arrayOfWords(String str, int count) {
		// TODO Auto-generated method stub
		int countOfWords = 0;
		String temp = "";
		String[] arrayOfWords = new String[count];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 32) {
				temp += str.charAt(i);
			} else {
				arrayOfWords[countOfWords] = temp;
				temp = "";
				countOfWords++;
			}
		}
		arrayOfWords[countOfWords]=temp;
		return arrayOfWords;
	}

	private static void print(String[] words) {
		// TODO Auto-generated method stub
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
		System.out.println();

	}

	private static int countingOfVowels(String str) {
		// TODO Auto-generated method stub
		int temp = 0;
		String lowerCaseString = convertToLower(str);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				temp++;
			}
		}
		return temp;
	}

	private static String convertToLower(String str) {
		// TODO Auto-generated method stub
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				temp += str.charAt(i) + 32;
			} else {
				temp += str.charAt(i);
			}
		}
		return temp;
	}

	private static int countOfWords(String str) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != 32 && str.charAt(i + 1) == 32) {
				count++;
			}
		}
		return count+1;
	}

}
