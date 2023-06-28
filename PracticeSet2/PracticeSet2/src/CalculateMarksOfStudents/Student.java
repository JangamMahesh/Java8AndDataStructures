package CalculateMarksOfStudents;

import java.util.Scanner;

import ItemApplication.Validations;

public class Student {
	private int studentId;
	private String studentName;
	private float marks;
	private boolean secondChance;

	public Student(int studentId, String studentName, boolean secondChance) {
		Scanner sc = new Scanner(System.in);
		Validations validation = new Validations();
		this.studentId = studentId;
		this.studentName = studentName;
		this.secondChance = secondChance;
//		Step2: Based on the value used for second chance instance variable, invoke the appropriate
//		identifyMarks() method.
		/*
		 * if(this.secondChance==true) { float marks1,marks2;
		 * System.out.println("enter marks scored by the student in the first chance");
		 * marks1=sc.nextFloat(); float validMarks1=validation.validateScore(marks1);
		 * System.out.println("enter marks scored by the student in the second chance:"
		 * ); marks2=sc.nextFloat(); float validMarks2=validation.validateScore(marks2);
		 * identifyMarks(validMarks1,validMarks2);
		 * 
		 * } else { float marks; System.out.println("enter the marks:");
		 * marks=sc.nextFloat(); float validMarks=validation.validateScore(marks);
		 * identifyMarks(validMarks);
		 * 
		 * }
		 */

	}

	/*
	 * public void identifyMarks(float score) { marks=score; } public void
	 * identifyMarks(float score1,float score2) { if(score1<score2) marks=score2;
	 * else marks=score1; }
	 */
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public float getMarks() {
		return marks;
	}

	public boolean isSecondChance() {
		return secondChance;
	}

}
