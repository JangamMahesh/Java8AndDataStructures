package MatrixProblems;

import java.util.Scanner;

public class RowMagicProgram {
	public static void main(String[] args) {
		// create matrix with rows and columns
		// and check whether the given matrix is row matrix or not
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows:");
		int rows = sc.nextInt();
		System.out.println("enter cols:");
		int cols = sc.nextInt();
		System.out.println("enter elements of an matrix");
		int array[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		boolean result = isRowMatrix(array);
		System.out.println(result);
	}

	// and check whether the given matrix is row matrix or not(this means that every
	// row has the same row sum)
	private static boolean isRowMatrix(int[][] array) {
		int sum = 0;
		float result = 0;
		int rowSum[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			// calculating each row sum
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[j][i];
			}
			// store each rowsum value in rowsum array
			rowSum[i] = sum;
			// System.out.println(rowSum[i] + " ");
			// adding all rowsum
			result = result + rowSum[i];
			sum = 0;
			// return true;
		}
		// result store the average value
		result = (result / array.length);
		// System.out.println("r:" + result);
		// if avg value is equals to one of the element in row sum then return true
		if (result == rowSum[0]) {
			return true;
		}
		return false;
	}
}
