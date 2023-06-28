package indexOfSuperiorElementInMatrix;

import java.util.Scanner;

/*Write a java program to display the index position of superior element of a matrix. 
The program should take input matrix of non negative integer elements from the user, 
display the matrix and display the index position of superior element of that matrix. 
While checking for the largest element,
if the largest element is duplicate either in row or column, 
consider the first duplicate element index position for superior element consideration.*/

public class IndexOfSuperiorElementOfMatrix {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter rows and column of the given matrix:");
		int rows = sc.nextInt();
		int validRows = validateInt(rows);
		int col = sc.nextInt();
		int validCols = validateInt(col);
		// matrix creationvalidRows
		int matrix[][] = new int[validRows][validCols];
		System.out.println("enter matrix elements:");
		for (int i = 0; i < validRows; i++) {
			for (int j = 0; j < validCols; j++) {
				int element = sc.nextInt();
				int validEle = validateEle(element);
				matrix[i][j] = validEle;
			}
		}
		displayMatrix(matrix);

		int[] indexes = getIndexOfSuperiorElement(matrix);
		System.out.println("the max elemnet found at " + "(" + indexes[0] + "," + indexes[1] + ")");

	}

	private static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int[] getIndexOfSuperiorElement(int[][] matrix) {
		// TODO Auto-generated method stub
		int indexes[] = new int[2];
		int max = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (max < matrix[i][j]) {
					max = matrix[i][j];
					indexes[0] = i;
					indexes[1] = j;
				}
			}
		}
		return indexes;

	}

//validate element
	private static int validateEle(int element) {
		boolean isValid = true;
		while (isValid) {
			if (element < 0) {
				System.out.println("invalid input:\nit should not contain negatives\nplz once agin enter:");
				element = sc.nextInt();
			} else {
				isValid = false;
			}

		}
		return element;
	}

	// validate integer
	private static int validateInt(int rows) {
		boolean isValid = true;
		while (isValid) {
			if (rows <= 0 || rows > 10) {
				System.out.println("invalid input:\nit should not contain negatives\nplz once agin enter:");
				rows = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return rows;
	}

}
