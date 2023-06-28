package DS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// first go from left to right (last column) now increase i 0->1(since first row over)
//now top to down from last column decrease column by 1 since last column printed
// to move right to left in last row the row must exist check it,move c-1 to j then decrease that row by 1
//in first row bottom to up column must exist check it, move r-1 to i it should start same row but next column so, j+1;
public class SpiralMatrix {

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

		List<Integer> out = printSpiralMatrix(matrix);
		for (Integer i : out) {
			System.out.print(i + " ");
		}

	}

	private static List<Integer> printSpiralMatrix(int[][] matrix) {

		List<Integer> out = new ArrayList();
		int i = 0;
		int j = 0;
		int k = 0;
		int r = matrix.length;
		int c = matrix[0].length;
		while (i < r && j < c) {
			for (k = i; k < c; k++) {
				out.add(matrix[i][k]);
			}
			i++;
			for (k = i; k < r; k++) {
				out.add(matrix[k][c - 1]);
			}
			c--;
			if (i < r) {
				for (k = c - 1; k >= j; k--) {
					out.add(matrix[r - 1][k]);
				}
				r--;
			}

			if (j < c) {
				for (k = r - 1; k >= i; k--) {
					out.add(matrix[k][j]);
				}
				j++;
			}
		}
		return out;
	}

}
