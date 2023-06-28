import java.util.Scanner;

public class MatrixSwap {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter row size");
		int rowSize = sc.nextInt();
		System.out.println("enter column Size");
		int columnSize = sc.nextInt();
		int[][] matrix = new int[rowSize][columnSize];
		System.out.println("enter elemnts");
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		matrix = getRowAndColumnSwapMatrix(matrix);
		displaySapedMatrix(matrix);
		System.out.println();
		matrix = getFirstAndLastColumnExchangingMatrix(matrix);
		displaySapedMatrix(matrix);

	}

	private static int[][] getFirstAndLastColumnExchangingMatrix(int[][] matrix) {
		// TODO Auto-generated method stub

		int temp[][] = new int[1][1];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == 0) {
					temp[0][0] = matrix[i][0];
					matrix[i][0] = matrix[i][matrix[i].length - 1];
					matrix[i][matrix[i].length-1]=temp[0][0];

				}

			}
		}
		return matrix;
	}

	private static void displaySapedMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}

	}

	private static int[][] getRowAndColumnSwapMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		int[][] swapedMatrix = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				swapedMatrix[j][i] = matrix[i][j];
			}
		}
		return swapedMatrix;
	}
}
