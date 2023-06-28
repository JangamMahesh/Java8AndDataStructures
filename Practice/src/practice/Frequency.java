package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequency {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String[] q = { "aba", "xzxb", "ab", "ab" };

		String[] array = { "a", "ab", "a", "abc", "abc", "a", "ab", "ab", "a" };
		Map<String, Integer> hm = new HashMap();

		for (String x : array) {

			if (!hm.containsKey(x)) {
				hm.put(x, 1);
			} else {
				hm.put(x, hm.get(x) + 1);
			}
		}
		System.out.println(hm);
	}

}
