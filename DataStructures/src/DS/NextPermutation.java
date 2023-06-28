package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
// first need to find out the largest element in the array and swap with element which just before it
// special case the just before number is smaller than the right elements of higher element then simpley 
// swap the just before element which higher than this and right side of actual higher element
// then from next to lower element sort all the elements right side of it.
public class NextPermutation {

	public static void main(String[] args) {

		
		/*
		 * List<List<Integer>> set = new ArrayList<>();
		 * 
		 * Stack<Integer> stack = new Stack(); int[] nums=new int[] {1,1,5};
		 * Arrays.sort(nums); getPermutations( nums,stack, set);
		 * 
		 * // Arrays.asList(ArrayUtils.toObject(nums)); List<Integer> collect =
		 * Arrays.stream(nums).boxed().collect(Collectors.toList());
		 * 
		 * 
		 * System.out.println(set); //System.out.println("Helo" +set.get(0));
		 * System.out.println("size "+set.size()); for (int i = 0; i < set.size(); i++)
		 * { //System.out.println(" i "+i);
		 * //System.out.println(set.get(i).equals(nums)); if(set.get(i).equals(collect)
		 * && i<set.size()-1) { System.out.println("Hey "+set.get(i+1)); } else
		 * if(set.get(i).equals(collect) && i==set.size()-1) { System.out.println("Hi "+
		 * set.get(0)); } }
		 * 
		 * }
		 * 
		 * public static void getPermutations(int[] nums, Stack<Integer> stack,
		 * List<List<Integer>> set) { if (stack.size() == nums.length) { set.add(new
		 * ArrayList<Integer>(stack)); } else {
		 * 
		 * for (int i = 0; i < nums.length; i++) { if (stack.contains(nums[i])) {
		 * continue; } stack.push(nums[i]); getPermutations(nums, stack, set);
		 * stack.pop(); }
		 * 
		 * }
		 */
	}
}
