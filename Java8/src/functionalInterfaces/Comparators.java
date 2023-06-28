package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MyComparator implements Comparator<MyComparator> {

	private int id;
	private String name;

	public MyComparator(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public MyComparator() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * @Override public int compare(Integer o1, Integer o2) { // TODO Auto-generated
	 * method stub return (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0; }
	 */

	@Override
	public String toString() {
		return "MyComparator [id=" + id + ", name=" + name + "]";
	}

	/*
	 * @Override public int compareTo(MyComparator o) { // TODO Auto-generated
	 * method stub return this.getName()-o.getName(); }
	 */
	@Override
	public int compare(MyComparator o1, MyComparator o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}

}

public class Comparators {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 2, 9, 5, 8, 3);
		list.stream().sorted().forEach(System.out::print);

		List<Integer> arrayList = new ArrayList<Integer>(list.size());

		// arrayList.addAll(list);
		ArrayList li = new ArrayList();
		ArrayList clone = (ArrayList) li.clone();
		System.out.println(arrayList);
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		
		hashMap.clone();

		// Collections.sort(list, new MyComparator());
		Collections.sort(list, (I1, I2) -> (I1 > I2) ? 1 : (I1 < I2) ? -1 : 0);
		System.out.println(list);
		TreeSet<Integer> t = new TreeSet<Integer>((I1, I2) -> (I1 > I2) ? 1 : (I1 < I2) ? -1 : 0);
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(15);
		t.add(25);
		t.add(5);
		t.add(20);
		System.out.println(t);

		TreeMap<Integer, String> m = new TreeMap<Integer, String>((I1, I2) -> (I1 > I2) ? 1 : (I1 < I2) ? -1 : 0);
		m.put(100, "Durga");
		m.put(600, "Sunny");
		m.put(300, "Bunny");
		m.put(200, "Chinny");
		m.put(700, "Vinny");
		m.put(400, "Pinny");
		System.out.println(m);
		MyComparator myComparator = new MyComparator();
		Map<Integer, String> sortedValue = new TreeMap<Integer, String>();
		sortedValue.put(100, "Durga");
		sortedValue.put(600, "Sunny");
		sortedValue.put(300, "Bunny");
		sortedValue.put(200, "Chinny");
		sortedValue.put(700, "Vinny");
		sortedValue.put(400, "Pinny");

		LinkedHashMap<Integer, String> collect = sortedValue.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(collect);

		sortedValue.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		Map<Integer, MyComparator> sortedValueByObject = new TreeMap<Integer, MyComparator>();
		sortedValueByObject.put(1, new MyComparator(1, "mahesh"));
		sortedValueByObject.put(4, new MyComparator(2, "ahesh"));
		sortedValueByObject.put(3, new MyComparator(5, "hesh"));
		// MyComparator comparator = new MyComparator();
		System.out.println(sortedValueByObject);

		sortedValueByObject.entrySet().stream()
				.sorted(Map.Entry.comparingByValue((o1, o2) -> o1.getName().compareTo(o2.getName())))
				.forEach(System.out::println);
		/* Comparator.comparingInt(MyComparator::getId)) */

		sortedValueByObject.entrySet().stream().sorted(Map.Entry.comparingByValue(new MyComparator()))
				.forEach(System.out::println);
	}
}
