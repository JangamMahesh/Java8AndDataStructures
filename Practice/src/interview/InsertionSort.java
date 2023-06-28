package interview;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface sort{
	int[] sortArry(int[] ar);
}

class Student{	
	private String name;
	private int subject1Marks;
	private int subject2Marks;
	private int subject3Marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSubject1Marks() {
		return subject1Marks;
	}
	public void setSubject1Marks(int subject1Marks) {
		this.subject1Marks = subject1Marks;
	}
	public int getSubject2Marks() {
		return subject2Marks;
	}
	public void setSubject2Marks(int subject2Marks) {
		this.subject2Marks = subject2Marks;
	}
	public int getSubject3Marks() {
		return subject3Marks;
	}
	public void setSubject3Marks(int subject3Marks) {
		this.subject3Marks = subject3Marks;
	}
	public Student(String name, int subject1Marks, int subject2Marks, int subject3Marks) {
		super();
		this.name = name;
		this.subject1Marks = subject1Marks;
		this.subject2Marks = subject2Marks;
		this.subject3Marks = subject3Marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject1Marks=" + subject1Marks + ", subject2Marks=" + subject2Marks
				+ ", subject3Marks=" + subject3Marks + "]";
	}
	
}

public class InsertionSort {

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList();
		list.add(new Student("abc",23,54,68));
		list.add(new Student("cds",21,55,67));
		list.add(new Student("ssd",25,55,63));
		list.add(new Student("mah",27,54,61));
		
		//list.stream().filter(s->s)).Comparator(ComaparingBy(student::getMarks)).reversed().skip(1).limit(1).collect(Collectors.toList());

		//List<Student> collect = list.stream()..skip(1).collect(Collectors.toList());	
		
         Integer integer = list.stream().map(s->s.getSubject2Marks()).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
         List<Student> collect = list.stream().filter(s->s.getSubject2Marks()==integer).collect(Collectors.toList());
         
         System.out.println(collect);
         
	//	System.out.println(collect);
		int[] arr1 = { 14, 2, 5, 67, 81,1,100,6 };
		//ar = getSortedArray(ar);
		sort ar1=(ar)-> {
			for (int i = 0; i < ar.length; i++) {
				int j = i;

				while (j > 0 && ar[j] < ar[j - 1]) {
					int temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
					j--;
				}
			}return ar;
		};
		int[] sortArry = ar1.sortArry(arr1);
		System.out.println("array in sorted order");
		for (int i = 0; i < sortArry.length; i++) {
			System.out.print(sortArry[i] + " ");}
	}
}
