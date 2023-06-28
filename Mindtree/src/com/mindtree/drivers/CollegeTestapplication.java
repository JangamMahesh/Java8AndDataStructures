package com.mindtree.drivers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.mindtree.entities.College;
import com.mindtree.entities.Student;
import com.mindtree.utilities.Validations;

public class CollegeTestapplication {
	static Scanner sc = new Scanner(System.in);
	static Validations iv = new Validations();
	static List<College> college = new ArrayList<>();

	/* static Iterator iter=college.iterator(); */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0;
		do {
			System.out.println(
					"1.Enter Details \n2.Show the College details with avarage marks\n3.Sort And display college as per rating in descending order \n4.Show a college Student details sorted by marks\n5.print perticular student deails\n6.Exit");
			System.out.println("Choose option :");
			op = sc.nextInt();

			switch (op) {
			case 1:
				enterDetails();
				break;
			case 2:
				if (college.size() == 0) {
					System.out.println("No college is found");
				} else {
					float avgMarks = getAverageMarksOfCollege();
					System.out.println("avrage marks of college : " + avgMarks);
				}
				break;
			case 3:
				if (college.size() == 0) {
					System.out.println("No college is found");
				} else {
					sortCollegeAsperRating();
					display(college);
				}
				break;
			case 4:
				if (college.size() == 0) {
					System.out.println("No college is found");
				} else {
					sortStudentsMarksOfCollege();
				}
				break;
			case 5:
				if (college.size() == 0) {
					System.out.println("No college is found");
				} else {
					showStudentNamebasedOnName();
				}
				break;
			case 6:
				break;
			default:
				System.out.println("Invalid option");
				break;

			}

		} while (op != 6);
	}

	private static void showStudentNamebasedOnName() {
		// TODO Auto-generated method stub
		System.out.println("enter college Id to get the students");
		int id = iv.validateSize(sc.nextInt());
		sc.nextLine();
		int count = 0;
		int count2 = 0;
		for (College c : college) {
			if (c.getcId() == id) {
				System.out.println("enter name of Student");
				String name = iv.validateString(sc.nextLine());
				for (int i = 0; i < c.getStudentCount(); i++) {
					if (c.getS().get(i).getStudentName().equalsIgnoreCase(name)) {
						System.out.println(c.getS().get(i));
					} else {
						count++;
					}
				}
				if (count == c.getStudentCount()) {
					System.out.println("Student name is not Found");
				}
			} else {
				count2++;
			}
		}
		if (count2 == college.size()) {
			System.out.println("college Id is Not Found");
		}

	}

// sorting using comaparable
	private static void sortStudentsMarksOfCollege() {
		// TODO Auto-generated method stub
		System.out.println("Enter the collge Id to get marks of students in sorted Order ");
		int id = iv.validateSize(sc.nextInt());
		for (College c : college) {
			if (c.getcId() == id) {

				Collections.sort(c.getS());
                System.out.println(c.getS());
			}
		}
	}

// displaying colleges 
	private static void display(List<College> college2) {
		// TODO Auto-generated method stub
		for (College c : college) {
			System.out.println(c);
		}
	}

// sorting using Comaprator
	private static void sortCollegeAsperRating() {
		// TODO Auto-generated method stub
		Collections.sort(college, (c1, c2) -> {
			return c1.getRating() > c2.getRating() ? -1 : c1.getRating() < c2.getRating() ? 1 : 0;
		});

	}

	private static float getAverageMarksOfCollege() {
		System.out.println("Enter the collge Id to get average marks of college");
		int id = iv.validateSize(sc.nextInt());
		int count = 0;
		float avgMarks = 0;
		int marksSum = 0;
		for (College c : college) {
			if (c.getcId() == id) {
				for (int i = 0; i < c.getStudentCount(); i++) {
					marksSum += c.getS().get(i).getMarks();
					avgMarks = marksSum / c.getStudentCount();
				}

			} else {
				count++;
			}
		}
		if (count == college.size()) {
			System.out.println("college id is not found");
		}

		return avgMarks;
		// TODO Auto-generated method stub

	}

	private static void enterDetails() {
		// TODO Auto-generated method stub
		sc.nextLine();
		System.out.println("enter collegeName");
		String cName = iv.validateString(sc.nextLine());
		System.out.println("enter College Id");

		int cid = iv.validateSize(sc.nextInt());
		// sc.nextLine();
		System.out.println("enter College rating");
		float rating = iv.validateFloat(sc.nextFloat());
		System.out.println("enter studentsCount of College");
		int scount = iv.validateSize(sc.nextInt());
		sc.nextLine();
		System.out.println("### ENTER STUDENT DEATILS  OF COLLEGE  #### " + cName);
		List<Student> student = new ArrayList<>();
		for (int i = 0; i < scount; i++) {
			System.out.println("enter sudent Name");
			String sname = iv.validateString(sc.nextLine());
			System.out.println("enter student id");
			int sId = iv.validateSize(sc.nextInt());
			System.out.println("enter Student marks");
			int marks = iv.validateSize(sc.nextInt());
			sc.nextLine();
			student.add(new Student(sId, marks, sname, cName));
		}
		college.add(new College(cid, cName, rating, scount, student));
	}

	/*
	 * class MarkComaprator implements Comparator<Student> {
	 * 
	 * @Override public int compare(Student o1, Student o2) { // TODO Auto-generated
	 * method stub return
	 * o1.getMarks()>o2.getMarks()?1:o1.getMarks()<o2.getMarks()?-1:0; }
	 */

}
