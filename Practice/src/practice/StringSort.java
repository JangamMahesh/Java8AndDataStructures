package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeSet;

public class StringSort {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the string array lenght");
		int size = sc.nextInt();
		sc.nextLine();
		String str[] = new String[size];
		Map<String, Integer> map = new HashMap<>();
		int array[] = new int[2];
		System.out.println(size);
		TreeSet<String> set = new TreeSet<>();
		System.out.println("etner the strings");
		// Set<String> set=new HashSet<>();
		int max = 0;
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();

		}
		for (String s : str) {
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				map.put(s, map.get(s) + 1);
			}

		}

//		for (String i:set) {
//			int count=getCount(i,str);
//			map.put(i, count);
//		}
		for (Entry<String, Integer> key : map.entrySet()) {
			if (key.getValue() > max) {
				max = key.getValue();
			}

			// System.out.println(key.getKey() + " " + key.getValue());
		}
		for (Entry<String, Integer> key : map.entrySet()) {
			if (max == key.getValue()) {
				set.add(key.getKey());
			}
		}
//		for(String s:set)
//		{
//			System.out.println(s);
//		}
		System.out.println(set.last());

		String output[] = getSortedStrings(str);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}

	private static String[] getSortedStrings(String[] str) {
		// TODO Auto-generated method stub
		for (int i = 0; i < str.length; i++) {
			while (i > 0 && str[i].compareTo(str[i - 1]) < 0)

			{
				String temp = str[i];
				str[i] = str[i - 1];
				str[i - 1] = temp;
				i--;
			}
		}
		return str;
	}

}
