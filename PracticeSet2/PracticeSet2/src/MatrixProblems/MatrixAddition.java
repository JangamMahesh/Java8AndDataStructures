package MatrixProblems;

import java.util.Scanner;

import ItemApplication.Validations;

public class MatrixAddition {
	static Scanner sc = new Scanner(System.in);
	static Validations validation = new Validations();

	public static void main(String[] args) {
//		step1:create two 2-dimensional arrays
//		step2:store the additionof two matrices in result array
		System.out.println("enter the rows and columns");
		int rows = sc.nextInt();
		int validRows = validation.validateId(rows);
		int col = sc.nextInt();
		int validCols = validation.validateId(col);

		int result[][] = getMatrixAddition(validRows, validCols);
		System.out.println("addition of the matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

//matrix addition 
	private static int[][] getMatrixAddition(int validRows, int validCols) {

		int matrix1[][] = new int[validRows][validCols];
		int matrix2[][] = new int[validRows][validCols];
		int result[][] = new int[validRows][validCols];
		// first matrix
		System.out.println("enter first matrix elements:");
		for (int i = 0; i < validRows; i++) {
			for (int j = 0; j < validCols; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		int sum = getColumnElementSum(matrix1);
		System.out.println(sum);
		// second matrix
		System.out.println("enter second matrix elements:");
		for (int i = 0; i < validRows; i++) {
			for (int j = 0; j < validCols; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}

		// result array

		for (int i = 0; i < validRows; i++) {
			for (int j = 0; j < validCols; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return result;
	}

	private static int getColumnElementSum(int[][] matrix1) {
		int sum = 0;

		for (int i = 0; i < matrix1.length; i++) {
			// System.out.println("hello");
			for (int j = 0; j < matrix1[1].length; j++) {
				if (j == 1) {
					sum = sum + matrix1[i][j];
				}
			}
		}
		System.out.println("sum :" + sum);

		return sum;
	}

}
