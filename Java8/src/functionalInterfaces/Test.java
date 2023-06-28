package functionalInterfaces;

interface Left {

	default void m1() {
		System.out.println("Left Default Method");
	}

	public static void m2() {
	}
}

interface Right {
	default void m1() {
		System.out.println("Right Default Method");
	}
}

class P {
	void m1() {
		System.out.println("helo");
	}
}

class C extends P {

	void m1() {
		System.out.println("ram");
	}
	void m2() {
		System.out.println("ram2");
	}
}

public class Test implements Left, Right {
	public static void main(String[] args) {

		P c = new P();
		c.m1();
		P a = new C();
		a.m1();
		C b = new C();
		b.m2();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 10;
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Left.super.m1();
	}

}
