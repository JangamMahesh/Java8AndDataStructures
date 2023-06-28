package matrixMultiplcation;

import java.util.Scanner;

public class MatrixMultiplication {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter  rowsize of first matrix");
		int r1 = sc.nextInt();
		System.out.println("enter  column size of 1st matrix ");
		int c1 = sc.nextInt();
		System.out.println("enter  rowsize of 2nd matrix");
		int r2 = sc.nextInt();
		System.out.println(" enter column size of 2nd matrix");
		int c2 = sc.nextInt();
		int matrix1[][] = new int[r1][c1];
		int matrix2[][] = new int[r2][c2];
		if (c1 != r2) {
			System.out.println("matrix multiplication is not possible");
		} else {
			System.out.println("enter elemnts of 1st matrix");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					matrix1[i][j] = sc.nextInt();
				}
			}
			System.out.println("enter elements of 2nd matrix");
			for (int i = 0; i < r2; i++) {
				for (int j = 0; j < c2; j++) {
					matrix2[i][j] = sc.nextInt();
				}
			}
			int outputMatrix[][] = getMultiplicationOfMatrix(matrix1, matrix2);
			displayMartrix(outputMatrix);

		}
	}

	private static void displayMartrix(int[][] outputMatrix) {
		// TODO Auto-generated method stub
		for (int i = 0; i <outputMatrix.length; i++) {
			for (int j = 0; j < outputMatrix[i].length; j++) {
				System.out.print(outputMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}
	private static int[][] getMultiplicationOfMatrix(int[][] matrix1, int[][] matrix2) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println(matrix1.length); System.out.println(matrix1[0].length);
		 * System.out.println(matrix2[0].length);
		 */
		int outputMatrix1[][] = new int[matrix1.length][matrix2[0].length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				outputMatrix1[i][j] = 0;
				for (int k = 0; k <matrix1[i].length; k++) {
					outputMatrix1[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return outputMatrix1;
	}

}
