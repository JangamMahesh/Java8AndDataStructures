package accessSpecifiers;
import practice.A;
public class B extends A{
	
private int data;
	public B(int data) { 
		//super();
	// TODO Auto-generated constructor stub }
		this.data=data;
	}
	public static void main(String a[]) {
		A ob=new B(5);
	System.out.println(ob.myData);
		
		System.out.println(ob.getData());
		
	}

}
