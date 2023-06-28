package DS;

import java.util.Scanner;


// only thing is if any obstacle 1 comes in the given input we cant go through it
// so if in first row once obstacle 1 comes then next elements in dp row will be 0
// and if in first column once obstacle 1 comes then next elements in dp columns will be 0
// next iterate apart from 1st row or column simply if any abstacle make that dp array to zero
// as we did for paths counts present count is sum of above and left side sum do it return last element of dp
public class UniquePathsWithObstacleBetween {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of rows");
		int m = sc.nextInt();

		System.out.println("Enter no of columns");
		int n = sc.nextInt();

		int[][] dp = new int[m][n];
		int[][] matrix = new int[m][n];

		System.out.println("enter elements 0 or 1 only");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		boolean flag=false;
		for (int i = 0; i < n; i++) {
			if(flag || matrix[0][i]==1)
			{
				flag=true;
				dp[0][i]=0;
			}
			else
				dp[0][i]=1;
			
			}
		flag=false;
		for (int i = 0; i < m; i++) {
			if(flag || matrix[i][0]==1)
			{
				flag=true;
				dp[i][0]=0;
			}
			else
				dp[i][0]=1;
			
			}
		display(dp, matrix);
		int numberOfPaths = getNumberOfPaths(dp, matrix);
		System.out.println("Number of ways it reached to target are " + numberOfPaths);
	}

	private static int getNumberOfPaths(int[][] dp, int[][] matrix) {
		if (dp.length == 0) {
			return 0;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[i].length; j++) {
				if (matrix[i][j] !=1) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}
			}
		}
		display(dp, matrix);
		return dp[dp.length - 1][dp[0].length - 1];
	}

	private static void display(int[][] dp, int[][] matrix) {
		System.out.println("matrix");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println("dynamic array ");
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				System.out.print(" " + dp[i][j]);
			}
			System.out.println();
		}
	}
}
