
enum EnumSinglton {
	instance;

	public void print() {
		System.out.println("enm print method called");
	}
}

public class TestSingleTonEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSinglton.instance.print();
	}

}
