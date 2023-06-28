package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// to confirm whether 2 string are anagrams just sort each of them and compare.
//or
// create 26 length of int array to store count of each char frequency and create representation of it using Stringbuilder
//make that representation as key if that representation matches to any string add it in map if matches get old arraylist add new string to it, 
//if doesn't match create new arrayList add string to it
// at last get all values as list of String
public class AnagramGroup {

	public static void main(String[] args) {
		String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		 List<List<String>> out=new ArrayList();
	        Map<String,ArrayList<String>> hm=new HashMap();
	        if(strs.length==0)
	        return out;
	       for(String str:strs)
	       {
	           int[] count=new int[26];
	           for(int i=0;i<str.length();i++)
	           {
	               count[str.charAt(i)-'a']++;
	           }
	           StringBuilder sb=new StringBuilder();
	           for(int a:count)
	           {
	               sb.append(a);
	               sb.append("#");
	           }
	           String rep=sb.toString();  
	         if(hm.containsKey(rep))
	         {
	             ArrayList<String> ana=hm.get(rep);
	             ana.add(str);
	             hm.put(rep,ana);
	         }
	         else{
	             ArrayList<String> ana=new ArrayList();
	             ana.add(str);
	             hm.put(rep,ana);
	         }
	       }
	       for(List<String> val: hm.values())
	       {
	           out.add(val);
	       }

	        return out;
	    }
	

}
