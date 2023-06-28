package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> dq = new ArrayDeque<>();
		dq.add(2);
		dq.add(31);
		dq.add(123);
		dq.add(51);
		System.out.println(dq);
		dq.addFirst(22);
		System.out.println(dq);
		dq.poll();
		System.out.println(dq);
		dq.addLast(12);
		System.out.println(dq);
		dq.pollFirst();
		System.out.println(dq);
		System.out.println(dq.peekFirst());
		System.out.println(dq.peek());
		System.out.println(dq.peekLast());
		System.out.println(dq.pollLast());
		System.out.println(dq);
		dq.clear();
		System.out.println(dq.poll());
		/*
		 * System.out.println(dq.peekLast()); System.out.println(dq.peek());
		 */
		System.out.println(dq);

	}

}
