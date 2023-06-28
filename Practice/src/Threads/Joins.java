package Threads;

public class Joins {

	class A extends Thread {

		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	class B extends Thread {

		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		Joins obj = new Joins();

		A a = obj.new A();
		B b = obj.new B();

		a.start();
		b.start();
	}

}
