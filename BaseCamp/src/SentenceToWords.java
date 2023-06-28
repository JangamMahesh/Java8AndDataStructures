import java.util.Scanner;

public class SentenceToWords {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a sentence");
		String sentence = sc.nextLine();
		String array[] = getWords(sentence);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	private static String[] getWords(String sentence) {
		// TODO Auto-generated method stub
		// by by by
		int count = 0;
		int count2=0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == 32) {
				count++;
			}
		}
		String array[] = new String[count + 1];
		String temp = "";
		for (int j = 0; j < sentence.length(); j++) {
			if (sentence.charAt(j) != 32) {
				temp += sentence.charAt(j);
			} else {
				array[count2++] = temp;
				temp = "";
			}
		}
		array[count2]=temp;
		return array;
	}

}
