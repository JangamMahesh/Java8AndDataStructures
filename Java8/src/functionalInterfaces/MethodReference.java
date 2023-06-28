package functionalInterfaces;

import java.util.Arrays;
import java.util.List;

interface greeting {

	void say();

}

interface Cons {

	public MethodReference get(String s);
}

class greet {
	public void callingFromClass() {

	}
}

public class MethodReference {

	public MethodReference() {

		System.out.println("raamm");
	}

	public MethodReference(String s) {
		System.out.println("hello " + s);
	}

	public static void saySomething(greeting g) {

		System.out.println("helo boy");
		g.say();

	}

	public void saySomethingExtra() {

		System.out.println("hello good boy");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> str = Arrays.asList("ds", "sdf", "sdfdf");
		str.forEach(System.out::println);

		// this is calling static method of class
//		greeting g = MethodReference::saySomething;
//		g.say();

		// this is to call non-static methods using object
		MethodReference m = new MethodReference();
		greeting g1 = m::saySomethingExtra;
		g1.say();

		greet g2 = new greet();
		m.saySomething(g2::callingFromClass);

		// constructor refreence

		Cons g = MethodReference::new;
		g.get("mahesh");

	}

}
