package DS;

import java.util.Scanner;

public class MinPathSumofMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of rows");
		int m = sc.nextInt();

		System.out.println("Enter no of columns");
		int n = sc.nextInt();

		System.out.println("enter elements");
		int[][] dp = new int[m][n];
		int[][] matrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		display(matrix);
		int sum1 = 0;
		int sum2 = 0;
		System.out.println("dp first");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0) {
					sum1 += matrix[0][j];
					dp[0][j] = sum1;
				}
				if (j == 0) {
					sum2 += matrix[i][0];
					dp[i][0] = sum2;
				}
			}
		}
		display(dp);
		int minPathSum = getMinimumSum(dp, matrix);
		System.out.println("Min path sume reached target is " + minPathSum);
	}

	private static int getMinimumSum(int[][] dp, int[][] matrix) {

		/*
		 * int min=Integer.MAX_VALUE; int sum=0;
		 */
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[i].length; j++) {
				dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
			}

		}
		System.out.println("total dp");
		display(dp);
		System.out.println();
		return dp[dp.length - 1][dp[0].length - 1];
	}

	private static void display(int[][] dp) {

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				System.out.print(" " + dp[i][j]);
			}
			System.out.println();
		}

	}

}
