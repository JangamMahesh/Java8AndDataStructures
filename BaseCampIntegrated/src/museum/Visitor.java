package museum;

public class Visitor {
	private String name;
	private int age;
	private char gender;
	private int fee;
	private String date;

	public Visitor() {

	}

	public Visitor(String name, int age, char gender, String date) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
