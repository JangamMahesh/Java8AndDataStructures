package functionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class ConsumerInterface {
	/*
	 * public static void main(String[] args) {
	 * 
	 * Consumer<Integer> consume = (t) -> { System.out.println(t); };
	 * consume.accept(10);
	 * 
	 * }
	 */
	 
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  
	  
			/*
			 * Consumer<Integer> consumer = t -> System.out.println("print " + t);
			 * 
			 * consumer.accept(10);
			 */
	  
	  List<Integer> list = Arrays.asList(1, 2, 3, 4);
	  
	  list.stream().forEach(t-> System.out.println(t));
	  
	  
	  
	  }
	 

}
