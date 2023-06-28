import java.util.Iterator;
import java.util.Scanner;

public class Addition {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter row and Column size");
		int row = sc.nextInt();
		int squareMatrix[][] = new int[row][row];
		System.out.println("enter the elemnts");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				squareMatrix[i][j] = sc.nextInt();
			}
		}
		int daigonalSum = getDaigonalSum(squareMatrix);
		System.out.println(daigonalSum);
		int reverseDaigonalSum = getReverseDaigonalSum(squareMatrix);
		System.out.println(reverseDaigonalSum);
	}
	private static int getReverseDaigonalSum(int[][] squareMatrix) {
		// TODO Auto-generated method stub
		int reverseDaigonalSum = 0;
		for (int i = 0; i < squareMatrix.length; i++) {
			for (int j = 0; j < squareMatrix[i].length; j++) {
				if(j==squareMatrix.length - 1 - i) {
				reverseDaigonalSum += squareMatrix[i][squareMatrix.length - 1 - i];
				}
			}
		}
		return reverseDaigonalSum;
	}

	private static int getDaigonalSum(int[][] squareMatrix) {
		// TODO Auto-generated method stub
		int daigonalSum = 0;
		for (int i = 0; i < squareMatrix.length; i++) {
			for (int j = 0; j < squareMatrix.length; j++) {
				if (i == j) {
					daigonalSum += squareMatrix[i][j];
				}
			}
		}
		return daigonalSum;
	}
}
