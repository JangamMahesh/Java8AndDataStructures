package java8.lambda;

public class Employee {
	private String name;
	private String branch;
	private int age;
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
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String name, String branch, int age) {
		super();
		this.name = name;
		this.branch = branch;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", branch=" + branch + ", age=" + age + "]";
	}

}
