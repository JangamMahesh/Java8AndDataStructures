package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li = new LinkedList<>();
		LinkedList<Integer> lii=new LinkedList<>();
 		li.add(12);
		li.add(21);
		li.add(1212);
		li.add(11);
		li.add(1, 1000);
		lii=(LinkedList<Integer>) li.clone();
		List<List<Integer>> lists=new ArrayList<>();
		lists.add(Arrays.asList(1,2,3));
		lists.add(Arrays.asList(3,2,1));
		
		for(int i=0;i<lists.size();i++)
		{
			if(lists.get(i).equals(Arrays.asList(1,2,3)))
			{
				System.out.println("got it next item " +lists.get(i+1));
			}
		}
		
		Iterator<List<Integer>> it1=lists.listIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		for(List<Integer> list: lists)
		{
			if(lists.equals(Arrays.asList(1,2,3)))
			{
				System.out.println("hello "+list);
			}
		}
		
		Iterator it=lii.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
