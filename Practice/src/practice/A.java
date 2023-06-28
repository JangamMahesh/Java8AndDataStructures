package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A {
	public int myData;
//
//	public A(int data) {
//		myData = data;
//	}
//
//	public int getData() {
//		return myData;
//	}
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("this","is","Interview","process");
		asList.stream().forEach(System.out::println);
		
		
		String str1="this is an interview process";
		String[] split = str1.split(" ");
		
		String result="";
		for (int i = 0; i < split.length-1; i++) {
			
			
		}
		
		
		System.out.println(str1);
		

		Integer valueOf = Integer.valueOf(1);
		System.out.println(valueOf);

		int a = 10;
		int b = 20;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + " " + b);

		System.out.println("Mahesh" + 10 * 9);
		System.out.println(10 * 9 + "Mahesh");
		System.out.println("Mahesh" + (10 + 9));
		System.out.println(10 - 9 + "Mahesh");
		System.out.println("Mahesh" + 10 / 9);
		System.out.println(10 / 9 + "Mahesh");
		String str = "Mahesh " + 10 + 9 + 8 + 90;
		String str2 = 10 - 9 + "Mahesh";
		System.out.println(str);
		System.out.println(str2);
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(0, 12);
		li.add(121);
		System.out.println(li.get(1));
//		for (int i = 0; i < 5; i++) {
//			String str = sc.nextLine();
//			System.out.println(str.indexOf("a"));
//			System.out.println(str.indexOf("aa"));
//			System.out.println(str.indexOf("abc", 2));
//			System.out.println(str.lastIndexOf("ab"));
//			System.out.println(str.replace("mah", "abc"));
//			// System.out.println(str.replaceAll("a","z"));
//			System.out.println(str.startsWith("abc"));
//			System.out.println(str.startsWith("ab", 2));
//			System.out.println(str.substring(3));
//			System.out.println(str.substring(4, 8));
//		}
//		String[] str = sc.nextLine().split(" ");
//		int[] ar = new int[str.length];
//		for (int i = 0; i < str.length; i++) {
//			ar[i] = Integer.parseInt(str[i]);
//
//		}
//		int sum = 0;
//		for (int i = 0; i < ar.length; i++) {
//			System.out.println(ar[i]);
//			sum += ar[i];
//		}
//		System.out.println(sum);
	}

	

	public char[] getData() {
		// TODO Auto-generated method stub
		return null;
	}
}
