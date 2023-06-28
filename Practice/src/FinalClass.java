import java.util.ArrayList;
import java.util.List;

public final class FinalClass {
	
	private final int id = 0;
	private final static List<Integer> list=new ArrayList();	
	List<Integer> l2=new ArrayList<Integer>();
	
	
	
	public static void main(String[] args) {
		list.add(10);
		System.out.println(list);
	}

}
