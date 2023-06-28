package oopsConcepts;

public class StaticBlock {
	static int i;
	int b=10;
	static {
		System.out.println("staitc block " + i++ );
	}

	void nonStatic() {
		System.out.println("first non static block "+ i +" "+ b );
	}

	static {
		System.out.println("2nd static block " + i++);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock obj = new StaticBlock();
		obj.nonStatic();
	}

}
