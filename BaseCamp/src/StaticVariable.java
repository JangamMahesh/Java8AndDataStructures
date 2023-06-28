
public class StaticVariable {
	int i=10;
	int j;
	public static void main(String[] args) {
		StaticVariable obj1 = new StaticVariable();
		StaticVariable obj2 = new StaticVariable();
		obj2.i=20;
		System.out.println(obj2.i);		
	}
}
