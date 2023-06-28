
class SingleTon {

	//private String str;
	private static SingleTon1 instance;

	public static SingleTon1 getInstance() {
		// is for not created before
		if (instance == null) {
			// if 2 threads access at same time only thread can be used object gets locked
			// once thread 1 realeses lock second thread ll take the access again check the
			// instance this time instance is not null so it ll return first instance itself
			synchronized (SingleTon1.class) {

				if (instance == null) {
					instance = new SingleTon1();
				}
			}
		}
		return instance;
	}

	public int addNumbers(int a, int b) {
		return a + b;
	}

}

class S2 extends SingleTon1 {

	public S2() {

	}

	public int addNumbers(int a, int b) {
		return super.addNumbers(a, b);

	}

}

public class SingleTonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(SingleTon1.getInstance().hashCode());
		// System.out.println(SingleTon.getInstance().hashCode());

		SingleTon1 s2 = new SingleTon1();
		SingleTon1 s3 = new SingleTon1();
		System.out.println(s2.getInstance().hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.getInstance().hashCode());
		System.out.println(s3.hashCode());
		System.out.println(SingleTon1.class.hashCode()); // SingleTon.instance
		// System.out.println(SingleTon.instance);
		System.out.println(SingleTon1.getInstance().addNumbers(1, 1));
		SingleTon1 s1 = new S2();
		System.out.println(s1.addNumbers(1, 3));

	}

}
