package Threads;

public class LockOnClassAndObject {

	// if we make the methods static and call using class name , so no need to
	// create object of class and pass to thread class
	// then only one thread can access any method of class

	public synchronized void m1() {
		System.out.println("in method one " + Thread.currentThread().getName());
	}

	public static synchronized void m3() {
		System.out.println("in method 3 " + Thread.currentThread().getName());
	}

	public synchronized void m2() {
		System.out.println("in method 2 " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LockOnClassAndObject object = new LockOnClassAndObject();
		LockOnClassAndObject object2 = new LockOnClassAndObject();

		A t1 = new A(object);
		B t2 = new B(object2);

		t1.start();
		t2.start();

	}

}
class A extends Thread {
	LockOnClassAndObject object = null;
	public A(LockOnClassAndObject object) {
		this.object = object;
	}
	@Override
	public void run() {
		object.m1();
		object.m2();
		LockOnClassAndObject.m3();
	}
}
class B extends Thread {
	LockOnClassAndObject object = null;
	public B(LockOnClassAndObject object) {
		this.object = object;
	}
	@Override
	public void run() {

		object.m1();
		object.m2();
		LockOnClassAndObject.m3();
	}

}
