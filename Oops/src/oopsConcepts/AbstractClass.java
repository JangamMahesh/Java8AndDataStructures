package oopsConcepts;

abstract class Example {
	abstract int getData();
	void run() {
		System.out.println("in absract run method");
	}
}

public class AbstractClass extends Example {

	
	int getData() {
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass obj = new AbstractClass();
		System.out.println(obj.getData());
		obj.run();
	}

}
