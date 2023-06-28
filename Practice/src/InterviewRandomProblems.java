import java.util.LinkedList;

public class InterviewRandomProblems {
	private static int findSecondHighest(int[] array) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		return secondHighest;
	}

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		System.out.println(ll);
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll.descendingIterator().forEachRemaining(ll1::add);
		System.out.println(ll1);

		int[] arr = { 3, 5, 1, 2, 8, 5, 9 };

		int secondHighest = InterviewRandomProblems.findSecondHighest(arr);
		System.out.println(secondHighest);
	}

}
