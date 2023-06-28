package taxi;

public class User {
	private String name;
	private int age;
	private char gender;
	private String number;
	private int uDistance;
	private int userId;

	public User() {

	}

	public User(int userId, String name, int age, char gender, String number, int uDistance) {
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.number = number;
		this.uDistance = uDistance;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getuDistance() {
		return uDistance;
	}

	public void setuDistance(int uDistance) {
		this.uDistance = uDistance;
	}

	public int getId() {
		return userId;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gender=" + gender + ", number=" + number + ", uDistance="
				+ uDistance + ", userId=" + userId + "]";
	}

	public void setId(int userId) {
		this.age = age;
	}

}
