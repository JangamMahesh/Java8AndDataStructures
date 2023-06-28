package CalculateMarksOfStudents;

import java.util.Scanner;

import ItemApplication.Validations;

public class Demo {
	static Scanner sc = new Scanner(System.in);
	static Validations validation = new Validations();
	static float marks;

	public static void main(String[] args) {
//		Step1: Create an object of Student class by passing appropriate values to the constructor.

		System.out.println("enter id,name and secondchance(true or false)");
		int id = sc.nextInt();
		int validId = validation.validateId(id);
		String name = sc.next();
		String validName = validation.validateString(name);
		boolean s = sc.nextBoolean();

		/*
		 * Step2: Based on the value used for second chance instance variable, invoke
		 * the appropriate identifyMarks() method.
		 */
		Student student = new Student(validId, validName, s);
		/*
		 * Step3: Invoke the getter methods and display all the instance variable values
		 * of the Student object created. Create one more object (use different value
		 * for second chance) by repeating steps 1 to 3 and test your program.
		 */
		if (s == true) {
			float marks1, marks2;
			System.out.println("enter marks scored by the student in the first chance");
			marks1 = sc.nextFloat();
			float validMarks1 = validation.validateScore(marks1);
			System.out.println("enter marks scored by the student in the second chance:");
			marks2 = sc.nextFloat();
			float validMarks2 = validation.validateScore(marks2);
			identifyMarks(validMarks1, validMarks2);
		} else {
			float marks;
			System.out.println("enter the marks:");
			marks = sc.nextFloat();
			float validMarks = validation.validateScore(marks);
			identifyMarks(validMarks);

		}
		System.out.println(
				"s_id:" + student.getStudentId() + "\ns_name:" + student.getStudentName() + "\ns_marks:" + marks);

	}

	public static void identifyMarks(float score) {
		marks = score;
	}

	public static void identifyMarks(float score1, float score2) {
		if (score1 < score2)
			marks = score2;
		else
			marks = score1;
	}

}
