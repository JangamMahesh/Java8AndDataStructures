package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collectioins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj = new ArrayList<>();
		obj.add(129);
		obj.add(12);
		obj.add(2, 10);
//		Collections.sort(obj,(i1,i2)->
//		{
//			return i1%10>i2%10?1:i1%10<i2%10?-1:0;
//		}
//		);
		Collections.sort(obj);
		for (Integer o : obj) {
			System.out.println(o);
		}
	}
}
