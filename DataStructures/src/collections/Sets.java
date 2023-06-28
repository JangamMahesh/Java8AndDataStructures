package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {

		List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 0, -1), Arrays.asList(-1, 0, 1));
		
		lists.stream().distinct().forEach(System.out::println);

		HashSet<List<Integer>> hashSet = new HashSet<>(lists);
		List<List<Integer>> arrayList = new ArrayList<>(hashSet);

		System.out.println(hashSet);

		/*
		 * 3 sum problem class Solution { public List<List<Integer>> threeSum(int[]
		 * nums) { Set<List<Integer>> set=new HashSet<>(); if(nums.length==0) return new
		 * ArrayList<>(); Arrays.sort(nums); int sum=0; for(int i=0;i<nums.length-2;i++)
		 * { int j=i+1; int k=nums.length-1; while(j<k) { sum=nums[i]+nums[j]+nums[k];
		 * if(sum==0) set.add(Arrays.asList(nums[i],nums[j++],nums[k--])); if(sum<0)
		 * j++; if(sum>0) k--;
		 * 
		 * } } return new ArrayList<>(set);
		 * 
		 * } }
		 */

		// TODO Auto-generated method stub
		Sets obj = new Sets();
		Set<Integer> values = new HashSet<>();
		Set<Integer> value = new HashSet<>();
		List<Integer> list = new LinkedList<>();
		value.add(12);
		value.add(129);
		values.add(129);
		values.add(12);
		values.add(121);
		values.add(19);
		obj.display(values);
		System.out.println(values.remove(121));
		System.out.println(values.contains(12));
		Object[] array = values.toArray();
		System.out.println("after converting");
		for (Object i : array) {
			System.out.print(i + " ");
		}
		/*
		 * for(Integer k:list) { System.out.print(k+" "); }
		 */
		int count = 0;

		for (Integer i : values) {
			array[count++] = i;
		}
		System.out.println("array valeus");
		for (Object k : array) {
			System.out.print(k + " ");
		}
		/*  */
		/* values.clear(); */
		/*
		 * System.out.println(values.remove(1212)); System.out.println(values.size());
		 */
		/* System.out.println(values); */
		System.out.println();
		value = (Set<Integer>) ((HashSet<Integer>) values).clone();
		value.add(56);
		value.add(23);
		obj.display(value);
		System.out.println();
		for (Integer i : values) {
			for (Integer j : value) {
				if (i == j) {
					System.out.print(i + " ");
				}
			}
		}
	}

	private static void display(Set<Integer> values) {
		// TODO Auto-generated method stub
		for (Integer o : values) {
			System.out.print(o + " ");
		}
	}

}
