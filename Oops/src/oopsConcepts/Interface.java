package oopsConcepts;

interface parents {
	void run();

	
}
class Interface implements parents {
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj = new Interface();
		obj.run();
	}

	
}

