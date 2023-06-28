package java8.lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

// if value is null optional object will throw NoSuchElement Exception instead of Null Pointer exception
public class OptionalClass {

	public OptionalClass(Short s) {
		System.out.println("short "+ s);
	}

	public OptionalClass(int s) {
		System.out.println("int "+ s);
	}

	public static void main(String[] args) {
		
		Set<Object> hashSet = new HashSet<Object>();
		
		hashSet.add(hashSet);
		OptionalClass a = new OptionalClass(10);
		// ways to create optional class
		Optional<Object> empty = Optional.empty();
		
		//System.out.println(empty.get());
		
		Optional<Object> of = Optional.of("hi");
		// returns op if value is null
		Optional<Object> ofNullable = Optional.ofNullable(null);
		//System.out.println(ofNullable.get());
		System.out.println(ofNullable.isEmpty());
		Optional<Object> ofNullable1 = Optional.ofNullable("Hello");
		System.out.println(ofNullable1.get());
		System.out.println(ofNullable1.isPresent());
		ofNullable1.ifPresent(str->System.out.println(str));
		ofNullable1.ifPresent(null);
		List<Integer> li = Arrays.asList(1, 2, 3);
		li.parallelStream().forEach(System.out::println);

		System.out.println();
		li.stream().parallel().forEach(System.out::println);

	}

}
