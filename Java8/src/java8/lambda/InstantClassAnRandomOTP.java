package java8.lambda;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class InstantClassAnRandomOTP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> asList2 = Arrays.asList(1,2,3,4,5);
		Integer integer = asList2.stream().reduce((a,b)->a+b).get();
		System.out.println(integer);

		Instant i = Instant.now();
		System.out.println(i);
		System.out.println("EPOC " + Instant.EPOCH);
		System.out.println("MAx support " + Instant.MAX);
		System.out.println("Min support " + Instant.MIN);

		Instant parse = Instant.parse("2023-02-06T17:57:36.396525300Z");
		Instant minus = parse.minus(Duration.ofDays(2));
		System.out.println(minus);
		System.out.println(parse.plus(Duration.ofDays(2)));
		System.out.println(parse.isBefore(i));
		System.out.println(parse.isAfter(i));

		String str = "FGHJHKGF4%&^*&(*35";
		System.out.println(str.replaceAll("[^a-zA-Z0-9)]", ""));
		System.out.println(str.replaceAll("\\d", ""));

		Random random = new Random();
		random.ints(1, 100).limit(5).sorted().forEach(System.out::println);

		System.out.println();
		System.out.println("otp ");
		int a=(int) (Math.random() * 100000);
		int b=random.ints(1,1000).limit(10).sum();
		System.out.println(a + " "+ b);
		int otp = (int) (a) + (int)(b);
		
		System.out.println(otp);

		String number = "923840239";
		System.out.println(number.replaceAll(".(?=.{3})", "*"));
		
		List<String> asList = Arrays.asList("aba","sdf","xyx","sdf");
		List<Integer> asList1 = Arrays.asList(1,2,3,4,5);
		asList.stream().filter(x->x.endsWith(String.valueOf(x.charAt(0)))).forEach(System.out::println);
		asList1.stream().reduce(0,Integer::sum);
	}

}
