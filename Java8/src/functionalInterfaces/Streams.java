package functionalInterfaces;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamSource;

public class Streams {

	public static void main(String[] args) {

		//seed the initial element f a function to be applied to the previous element to producea new element
		List<Integer> collect = Stream.iterate(0, i->i+1).limit(10).collect(Collectors.toList());
		System.out.println(collect);
		Optional<Integer> reduce = Stream.iterate(0, i->i+1).limit(10).reduce(Integer::sum);
		System.out.println(reduce.get());
		Integer evenNumber = Stream.iterate(0, i->i+1).limit(10).filter(i->i%2==0).findAny().orElse(12);
		System.out.println(evenNumber);
		
		// 
		
		
	}

}
