package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

// Only difference between permutation and combination is for permutation since there is specific condition 
//to find all possibilities every time start from 0 index.
// for combination we will have some condition so, we start the index where it ends not from 0 
// since permutation counts> combination count.

// First write boundary Conditions if currentSum is greater than target simply return
// if currentSum==target add that list of numbers in result list then return;
// add every element to the sum and stack until it get returns once return means that element 
//we are considering so remove that element from sum and from stack too
// for each element starting that position of same element take other possible elements to get the sum.

public class CombinationSum {

	public static void main(String[] args) {

		/*
		 * int[] nums=new int[2]; List<Integer> collect =
		 * Arrays.stream(nums).boxed().collect(Collectors.toList());
		 */
		List<Integer> list = Arrays.asList(2, 3, 5);

		List<List<Integer>> set = new ArrayList();
		//set.removeAll(set);
		int target = 8;
		Stack<Integer> sumList = new Stack<Integer>();
	
		int currentSum = 0;
		getListElementsWithGivenSum(list, currentSum, target, sumList, 0, set);
		System.out.println(set);

	}

	private static void getListElementsWithGivenSum(List<Integer> list, int currentSum, int target,
			Stack<Integer> sumList, int index, List<List<Integer>> set) {

		if (currentSum > target) {
			return;
		}
		if (currentSum == target) {
			set.add(new ArrayList<Integer>(sumList));
			return;
		}

		for (int i = index; i < list.size(); i++) {
			currentSum += list.get(i);
			sumList.push(list.get(i));
			getListElementsWithGivenSum(list, currentSum, target, sumList, i, set);
			currentSum -= list.get(i);
			sumList.pop();
		}

	}

}
