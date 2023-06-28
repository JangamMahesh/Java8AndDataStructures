package java8.lambda;

@FunctionalInterface
interface Yolo {
	public String hello(String name);
	// public void hey();
}



public class Hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Yolo hey = (name) -> {
			return "hey " + name;
		};

		NewHey(hey, "raj");
		System.out.println(hey.hello("mahesh"));

		// counting no of vowels in string
		String str = "interview";
		long count = str.chars().filter(k -> k == 'a' || k == 'e' || k == 'i' || k == 'o' || k == 'u').count();

		System.out.println(count);
	}

	private static void NewHey(Yolo hey, String string) {
		// TODO Auto-generated method stub

		System.out.println(hey.hello(string));
	}

}
