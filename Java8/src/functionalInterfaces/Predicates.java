package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Predicates {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> predicate = t -> t % 2 == 0;
		Predicate<Integer> p2 = t -> t > 10;
		System.out.println(predicate.test(2));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 121, 12);

		m1(predicate.negate(), list);
		System.out.println();
		m1(predicate.and(p2), list);
		System.out.println();
		m1(predicate.or(p2), list);
		list.stream().filter(predicate).forEach(t -> System.out.println(t));
		// function is functional interface having method apply it takes 2 parameter
		// first is input type and second is output type
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Durga"));
		System.out.println(f.apply("Soft"));}
	private static void m1(Predicate<Integer> negate, List<Integer> list) {
		// TODO Auto-generated method stub
		for (int x : list) {
			if (negate.test(x)) {
				System.out.print("   " + x);
			}
		}
	}

}
