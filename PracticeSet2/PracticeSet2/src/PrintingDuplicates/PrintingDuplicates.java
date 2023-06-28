package PrintingDuplicates;

import java.util.Scanner;
import ItemApplication.Validations;

public class PrintingDuplicates {
	public static void main(String[] args) {
		// create an integer array
		Validations validation = new Validations();
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements:");
		int n = sc.nextInt();
		int validNumber = validation.validateId(n);
		int input[] = new int[validNumber];
		int output[] = new int[validNumber];
		System.out.println("enter array elements:");
		// output array intially stores -1
		for (int i = 0; i < validNumber; i++) {
			input[i] = sc.nextInt();
			output[i] = -1;
		}
		int resultArray[] = getDuplicates(input, output);

		System.out.print("{");
		for (int i = 0; i < resultArray.length; i++) {
			if (resultArray[i] != -1) {
				System.out.print(resultArray[i] + " ");
				flag = 1;
			}

		}
		if (flag == 0) {
			System.out.print(output[1] + "");
		}
		System.out.print("}");
	}

	private static int[] getDuplicates(int[] input, int[] output) {
		// frequency array will store the count of each element
		int[] frequency = new int[input.length];
		int visited = -1;
		for (int i = 0; i < input.length; i++) {
			int count = 1;
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					count++;
					// To avoid counting same element again
					frequency[j] = visited;
				}
			}
			if (frequency[i] != visited)
				frequency[i] = count;
		}

		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > 1) {
				// System.out.println(a[i]+"");
				// only duplicates elements store this out put array
				output[i] = input[i];
				// System.out.print(b[i] + " ");
			}
		}
		/*
		 * if(flag==1){ //System.out.print("{"); for (int i = 0; i < input.length; i++)
		 * { if (output[i] != -1) { System.out.print(" " + output[i] + " "); flag = 1; }
		 * } //System.out.print("}"); }
		 */
		/*
		 * else { System.out.println("{" + output[1] + "}"); }
		 */
		return output;
	}

}
