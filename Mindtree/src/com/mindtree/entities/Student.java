package com.mindtree.entities;

public class Student implements Comparable<Student> {
	private int sId;
	private int marks;
	private String studentName;
	private String collegeName;

	public Student() {

	}

	public Student(int sId, int marks, String studentName, String schoolName) {
		this.sId = sId;
		this.marks = marks;
		this.studentName = studentName;
		this.collegeName = schoolName;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSchoolName() {
		return collegeName;
	}

	public void setSchoolName(String schoolName) {
		this.collegeName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", marks=" + marks + ", studentName=" + studentName + ", collegeName="
				+ collegeName + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return marks > o.getMarks() ? 1 : marks < o.getMarks() ? -1 : 0;
	}

}
