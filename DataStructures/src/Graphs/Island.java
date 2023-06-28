package Graphs;

import java.util.Scanner;

public class Island {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		boolean[][] visited = new boolean[r][c];
		int matrix[][] = new int[r][c];
		System.out.println("enter elements");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		display(matrix);
		int maxArea = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (!visited[i][j] && matrix[i][j] == 1) {
					getNumberOfIlands(matrix, i, j, visited);
					maxArea++;
				}
			}
		}

		System.out.println("max square area  " + maxArea);
	}

	private static void getNumberOfIlands(int[][] matrix, int i, int j, boolean[][] visited) {
		// TODO Auto-generated method stub
		if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || visited[i][j] || matrix[i][j] == 0) {
			return;
		}
		visited[i][j] = true;
		getNumberOfIlands(matrix, i - 1, j, visited);
		getNumberOfIlands(matrix, i, j - 1, visited);
		getNumberOfIlands(matrix, i + 1, j, visited);
		getNumberOfIlands(matrix, i, j + 1, visited);

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
