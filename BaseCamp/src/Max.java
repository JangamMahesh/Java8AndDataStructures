import java.util.Scanner;

public class Max {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter no or rows and columns of the matrix:");
		int rows = sc.nextInt();

		int col = sc.nextInt();

		// matrix creation by using rows and cols
		int matrix[][] = new int[rows][col];
		System.out.println("enter matrix elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int max = getMaxElement(matrix);
		System.out.println("maximum lement is "+ max);
	}

	private static int getMaxElement(int[][] matrix) {
		// TODO Auto-generated method stub
		int max = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max)
					max = matrix[i][j];
			}
		}
		return max;
	}

}
