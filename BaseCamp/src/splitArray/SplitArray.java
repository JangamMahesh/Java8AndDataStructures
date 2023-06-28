package splitArray;

import java.util.Scanner;

public class SplitArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int validSize = validateSize(size);
		System.out.println("enter array elements");
		int array[] = new int[validSize];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		boolean flag = areSumOfSidesEqual(array);
		if (flag) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static boolean areSumOfSidesEqual(int[] array) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = array.length - 1;
		int leftSum = array[0];
		int arraySum = 0;
		int rigthSum = array[j];
		for (int k = 0; k < array.length; k++) {
			arraySum += array[k];
		}
		for (int p = 0; p < array.length; p++) {
			System.out.print(array[p] + " ");
		}
		/*
		 * System.out.println(arraySum); System.out.println(arraySum / 2);
		 */
		while (i != j) {
			if ((arraySum / 2) == leftSum && (arraySum / 2) == rigthSum) {
				return true;
			}
			if (leftSum == rigthSum) {
				i++;
				j--;
				leftSum += array[i];
				rigthSum += array[j];
			} else if (leftSum < rigthSum) {
				i++;
				leftSum += array[i];

			} else {
				j--;
				rigthSum += array[j];

			}

		}
		return false;
	}

	private static int validateSize(int size) {
		boolean isValid = true;
		while (isValid) {
			if (size <= 0 || size >= 30) {
				System.out.println("invalid input:\nit should not contain negative numbers:once again enter:");
				size = sc.nextInt();
			} else {
				isValid = false;
			}
		}
		return size;
	}

}
