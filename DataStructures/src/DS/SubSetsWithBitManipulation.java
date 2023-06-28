package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SubSetsWithBitManipulation {

	public static List<List<Integer>> subsetsWithDup(int[] nums) {

		Set<List<Integer>> set = new HashSet();

		Arrays.sort(nums);
		System.out.println(" bit number " + (1 & 1));

		set.add(new ArrayList());
		if (nums.length == 1) {
			set.add(new ArrayList(Arrays.stream(nums).boxed().collect(Collectors.toList())));
			return new ArrayList(set);
		}
		List<Integer> list = new ArrayList();
		/*
		 * for (int i = 0; i < nums.length; i++) {
		 * 
		 * for (int j = i; j < nums.length; j++) { list.add(nums[j]);
		 * System.out.println("list" + list); set.add(new ArrayList(list)); }
		 * list.removeAll(list); } System.out.println("set" + set);
		 */
		for (int i = 0; i < Math.pow(2, nums.length); i++) {
			//System.out.println("h");
			for (int j = 0; j < nums.length; j++) {
				// int a=;
				// System.out.println("a "+ a);
				if ((1 << j & i) == 0) {
					//System.out.println("i " + i + " j " + j);
					list.add(nums[j]);
				}
				// System.out.println("list "+ list);
			}
			set.add(new ArrayList(list));
			// System.out.println("set "+set);
			list.removeAll(list);
		}

		return new ArrayList(set);
	}

	public static void main(String[] args) {
		System.out.println(subsetsWithDup(new int[] { 2, 3, 5}));

	}

}
