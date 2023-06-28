import java.util.stream.Collectors;
import java.util.stream.Stream;

// instead of creating 2 seperate classes for 2 threads direct write anonymous inner class and pass it to thread

public class DeadLockExamples {

	private static Object resource1 = new Object();
	private static Object resource2 = new Object();

	/*
	 * Thread thread1 = new Thread(() -> { synchronized (resource1) {
	 * System.out.println("Thread 1 acquired resource1");
	 * 
	 * try { Thread.sleep(100); // Adding a delay to simulate some work } catch
	 * (InterruptedException e) { e.printStackTrace(); }
	 * 
	 * synchronized (resource2) { System.out.println("Thread 1 acquired resource2");
	 * } } });
	 * 
	 * Thread thread2 = new Thread(() -> { synchronized (resource2) {
	 * System.out.println("Thread 2 acquired resource2");
	 * 
	 * synchronized (resource1) { System.out.println("Thread 2 acquired resource1");
	 * } } });
	 */

	class T1 implements Runnable {

		@Override
		public void run() {

			synchronized (resource1) {
				System.out.println("Thread 1 acquired resource1");

				try {
					Thread.sleep(100); // Adding a delay to simulate some work
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (resource2) {
					System.out.println("Thread 1 acquired resource2");
				}

			}

		}
	}

	class T2 implements Runnable {

		@Override
		public void run() {
			synchronized (resource2) {
				System.out.println("Thread 2 acquired resource2");

				synchronized (resource1) {
					System.out.println("Thread 2 acquired resource1");
				}
			}
		}
	}
	private static void sum(int... nums)
	{
		for(int a:nums)
		{
			System.out.print(a +" ");
		}
		System.out.println();
	}

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		String s = "  abc  def\t";
		
		s = s.strip();
				
		System.out.println(s);
		
		DeadLockExamples.sum(1,1,2,3);
		
		DeadLockExamples deadLockExamples = new DeadLockExamples();
		DeadLockExamples.T1 t1 = deadLockExamples.new T1();
		Thread thread1 = new Thread(t1);
		String str = "my name is prem";
		str.chars().mapToObj(c -> (char) c).filter(c->!c.equals(' ')).forEach(c->System.out.print(c));
		System.out.println();
		String string = Stream.of(str).map(strr->strr.replace(" ", "")).findAny().get();
		System.out.println(string);
		// Stream.of(str).
		

		// Thread.holdsLock(thread1)

		DeadLockExamples.T2 t2 = deadLockExamples.new T2();
		Thread thread2 = new Thread(t2);

		thread1.start();
		thread2.start();
	}
}