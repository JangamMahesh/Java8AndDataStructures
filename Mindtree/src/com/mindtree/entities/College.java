package com.mindtree.entities;

import java.util.List;

public class College {
	private int cId;
	private String collegeName;
	private float rating;
	private int studentCount;
	private List<Student> s;
	public College() {

	}

	public College(int cId, String collegeName, float rating, int studentCount, List<Student> student) {

		this.cId = cId;
		this.collegeName = collegeName;
		this.rating = rating;
		this.studentCount = studentCount;
		this.s = student;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

	public List<Student> getS() {
		return s;
	}
	public void setS(List<Student> s) {
		this.s = s;
	}
	/*
	 * @Override public String toString() { return "College [cId=" + cId +
	 * ", collegeName=" + collegeName + ", rating=" + rating + ", studentCount=" +
	 * studentCount + ", s=" + Arrays.deepToString(s) + "]"; }
	 */

	@Override
	public String toString() {
		return "College [cId=" + cId + ", collegeName=" + collegeName + ", rating=" + rating + ", studentCount="
				+ studentCount + ", s=" + s + "]";
	}

	

	

}
