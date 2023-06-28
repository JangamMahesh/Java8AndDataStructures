package oopsConcepts;

interface Printable {
	void print();
}

interface Showable {
	void show();
}

class Multiple implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		Multiple obj = new Multiple();
		obj.print();
		obj.show();
	}
}
