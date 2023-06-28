package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		int key = 0;
		process(list, key, wrapperLambda((v, k) -> System.out.println(v / k)));}

// implementing the exception handling in another method using wrapping concept
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		// TODO Auto-generated method stub
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("exceprion ");
			}
		};
	}
	private static void process(List<Integer> list, int key, BiConsumer<Integer, Integer> consumer) {
		// TODO Auto-generated method stub
		for (Integer integer : list) {
			consumer.accept(integer, key);
		}

	}

}
