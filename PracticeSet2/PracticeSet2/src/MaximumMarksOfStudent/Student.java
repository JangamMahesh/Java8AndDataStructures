package MaximumMarksOfStudent;

public class Student {
	private int id;
	private String name;
	private String branch;
	private int score;
	
	public Student(int id, String name, String branch, int score) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String toString() {
		return "Student [Id=" + id + ", Name=" + name + ", Branch=" + branch + ", Score=" + score + "]";
	}
	
	

}
