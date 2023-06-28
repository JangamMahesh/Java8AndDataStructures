package oopsConcepts;

class V {
	int value = 100;

	void start() {
		System.out.println("Vehicle Started");
	}

	static void stop() {
		System.out.println("Vehicle Stopped");
	}
}

class Car extends V {

	int value = 1000;

	@Override
	void start() {
		super.start();
		System.out.println("Car Started");
	}

	static void stop() {
		// super.stop();
		System.out.println("Car Stopped");
	}

	public static void main(String args[]) {

		// Car extends Vehicle
		V vehicle = new Car();
		System.out.println(vehicle.value);
		vehicle.start();
		stop();
	}
}
