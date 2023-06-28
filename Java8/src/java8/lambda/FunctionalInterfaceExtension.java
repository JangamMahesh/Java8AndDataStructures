package java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

@FunctionalInterface
interface C {
	void print();

	default void p() {
		System.out.println("in default p1 C");
	}

	static void print2() {
		System.out.println("in interface C static print2 ");
	}
}

@FunctionalInterface
interface E{
	
	void print();
	
	default void p() {
		System.out.println("in default E ");
	}
	
}

@FunctionalInterface
interface D extends C {

	// void print1();
}

class F implements C, D {

	@Override
	public void print() {
		System.out.println("Hiloo");
		C.print2();
	}

	static void print2() {
		C.print2();
		System.out.println("in class F static print2 ");
	}

}

class X implements C,E {

	public X() {
		System.out.println("IN A constructor");
	}

	public X(int a) {
		System.out.println("IN A constructor " + a);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void p() {
		// TODO Auto-generated method stub
		E.super.p();
	}

	
}

class G extends X {
	public G() {
		// super();
		System.out.println("in B constructor");
	}

	public G(int a) {
		super(a);
		System.out.println("in B constructor " + a);
	}
}

public class FunctionalInterfaceExtension {

	public static void main(String[] args) {

		String s = "mahesh prem prakash shivaram";
		String[] split = s.split(" ");
		Integer integer = Arrays.stream(split).map(e -> e.length()).max((o1, o2) -> o1.compareTo(o2)).get();
		System.out.println(integer);

		X x=new X();
		x.p();
		
		
		C c = new F();
		c.print();
		
		F.print2();
		c.p();
		D d = new F();
		d.print();

		G g = new G();

		G g1 = new G(1);
	}

}
