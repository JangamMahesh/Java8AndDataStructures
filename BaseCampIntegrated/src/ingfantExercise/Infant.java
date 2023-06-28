package ingfantExercise;

public class Infant {
	private int id;
	private String name = "abc";
	private double age;
	private char gender = 'F';
	private double weight = 10;

	public Infant() {

	}

	public Infant(int id, String name, double age, char gender, double weight) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}

	public Infant(int id, double age) {
		this.id = id;
		this.age = age;
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

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
