package java8.lambda;

interface Hii{
	void hello();
	default void bye() {
		System.out.println("bye");
	}
	static void Hey()
	{
		System.out.println("heyy");
	}
}

class Chill implements Hii{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("chill hi");
		Hii.super.bye();
		Hii.Hey();	}
}
public class DefaultMethods {

	public static void main(String[] args) {
		Hii h=new Chill();
		//h.bye();
	
		h.hello();
		Hii.Hey();
		
		
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+ b);
	}
	
}
