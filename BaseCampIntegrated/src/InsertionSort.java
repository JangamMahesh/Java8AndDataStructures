import java.util.Scanner;

public class InsertionSort {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("enter the elemnts");

		for (int i = 0; i < size; i++) {

			array[i] = sc.nextInt();
		}

		int[] sortedArray = sortArray(array);
		display(sortedArray);
		System.out.println("enter elemnt to be searched");
		int key = sc.nextInt();
		boolean flag = isFound(sortedArray, key);
		if (flag) {
			System.out.println(key + " found in array");
		} else {
			System.out.println(key + " not found in array");
		}
		/*
		 * if (flag) { System.out.println(key + " found in array"); } else {
		 * System.out.println("not found"); }
		 */
	}

	private static boolean isFound(int[] sortedArray, int key) {
		// TODO Auto-generated method stub
		int first = 0;
		int last = sortedArray.length - 1;
		int middle = (first + last) / 2;
		while (first <= last) {
			if (sortedArray[middle] < key) {
				first = middle + 1;
			} else if (sortedArray[middle] == key) {
				return true;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		return false;
	}
	/*
	 * private static boolean isFound(int[] sortedArray, int key) { // TODO
	 * Auto-generated method stub for (int i = 0; i < sortedArray.length; i++) { if
	 * (sortedArray[i] == key) { return true; } } return false; }
	 */
	private static void display(int[] sortedArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}

	private static int[] sortArray(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			while (i > 0 && array[i - 1] > array[i]) {
				int temp = array[i - 1];
				array[i - 1] = array[i];
				array[i] = temp;
				i--;
			}
		}
		return array;
	}
}
