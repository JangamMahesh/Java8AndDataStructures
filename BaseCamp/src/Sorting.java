import java.util.Scanner;

public class Sorting {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		int sortedArray[] = getSortedArray(array);
		display(sortedArray);
	}

	private static void display(int[] sortedArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}

	private static int[] getSortedArray(int[] array) {
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
