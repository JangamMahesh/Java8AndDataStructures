package java8.lambda;

@FunctionalInterface
interface A {
	void print();

	default void m() {
		System.out.println("in Interface 1");
	}
}

@FunctionalInterface
interface B {
	void print();
	default void m() {
	//	super.print();
		System.out.println("in Interface 2");
	}
}

public class Using2Interfaces implements A, B {

	public static void main(String s[]) {
		A a = new Using2Interfaces();
		B b = new Using2Interfaces();
		a.m();
	//	b.m();
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		A.super.m();
		System.out.println("hello");
	}

}
