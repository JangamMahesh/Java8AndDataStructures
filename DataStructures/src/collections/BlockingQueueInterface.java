package collections;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueInterface {

	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

	public static void main(String[] args) throws InterruptedException {

		Thread producer = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		});

		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		});
		producer.start();
		consumer.start();

	}

	private static void producer() throws InterruptedException {
		Random random = new Random();
		while (true) {
			Thread.sleep(2000);
			int number = random.nextInt(100);
			queue.put(number);
			System.out.println("added " + number);
		}

	}

	private static void consumer() throws InterruptedException {
		// TODO Auto-generated method stub
		while (true) {
			Thread.sleep(2000);
			int number = queue.take();
			System.out.println("consumed " + number);
		}
	}

}
