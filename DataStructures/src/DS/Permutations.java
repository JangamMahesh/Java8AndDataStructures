package DS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Permutations {
	// back tracking is used for combination sum, n queen and permutations related problems
	// first write base condition when ever there permutation list reaches to input array length then add them in output list
	// first check element if not present add call recursive method
	// if already temp list contains then just skip it no need to add the element, every
	// time we should check from index=0;
	public static void main(String[] args) {
		List<List<Integer>> set = new ArrayList<>();
		int[] arr = { 1, 2, 3 };
		// List<Integer> list=new ArrayList<Integer>();
		Stack<Integer> list = new Stack<Integer>();

		getPermutations(arr, list, set);
		System.out.println(set);

	}

	private static void getPermutations(int[] arr, Stack<Integer> list, List<List<Integer>> set) {
		// TODO Auto-generated method stub

		if (list.size() == arr.length) {
			set.add(new ArrayList<Integer>(list));
		}

		for (int i = 0; i < arr.length; i++) {

			if (list.contains(arr[i])) {
				continue;
			}

			// list.add(arr[i]);
			list.push(arr[i]);
			getPermutations(arr, list, set);
			list.pop();

		}

	}
}
