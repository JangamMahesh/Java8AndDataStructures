package DS;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		String str="eat"+"eat";
		System.out.println("index "+ str.indexOf("tea"));
		if(str.indexOf("tea")!=-1) {
		System.out.println("tea");
		}	
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println("enter second String");
		sc.nextLine();
		String s2 = sc.next();
		char c2[] = s2.toCharArray();
		char c1[] = s1.toCharArray();
		int index[] = new int[4];
		int hash1[] = new int[4];
		int hash2[] = new int[4];
		int r = 0, l = 0;

		index = getIndexesOfAnagram(c1, c2, hash1, hash2, index);
		for (int i = 0; i < index.length; i++) {
			System.out.print(index[i] + " ");
		}

	}
	private static int[] getIndexesOfAnagram(char[] s1, char[] s2, int[] hash1, int[] hash2, int[] index) {
		// TODO Auto-generated method stub
		int r = 0, l = 0;
		while (r < s2.length) {
			hash1[s1[r] - 'a'] += 1;
			hash2[s2[r++] - 'a'] += 1;
		}
		int i = 0;
		r--;
		while (r < s1.length) {
			if (Arrays.equals(hash1, hash2)) {
				System.out.println("hello");
				index[i++] = l;
			}
			r++;
			if (r != s1.length) {
				hash1[s1[r] - 'a'] += 1;

				hash1[s1[l] - 'a'] -= 1;
				l++;
			}
		}

		return index;
	}

}
