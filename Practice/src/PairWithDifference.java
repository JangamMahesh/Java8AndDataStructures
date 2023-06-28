import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class PairWithDifference {
	public final void PairWithDifference() throws RuntimeException
	{
		throw new RuntimeException("excpetion");
	}

	public static void main(String[] args) {
		
		PairWithDifference pairWithDifference = new PairWithDifference();
		PairWithDifference pairWithDifference2 = new PairWithDifference();
		System.out.println(pairWithDifference.hashCode());
		System.out.println(pairWithDifference2.hashCode());
		Float f=new Float("3.9");
		System.out.println(3+3.0+3L);
		
		boolean a=true;
		if(a==false)
		{
			System.out.println("hi");
		}
		else {
			System.out.println("hjki");
		}
		
		String s="as";
		int identityHashCode = System.identityHashCode(s);
		s=null;
		System.gc();
		System.out.println(s);
		String s2="as";
		int identityHashCode2 = System.identityHashCode(s2);
		System.out.println(identityHashCode);
		System.out.println(identityHashCode==identityHashCode2);
		System.out.println(identityHashCode2);

		int[] arr = { 4, 2, 6, 5, 8, 1 };
		findPairsWithGivenDifference(arr, 2);
		int[] arr1 = { 1, 4, 2, 5, 0, 7, 0, 1, 0, 2, 0, 0, 5 };
//		List<Integer> asList2 = Arrays.asList(1, 4, 2, 5, 0, 7, 0, 1, 0, 2, 0, 0, 5);
//
//		Collections.sort(asList2, (o1,o2)->o2.compareTo(o1));
//		System.out.println(asList2);
		int[] swapZerosToEnd = swapZerosToEnd(arr1);
		for (int i = 0; i < swapZerosToEnd.length; i++) {

			System.out.print(swapZerosToEnd[i] + " ");
		}
		System.out.println();

		List<Integer> asList = new ArrayList<Integer>();
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

		// Convert the integer list to a map using streams
		Map<Integer, Integer> integerMap = integerList.stream().collect(Collectors.toMap(
				// Key mapper: identity function (use the integer itself as the key)
				key -> key,
				// Value mapper: square the integer value
				value -> value));

		// Print the resulting map
		System.out.println(integerMap);
//		Map<Integer, Integer> collect = asList.stream().collect(Collectors.toMap(key -> key, v -> v));
//		System.out.println(collect);

	}

	private static int[] swapZerosToEnd(int[] arr1) {
		int start = 0;
		int end = arr1.length - 1;
		int count=0;
		for (start = 0; start < arr1.length; start++) {

			if (arr1[start] != 0) {
				int temp=arr1[start];
				arr1[start]=arr1[count];
				arr1[count]=temp;
				count++;
			}

		}

		return arr1;
	}

	private static void findPairsWithGivenDifference(int[] arr, int k) {

		HashSet<Integer> hashSet = new HashSet<Integer>();

		for (Integer num : arr) {
			int target1 = num - k;
			int target2 = num + k;
			if (hashSet.contains(target1)) {
				System.out.println(num + " , " + target1);
			}
			if (hashSet.contains(target2)) {
				System.out.println(num + " , " + target2);
			}
			hashSet.add(num);

		}
	}

}
