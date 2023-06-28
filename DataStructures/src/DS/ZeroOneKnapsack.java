package DS;

import java.util.Scanner;

public class ZeroOneKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nbr of coins");
		int n = sc.nextInt();
		int weights[] = new int[n];
		int profit[] = new int[n];
		for (int i = 0; i < n; i++) {
			weights[i] = sc.nextInt();
		}
		System.out.println("enter profits");
		for (int i = 0; i < profit.length; i++) {
			profit[i] = sc.nextInt();
		}
		System.out.println("total wt ");
		int wt = sc.nextInt();
		int dp[][] = new int[n + 1][wt + 1];
		int maxProfit = countMaxProfit(dp, weights, profit, wt);
		System.out.println("maxprofit " + maxProfit);

	}

	private static int countMaxProfit(int[][] dp, int[] weights, int[] profit, int wt) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= weights.length; i++) {
			for (int j = 0; j <= wt; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				} else if (weights[i - 1] <= j) {
					dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + profit[i - 1]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		return dp[weights.length][wt];
	}

	private static int max(int i, int j) {
		return i > j ? i : j;
	}

}
