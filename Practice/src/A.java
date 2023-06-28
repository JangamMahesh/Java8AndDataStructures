
class B extends A {
	void print() {
		super.print();
		;
		System.out.println("B");
	}

	void print1() {
		System.out.println("B1");
	}
	private void print2()
	{
		System.out.println("in parent A");
	}
}

class C extends B{
	
	private void print2()
	{
		System.out.println("in C");
	}
}
public class A {

	void print() {
		System.out.println("A");
	}
	private void print2()
	{
		System.out.println("in parent A");
	}

	void print1() {
		System.out.println("A1");
	}
	private static boolean isReverse(int n) {
		
		
		String s=Integer.toString(n);
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt((s.length()/2)+i))
			{
				return false;
			}
		}
		
		return true;
	}

	
	public static void printPrime() {
		for (int i = 2; i < 100; i++) {
			boolean flag = true;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					flag=false;				break;
				}
			}
			if (flag) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		
		System.out.println(A.isReverse(1221));

		A.printPrime();
		
		

		A a = new B();
		a.print();
	//	a.print2();
		
		// a.print1();
		B b = new B();
		b.print1();
		
		B c=new C();
		C c1=new C();
		
	
	}


}
