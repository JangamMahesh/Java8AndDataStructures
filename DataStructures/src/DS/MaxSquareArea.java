package DS;

import java.util.Scanner;

public class MaxSquareArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int matrix[][] = new int[r][c];
		System.out.println("enter elements");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		display(matrix);
		int maxArea = getMaxArea(matrix);
		System.out.println("max square area  " + maxArea);

	}

	private static int getMaxArea(int[][] matrix) {
		// TODO Auto-generated method stub
		int max = 0;
		int dp[][] = new int[matrix.length + 1][matrix[0].length + 1];
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[0].length; j++) {
//				if (i == 0 || j == 0) {
//					dp[i][j] = 0;
//				}
//			}
//		}

		
		for (int i = 1; i <=matrix.length; i++) {
			for (int j = 1; j <=matrix[0].length; j++) {
				if (matrix[i-1][j-1] == 1) {
					dp[i][j] = 1 + min(dp[i - 1][j - 1], min(dp[i - 1][j], dp[i][j - 1]));
					if (dp[i][j] > max) {
						max = dp[i][j];
					}
				}
			}
		}
		display(dp);

		return max*max;
	}

	private static int min(int i, int j) {
		// TODO Auto-generated method stub

		return i > j ? j : i;
	}

	private static void display(int[][] matrix) {
		// TODO Auto-generated method stub
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("  " + matrix[i][j]);
			}
			System.out.println();
		}
	}

}
