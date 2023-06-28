import java.util.Scanner;

public class InsertionSort1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		int sortedArray[] = getSoredArray(array);
		System.out.println("after sorting");
		for (int k = 0; k < sortedArray.length; k++) {
			System.out.print(sortedArray[k] + " ");
		}
	}

	private static int[] getSoredArray(int[] array) {
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
