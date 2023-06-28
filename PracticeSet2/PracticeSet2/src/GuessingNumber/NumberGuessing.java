package GuessingNumber;
import java.util.Scanner;
public class NumberGuessing {
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("\t****NUMBER GUESSING GAME:****");
		// generate random number with in the range of 1 to 1000
		// and compare the generated number with guessing number
		int randomNumber = getRandomNumber();
		
		int result = getResult(randomNumber);
		System.out.println("!!congratulations!! .. ");
		System.out.println("you are attempts are:" + result);

	}
	
	// getting random number
	public static int getRandomNumber() {
		System.out.println("enter first number");
		int first = sc.nextInt();
		int validFirst = validateInteger(first);
		System.out.println("enter last number");
		int last = sc.nextInt();
		int validLast = validateInteger(last);
		int random = (validLast / 2) + validFirst;
		return random;
	}

	// validate integer
	public static int validateInteger(int number) {
		boolean isValid = true;
		while (isValid) {
			if (number <= 1 || number >= 1000) {
				System.out.println("enter number with in the range 1 to 1000");
				number = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return number;
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
