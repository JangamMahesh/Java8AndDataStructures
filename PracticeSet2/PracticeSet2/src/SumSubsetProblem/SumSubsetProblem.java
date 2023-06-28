package SumSubsetProblem;

import java.util.Scanner;

public class SumSubsetProblem {
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elelments:");
		int numberOfElements = sc.nextInt();
		// input array
		System.out.println("enter array of elements:");
		int array[] = new int[numberOfElements];
		for (int i = 0; i < numberOfElements; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("enter sum:");
		int sum = sc.nextInt();

		getCombinations(array, sum);
		if (count == 0) {
			System.out.println("no subset exist:");
		}

	}

	public static void getSubsets(int array[], int size, int target) {
		// Create the new array with size used to store binary values
		int binary[] = new int[array.length];
		int j = array.length - 1;
		// Convert the array into binary array
		while (size > 0) {
			binary[j] = size % 2;
			size = size / 2;
			j--;
		}
		int sum = 0;
		// Calculate the sum of this subset
		for (int i = 0; i < array.length; i++)
			if (binary[i] == 1)
				sum = sum + array[i];
		// if sum is equal to given target then print the elements
		if (sum == target) {
			System.out.print("{");
			for (int i = 0; i < array.length; i++)
				if (binary[i] == 1)
					System.out.print(" " + array[i] + " ");
			count++;
			System.out.print("}");
			System.out.println();
		}
	}

	// combinations (2^number of elements)
	public static void getCombinations(int[] arr, int sum) {
		int power = getPower(2, arr.length);
		for (int i = 1; i < power; i++)
			getSubsets(arr, i, sum);
	}

	// power of the number
	private static int getPower(int base, int exponent) {
		int result = 1;
		while (exponent != 0) {
			result = result * base;
			exponent--;
		}
		return result;
	}

}
