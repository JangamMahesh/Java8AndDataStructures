package collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Maps {
	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
	
		HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put(null, null);
		System.out.println(hashMap);
		hashMap.put(null, 87);
		System.out.println(hashMap);
		
		// Flat Maps
		
		//creating ArrayList      
		List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");  
		List<String>  productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");  
		List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");  
		List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");  
		List<List<String>> allproducts = new ArrayList<List<String>>();   
		//adding elements to the list  
		allproducts.add(productlist1);  
		allproducts.add(productlist2);  
		allproducts.add(productlist3);  
		allproducts.add(productlist4); 	
		
		List<String> flatLists = allproducts.stream().flatMap(f->f.stream()).collect(Collectors.toList());
		
		System.out.println(flatLists);
		

		List<String> list = Arrays.asList("A", "B", "B", "C", "D", "D", "Z", "E", "E");
		list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // perform group by
																									// count
				.entrySet().stream().filter(e -> e.getValue() > 1L) // using take only those element whose count is
																	// greater than 1
				.map(e -> e.getKey()) // using map take only value
				.collect(Collectors.toList()).forEach(System.out::println);
		; // convert group by result to list
	
		// find first non repeating character
		System.out.println("first non repeating charactor");
	String str="aaabbcdsssc";
	Map<Character, Long> collect = str.chars().mapToObj(o->(char) o).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
	Character character = collect.entrySet().stream().filter(i->i.getValue()==1L).map(Map.Entry::getKey).findFirst().get();
	
	System.out.println("char "+ character);
	

		Map<Integer, String> map = new HashMap<>();
		// System.out.println(map.size());
		// getting the capacity of map
		Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
		Map<Integer, String> nmap = new HashMap<>();
		map.put(2, "two");
		map.put(1, "one");
		map.put(5, "five");
		map.put(2, "mahesh");
		System.out.println(map.size());
		Field tableField = HashMap.class.getDeclaredField("table");
		tableField.setAccessible(true);
		Object[] table = (Object[]) tableField.get(map);
		System.out.println(table == null ? 0 : table.length);
		nmap.putAll(map);
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("maheh"));
		System.out.println(map.size());
		System.out.println(map.isEmpty());

		/*
		 * Set<Map.Entry<Integer, String>> values = nmap.entrySet(); for
		 * (Map.Entry<Integer, String> e : values) { if (e.getValue().equals("mahesh"))
		 * { System.out.println("found value"); } System.out.println(e.getKey() +
		 * " value is " + e.getValue());
		 * 
		 * }
		 */

		for (Entry<Integer, String> key : nmap.entrySet()) {
			System.out.println(key.getKey() + " " + key.getValue());
		}
	}

}
