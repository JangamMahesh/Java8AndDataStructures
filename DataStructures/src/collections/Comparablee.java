package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparablee{
public static void main(String a[]) {
	List<Student1> studs=new ArrayList<>();
	
	studs.add(new Student1(10, 29));
	studs.add(new Student1(11, 92));
	studs.add(new Student1(21, 20));
	studs.add(new Student1(5, 83));
	Collections.sort(studs);
	for(Student1 s:studs) {
	System.out.println(s);}
	}
}

class Student1 implements Comparable<Student1>
{
	int id;
	int marks;
	public Student1(int id, int marks) {
		super();
		this.id = id;
		this.marks = marks;
	}
	public int compareTo(Student1 s) {
		return this.marks-s.marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + "]";
	}
	}
	
	
	
