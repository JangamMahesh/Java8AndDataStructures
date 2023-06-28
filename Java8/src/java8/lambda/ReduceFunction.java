package java8.lambda;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 3, 4);

		Optional<Integer> min = l.stream().map(i -> i).min((a, b) -> a-b);
		System.out.println("minUsing oprional "+min.get());
		OptionalDouble average = l.stream().mapToInt(i -> i).average();

		System.out.println(average.getAsDouble());

		int sum2 = l.stream().mapToInt(i -> i).sum();
		System.out.println(sum2);
		Integer max = l.stream().reduce(Integer::max).get();
		System.out.println("max " + max);
		Integer min1 = l.stream().reduce(10, (a, b) -> a < b ? a : b);
		System.out.println("min " + min1);

		Integer sum = l.stream().reduce(Integer::sum).get();
		System.out.println("sum " + sum);

		Integer i1[] = { 1, 8, 2, 4, 5, 6 };

		List<Integer> l2 = List.of(i1);
		// l2.add(12);
		System.out.println(l2.contains(1));
		System.out.println(l2);

		// this ll return first matching key value or second value..
		Map<Integer, String> m1 = l.stream()
				.collect(Collectors.toMap((i) -> i, (i) -> "Hi " + i, (first, second) -> first));

		System.out.println(m1);
		Set<Integer> s1 = l.stream().collect(Collectors.toSet());
		System.out.println(s1);
		Map<Integer, String> m = s1.stream().collect(Collectors.toMap((i) -> i, (i) -> "Hi " + i));
		m.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});
		System.out.println("list " + l);
		Integer sum3 = l.stream().reduce((a, b) -> a - b).get();
		System.out.println("substraction " + sum3);
		Optional<Integer> sum1 = l.stream().reduce((a, b) -> {
			System.out.println(a + " hi " + b);
			return a + b;
		});
		System.out.println(sum1.get());
		Integer s = l.stream().reduce(10, (a, b) -> {
			return a + b;
		});
		System.out.println(s);
		System.out.println(Stream.of(1, 2, 4, 5).count());
		System.out.println(Stream.of(1, 2, 4, 5).findFirst().get());
		System.out.println(Stream.of(1, 2, 4, 5).anyMatch((i) -> i % 2 == 1));
	}

}
