package collections;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArrayLists {
	public static void main(String[] args) {
		Random r=new Random();
		r.ints(1,20).limit(5).forEach(System.out::println);
		SecureRandom sr =new SecureRandom();
		sr.ints().limit(5).forEach(System.out::println);
		List<Integer> li2 = new ArrayList<>();
		li2.add(1);
		li2.add(2);
		List<Integer> li3 = Collections.unmodifiableList(li2);
	
		li2.add(23);
		// after returning the unmodifiable list we can change the returned list;
		//li3.add(121);
		System.out.println(li3);
		System.out.println(li2);
		// TODO Auto-generated method stub
		ArrayLists obj = new ArrayLists();
		List<Student> studs = new ArrayList<>();
		/*
		 * List<Integer> li=new ArrayList<>(); li.add(1); li.add(5); li.add(1);
		 */
		/* System.out.println(li.indexOf(1)); */
		studs.add(new Student(10, 29));
		studs.add(new Student(11, 92));
		studs.add(new Student(21, 20));
		studs.add(new Student(5, 83));
		System.out.println(studs.get(3));
		Iterator iterator = studs.iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		/* obj.display(studs); */
		System.out.println();
		/* studs.remove(2); */
		/* obj.display(studs); */

		Collections.sort(studs);
		obj.display(studs);
	}

	private void display(List<Student> studs) {
		// TODO Auto-generated method stub
		for (Student o : studs) {

			System.out.println(o);
		}
	}

}

class Student implements Comparable<Student> {
	int id;
	int marks;

	public Student(int id, int marks) {
		super();
		this.id = id;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub

		return -(o.marks - this.marks);
	}
//	 public int compare(Student o1, Student o2) {
//		  // TODO Auto-generated
//	return o1.getMarks()>o2.getMarks()?-1:o1.getMarks()<o2.getMarks()?-1:0; }

}