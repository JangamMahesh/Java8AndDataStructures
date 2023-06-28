package collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Duplicate {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> li = new TreeSet<>();
		System.out.println("enter length");
		int size = sc.nextInt();
		System.out.println("enter elemtns");
		for (int i = 0; i < size; i++) {
			li.add(sc.nextInt());
		}
		System.out.println("without duplicates list is follows");
		for (Integer i : li) {
			System.out.print(i + " ");
		}
	}
}
