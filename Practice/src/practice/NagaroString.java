package practice;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NagaroString {

	public static void main(String[] args) {

		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		System.out.println(" changed String "+  getString(str));
		
		System.out.println("enter one more string to find frequency");
		String str1=sc.nextLine();
		System.out.println(getFrequencyOfChars(str1));
	
		
	}

	private static String getFrequencyOfChars(String str1) {
		
		String res="";
		IntStream chars = str1.chars();
		long count = chars.count();
		System.out.println(count);
		
		Map<Character, Long> collect = str1.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		for (Map.Entry<Character, Long> item : collect.entrySet()) {
			res+=item.getKey()+""+item.getValue();
		}
		
		
		return res;
	}

	private static String getString(String str) {
		String res="";
		
		if(str.contains("_"))
		{
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)=='_')
				{
					i++;
					res+=(char)(str.charAt(i)-32);
				}
				else
				{
					res+=str.charAt(i);
				}
			}
		}
		else
		{
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)>=65 && str.charAt(i)<=90)
				{
					res+="_";
					res+=(char)(str.charAt(i)+32);
				}
				else
				{
					res+=str.charAt(i);
				}
			}
		}
		
		return res;
	}

}
