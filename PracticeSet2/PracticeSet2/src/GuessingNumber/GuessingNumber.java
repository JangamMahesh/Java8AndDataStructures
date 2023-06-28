package GuessingNumber;
import java.util.Scanner;
import ItemApplication.Validations;

public class GuessingNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Validations validation = new Validations();
		System.out.println("\t****NUMBER GUESSING GAME:****");
		// generate random number with in the range of 1 to 1000
		// and compare the generated number with guessing number
		int number = (int) (1000.0 * Math.random());
		/*
		 * String name = sc.next(); String validName = validation.validateString(name);
		 */
		int result = getResult(number);
		System.out.println("!!congratulations!! .. ");
		System.out.println("you are attempts are:" + result);
	}

	private static int getResult(int number) {
		int count = 0;
		while (true) {
			System.out.println("enter ur guessing number: in between the range 1 to 1000");
			int guessingNumber = sc.nextInt();
			count++;
			if (guessingNumber < number) {
				System.out.println("TOO LOW");
			} else if (guessingNumber == number) {
				/*
				 * System.out.println("!!congratulations!! .. ");
				 * System.out.println("you are attempts are:" + count);
				 */
				break;

			} else {
				System.out.println("TOO HIGH");
			}
		}
		return count;
	}

}
