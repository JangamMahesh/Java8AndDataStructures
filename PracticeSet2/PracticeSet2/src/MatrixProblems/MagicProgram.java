package MatrixProblems;

import java.util.Scanner;

import ItemApplication.Validations;

public class MagicProgram {
	public static void main(String[] args) {
		// create square matrix
		// and call isMagic method (if each row sum and column sum and both diagonal
		// sums are equal then it is said to be magic)
		Scanner sc = new Scanner(System.in);
		Validations validation = new Validations();
		System.out.println("enter the square matrix size:");
		int number = sc.nextInt();
		int validNumber = validation.validateId(number);
		System.out.println("enter elements of an matrix:");
		int array[][] = new int[validNumber][validNumber];
		for (int i = 0; i < validNumber; i++) {
			for (int j = 0; j < validNumber; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		boolean result = isMagic(array);
		System.out.println(result);

	}

	private static boolean isMagic(int[][] array) {

		// sum of diagonals
		int dsum = 0;
		int dsum1 = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					dsum = dsum + array[i][j];
				}
				if (i == array.length - j - 1) {
					dsum1 = dsum1 + array[i][j];
				}
			}
		}
		System.out.println("dsum:" + dsum + " \ndsum1:" + dsum1);
		if (dsum != dsum1)
			return false;

		// calculating row sum
		for (int i = 0; i < array.length; i++) {
			int rsum = 0;
			for (int j = 0; j < array[i].length; j++) {
				rsum = rsum + array[i][j];
			}
			System.out.println("rsum:" + rsum);
			if (dsum != rsum)
				return false;

		}
		// calculating column sum
		for (int i = 0; i < array.length; i++) {
			int csum = 0;
			for (int j = 0; j < array[i].length; j++) {
				csum = csum + array[j][i];
			}
			System.out.println("csum:" + csum);
			if (dsum != csum)
				return false;

		}
		return true;
	}

}
