package DS;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Merge 2 sorted arrays ");

		int[] arr1= {1,2,5,9};
		int[] arr2= {3,5,8,10};
		int[] finalArray=new int[arr1.length+arr2.length];
		
		System.arraycopy(arr1, 0, finalArray, 0, arr1.length);
		System.arraycopy(arr2, 0, finalArray, arr1.length, arr2.length);
		
		Arrays.sort(finalArray);
		for (int i : finalArray) {
			
			System.out.print(i +" " );
		}
		
		System.out.println();
		System.out.println("enter number of elemenats");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

		int matrix[] = new int[r];
		int temp[] = new int[r];
		System.out.println("enter elements");
		for (int i = 0; i < matrix.length; i++) {

			matrix[i] = sc.nextInt();

		}
		mergeSort(matrix, temp, 0, r - 1);
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i] + " ");
		}
	}

	private static void mergeSort(int[] matrix, int[] temp, int low, int high) {
		// TODO Auto-generated method stub
		if (low < high) {
			// we do this to avoid integer overflow
			int mid = low + (high - low) / 2;
			mergeSort(matrix, temp, low, mid);
			mergeSort(matrix, temp, mid + 1, high);
			merge(matrix, temp, low, mid, high);
		}

	}

	private static void merge(int[] matrix, int[] temp, int low, int mid, int high) {
		// TODO Auto-generated method stub
		for (int i = low; i <= high; i++) {
			temp[i] = matrix[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= high) {
			if (temp[i] <= temp[j]) {
				matrix[k] = temp[i++];
			} else {
				matrix[k] = temp[j++];
			}
			k++;
		}
		while (i <= mid) {
			matrix[k++] = temp[i++];

		}
		while (j <= high) {
			matrix[k++] = temp[j++];

		}

	}

}
