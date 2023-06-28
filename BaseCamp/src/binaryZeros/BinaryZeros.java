package binaryZeros;



import java.util.Scanner;

public class BinaryZeros {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a positive number ");
		int number = sc.nextInt();
		int numberOfZeros = getNumberOfZeros(number);
		System.out.println("number of zeros " + numberOfZeros);

	}

	private static int getNumberOfZeros(int number) {
		// TODO Auto-generated method stub
		int count = 0;
		while (number > 0) {
			int reminder = number % 2;
			if (reminder == 0) {
				count++;
			}
			number = number / 2;
		}
		return count;
	}

}
