package collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;




public class Queuee {

	private int a;

	private void Queuee() {
	}

	class B {

		Queuee q = new Queuee();
	}

	public static void main(String[] args) {

		// Queuee queuee = new Queuee();

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		priorityQueue.add(20);
		priorityQueue.add(10);
		priorityQueue.add(30);
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.remove());
		priorityQueue.add(1);
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.poll());
		priorityQueue.add(25);
		System.out.println(priorityQueue);

		BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(3);
//		System.out.println(blockingQueue.remove());
		blockingQueue.add(12);
		blockingQueue.add(13);
		blockingQueue.add(14);
	//	blockingQueue.add(15);
		System.out.println(blockingQueue);
		System.out.println(blockingQueue.remove());
		System.out.println(blockingQueue);
		

		// returns infinity
		System.out.println(2.0 / 0.0);

		Queue<Integer> q = new ArrayDeque<Integer>();
		System.out.println(q.poll());
		// remove operation throws exception where as poll peek offer wont throw any
		// exception in case of no value present
		// System.out.println(q.remove());
		System.out.println(q.offer(1));
		// TODO Auto-generated method stub
		Queue<Integer> qu = new PriorityQueue<>();
		qu.offer(213);
		qu.offer(2);
		qu.offer(32);
		System.out.println(qu);
		System.out.println(qu.poll());

		qu.add(21);
		qu.add(20);
		qu.add(12);
		qu.add(-2);
		qu.add(-1);
		qu.add(30);
		System.out.println(qu.remove());
		System.out.println(qu);
		Iterator<Integer> li = qu.iterator();
		System.out.println(qu.size());
		System.out.println();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println();
		System.out.println(qu.poll());
		System.out.println();
//		while (li.hasNext()) {
//			System.out.println(li.next());
		// }
		System.out.println(qu.size());
		System.out.println(qu.peek());
		System.out.println(qu.size());
		/* Iterator<Integer> li = qu.iterator(); */
//		while (li.hasNext()) {
//			System.out.println(li.next());
//		}
		System.out.println("mahesh");

	}

}
