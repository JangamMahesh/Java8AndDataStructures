package DS;

import java.util.Scanner;

public class NumberOfPaths {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter no of rows");
		int m=sc.nextInt();
		
		System.out.println("Enter no of columns");
		int n=sc.nextInt();
		
		int[][] dp=new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==0)
				{
					dp[i][j]=1;
				}
			}
		}
		display(dp);
		int numberOfPaths=getNumberOfPaths(dp);
		System.out.println("Number of ways it reached to target are "+ numberOfPaths);
	}

	private static int getNumberOfPaths(int[][] dp) {
		
		if(dp.length==0)
		{
			return 0;
		}
		for(int i=1;i<dp.length;i++)
		{
			for(int j=1;j<dp[i].length;j++)
			{
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
			
		}
		
		return dp[dp.length-1][dp[0].length-1];
	}

	private static void display(int[][] dp) {
		
		for(int i=0;i<dp.length;i++)
		{
			for(int j=0;j<dp[i].length;j++)
			{
				System.out.print(" "+dp[i][j]);
			}
			System.out.println();
		}
		
	}

}
