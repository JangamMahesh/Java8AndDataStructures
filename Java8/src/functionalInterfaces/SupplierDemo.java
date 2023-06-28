package functionalInterfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * public class SupplierDemo implements Supplier<String> {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * Supplier<String> supplier = new SupplierDemo();
 * 
 * System.out.println(supplier.get());
 * 
 * }
 * 
 * @Override public String get() { // TODO Auto-generated method stub return
 * "supplier get method called "; }
 * 
 * }
 *
 */
// generally stream can be used only once but using supplier we can use it multiple times
class A {
	String b="HelloA";
	enum a {Monday,Sunday,Tuesday} 	 ;

	{
		System.out.println("init "+ a.Monday);
	}

	public A() {
		System.out.println("In A");
	}

	public A(String a) {
		System.out.println("In A" + a);
	}

	void print() {
		System.out.println("printed in A " +b);
	}
}

class B extends A {
	String b="helloB";
	public B(String a) {
		super();
		// super(a);

		System.out.println("IN B" + a);
	}

	public B() {
		// super();
		// super(a);

		System.out.println("IN B");
	}

	void print() {
		//super.print();
		System.out.println("printed in B "+b);
	}
	void printB() {
		System.out.println("printed in B alone");
	}
	{
		System.out.println("init B ");
	}
}
public class SupplierDemo {
	public static void main(String[] args) {
		
		String s1="hello hello hi";
		String[] split = s1.split(" ");
		List<String> arrayList = Arrays.asList(split);
		arrayList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
		for (String string : arrayList) {
			hashMap.put(string, hashMap.containsKey(string)?hashMap.get(string)+1:1);
		}
		hashMap.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
		
		String[] str={"prem","ram","raj"};
		Supplier<Stream<String>> inputStr=()-> Stream.of(str);
		
		inputStr.get().forEach(e->System.out.println(e));
		inputStr.get().filter(e->e.startsWith("r")).forEach(System.out::println);
		
		
		A b = new B();
		System.out.println(b.b);
		b.print();
		SupplierDemo s = new SupplierDemo() {
			public void display() {
				System.out.println("Hlloe");
			}
		};

		Supplier<String> supplier = () -> "hi";

		List<String> list = Arrays.asList();

		System.out.println(list.stream().findAny().orElseGet(supplier));

	}

}
