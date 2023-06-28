package MaximumMarksOfStudent;

import java.util.Scanner;

import ItemApplication.Validations;

public class TestApplication {
	static Scanner sc = new Scanner(System.in);
	static Validations validation = new Validations();

	public static void main(String[] args) {
		// create student record
		// and find the maximum marks scored by student
		Student student[] = creatStudentRecord();
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
		// finding maximum marks
		Student max = new Student(0, null, null, 0);
		for (int i = 0; i < student.length; i++) {
			if (max.getScore() <= student[i].getScore()) {
				max = student[i];
			}
		}

		System.out.println("maximum marks scored by the student:\n" + max);
	}

//create method
	private static Student[] creatStudentRecord() {
		System.out.println("enter number of student:");
		int number = sc.nextInt();
		int validNumber = validation.validateId(number);
		Student students[] = new Student[validNumber];
		for (int i = 0; i < students.length; i++) {
			System.out.println("enter id,name,branch,Score:");
			int id = sc.nextInt();
			int validId = validation.validateId(id);
			String name = sc.next();
			String validName = validation.validateString(name);
			String branch = sc.next();
			String validBranch = validation.validateString(branch);
			int score = sc.nextInt();
			int validScore = validation.validateId(score);
			Student student = new Student(validId, validName, validBranch, validScore);
			students[i] = student;
		}
		return students;
	}

}
