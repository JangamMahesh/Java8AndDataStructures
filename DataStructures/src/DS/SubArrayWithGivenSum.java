package DS;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 2 ,0,1,2,2};

		printSubArraysWithGivenSum(arr, 4);
	}

	private static void printSubArraysWithGivenSum(int[] arr, int targetSum) {
		int start = 0, end = 0, currentSum = arr[0];

		while (end < arr.length) {
			if (currentSum == targetSum) {
				for (int i = start; i <=end; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				currentSum -= arr[start];
				start++;

			} else if (currentSum < targetSum) {
				end++;
				if (end < arr.length) {
					currentSum += arr[end];
				}
			} else {
				currentSum -= arr[start];
				start++;
			}
		}

	}

}
