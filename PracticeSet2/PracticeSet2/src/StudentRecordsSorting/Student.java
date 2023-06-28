package StudentRecordsSorting;

public class Student {
	private long studentId;
	private String studentName;
	private String studentBranch;

	public Student(long studentId, String studentName, String studentBranch) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentBranch=" + studentBranch
				+ "]";
	}

}
