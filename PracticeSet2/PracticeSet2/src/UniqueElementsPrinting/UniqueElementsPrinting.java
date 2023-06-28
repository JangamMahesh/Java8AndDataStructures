package UniqueElementsPrinting;

import java.util.Scanner;

import ItemApplication.Validations;

public class UniqueElementsPrinting {

	public static void main(String[] args) {
//step 1:create two arrays
//step2:print unique elements from array by calling getUniqueElements
		Validations validation = new Validations();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of first array");
		int number = sc.nextInt();
		int validNumber = validation.validateId(number);
		System.out.println("enter array elements:");
		int array1[] = new int[validNumber];
		for (int i = 0; i < validNumber; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("enter the size of second array");
		int number1 = sc.nextInt();
		int validNumber1 = validation.validateId(number1);
		System.out.println("enter array elements:");
		int array2[] = new int[validNumber1];
		for (int i = 0; i < validNumber1; i++) {
			array2[i] = sc.nextInt();
		}
		int resultArray[] = getUniqElements(array1, array2);
		for (int i = 0; i < resultArray.length; i++) {
			if (resultArray[i] != 0) {
				System.out.print(resultArray[i] + " ");
			}
		}
	}

	private static int[] getUniqElements(int[] array1, int[] array2) {
// size1 and size2 stores the array 1 and array 2 length
// size3 is sum of the lengths of both arrays
		int size1 = array1.length;
		int size2 = array2.length;
		int size3 = size1 + size2;
		int count = 0;
// total array store the all array1 and arry2 elements
		int total[] = new int[size3];
		int resultArray[] = new int[size3];
// it is used to store the first array elements
		for (int i = 0; i < size1; i++) {
			total[i] = array1[i];
			count++;
		}
// once array1 elements stored in total array then add array2 elements
		for (int i = 0; i < size2; i++) {
			total[count++] = array2[i];
// System.out.println(count);
		}
// remove duplicates from the total array
		int j;
		int flag = 0;
		for (int i = 0; i < size3; i++) {
			for (j = 0; j < size3; j++) {
				if (total[i] == total[j] && i != j)
					break;
			}
			if (j == size3) {
// System.out.println("j:"+j+"=n3:"+n3);
// System.out.print(total[i] + " ");
				resultArray[i] = total[i];
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("No unique elements");
		}
		return resultArray;
	}

}
