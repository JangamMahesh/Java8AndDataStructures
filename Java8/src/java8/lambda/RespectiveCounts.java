package java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RespectiveCounts {

	public static void main(String[] args) {

		String str1 = "ksdjfl";
		Optional<String> ofNullable = Optional.ofNullable(str1);

		if (ofNullable.isPresent()) {
			System.out.println("pres");
		} else {

			String de = ofNullable.orElse("same");
			System.out.println(de);
		}

		char chars[] = { 'a', 'b' };
		String st = new String(chars);
		List<Integer> nums = Arrays.asList(2, 10, 4, 6, 6, 04);

		Integer integer = nums.stream().min((a, b) -> a - b).get();
		System.err.println(integer);

		List<Integer> collect2 = nums.stream().sorted().collect(Collectors.toList());

		System.out.println(collect2);

		boolean anyMatch = nums.stream().anyMatch(n -> n % 2 == 0);
		if (anyMatch) {
			System.out.println("at least 1 is divided by 2");
		}

		boolean allMatch = nums.stream().allMatch(n -> n % 2 == 0);
		if (allMatch) {
			System.out.println("All are divided by 2");
		} else {
			System.out.println("Not dvided by 2 ");
		}

		List<String> words = Arrays.asList("aa", "bb", "aa", "bb", "cc", "dd", "bb");

		Map<String, Long> collect3 = words.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect3);
		 words.stream().filter(word-> Collections.frequency(words, word)>1).forEach(System.out::println);
		
		Map<String, Long> collect = words.stream().filter(word -> Collections.frequency(words, word) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

	}

}
