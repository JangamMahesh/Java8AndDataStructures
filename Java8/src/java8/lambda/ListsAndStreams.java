package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListsAndStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		list.stream().forEach(i -> {
			System.out.print(" "+i);
		});
		// Map returns a stream of modified elements , map is not a terminal operation
		// we need to add .collect to terminate and return list
		List<String> newList = list.stream().map(i -> "Abc " + i).collect(Collectors.toList());
		System.out.println(newList);
		// filter will returns stream of given logic
		List<Integer> nlist = list.stream().filter(i -> {
			if (i > 3)
				return true;
			return false;
		}).collect(Collectors.toList());
		System.out.println(nlist);

		List<List<Integer>> l1 = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6));
		List<Integer[]> l3 = Arrays.asList(new Integer[] { 1, 2, 4 }, new Integer[] { 5, 6 });

		List<Integer> l2 = l1.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
		System.out.println(l2);

		// l1.stream().flatMap(l -> l.stream()).collect(Collectors.toList()).forEach(i
		// -> System.out.println(i));

		List<Integer> l4 = l3.stream().flatMap(arr -> Arrays.stream(arr)).collect(Collectors.toList());
		System.out.println(l4);

		Optional<String> o = Optional.ofNullable("rajj");
		Optional<String> o1 = Optional.ofNullable(null);

		// consumer interface has accept method in it
		// System.out.println(o.isPresent());
		System.out.println(o1.empty());
		o.ifPresent(s -> {
			System.out.println(s);
		});
	}
}
