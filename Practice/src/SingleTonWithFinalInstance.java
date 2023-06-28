
class SingleTon1 {

	private static final SingleTon instance = new SingleTon();
	private int id;
	private String name;

	public static SingleTon getInstance() {

		return instance;

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

	public int addNumbers(int a, int b) {
		return a + b;
	}

}

public class SingleTonWithFinalInstance {

	public static void main(String[] args) {

		SingleTon1 singleTon1 = new SingleTon1();
		singleTon1.setId(10);
		singleTon1.setName("Hleo");
		System.out.println(singleTon1.getId());
		System.out.println(singleTon1.getName());
		System.out.println(singleTon1.addNumbers(10, 12));
		System.out.println(singleTon1.hashCode());
		System.out.println(singleTon1.getInstance());
		System.out.println(new SingleTon1().getInstance());

		System.out.println(singleTon1.getInstance());

	}

}
