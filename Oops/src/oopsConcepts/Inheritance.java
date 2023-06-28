package oopsConcepts;

class parent {
	int name;
	parent() {
		System.out.println("parent constructor");
	}

	void run() {
		System.out.println("in parent");
	}

	public void make() {
		System.out.println("hello");
		// TODO Auto-generated method stub
	}
}

 class Inheritance extends parent {

	int salary;
	Inheritance() {
		super();
		System.out.println("child clasee");

	}

	void run() {
		super.run();
		System.out.println("in child");

	}

//	public void make() {	
//		super.run();
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance obj = new Inheritance();
		obj.run();
	
		//obj.run();
		obj.make();

	}

}
