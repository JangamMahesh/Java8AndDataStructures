import java.util.Scanner;

public class Swap {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("etner a string");
		String str = sc.nextLine();
		String temp = "";
		int count = 0;
		String swap[] = new String[2];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 32) {
				temp += str.charAt(i);
			} else {
				swap[count++] = temp;
				temp = "";
			}
		}
		swap[count] = temp;
		String temp1 = swap[0];
		swap[0] = swap[1];
		swap[1] = temp1;
		System.out.println("after swaping");
		for (int k = 0; k < swap.length; k++) {
			System.out.print(swap[k] + " ");
		}
	}

}
